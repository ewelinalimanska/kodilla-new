package com.kodilla.kodillapatterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class ShopService {

    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) { //stworzenie nowego zamówienia
        if (authenticator.isAuthenticator(userId)) { //sprawdzenie czy User jest autoryzowany
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            //stworzenie nowego Ordera i dodanie go do orders
            orders.add(new Order(productService, maxOrder +1, userId));
            //zwrócenie id zautoryzowanego zamówienia
            return maxOrder + 1;
        }else{
            //brak autoryzacji Usera
            return -1L;
        }
    }
    public void addItem(Long orderId, Long productId, double qty){ //dodanie itema do zamówienia
        orders.stream()
                //wyszukanie Ordera po id
                .filter(o -> o.getOrderId().equals(orderId))
                //dodanie itema do wyszukanego Ordera
                .forEach(o -> o.getItems().add(new Item(productId,qty)));
    }

    public boolean removeItem(Long orderId, Long productId) { //usuwanie itema z ordera
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId)) // wyszukanie ordera
                .iterator(); //iterowanie listy ordera
        while (orderIterator.hasNext()) { //czy są jeszcze elementy w kolekcji
            Order theOrder = orderIterator.next(); //zwraca kolejny element
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n < orderSize; n++) {
                if (theOrder.getItems().get(n).getProductId().equals(productId)) {
                    theOrder.getItems().remove(n); // jeśli obiekt został znaleziony-usunięcie go
                    return true;
                }
            }
        }
        return false; //jeśli zamówienie o takim id lub produkt o takim id nie zostały znalezione
    }

    public BigDecimal calculateValue(Long orderId){ //obliczenie wartości Ordera
        Iterator<Order> orderIterator = orders.stream()
                //znalezienie zamówienia
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator(); //iterowanie listy zamówienia
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;//jeżeli zamówienie nie zostanie znalezione zwracane jest 0
    }

    public boolean doPayment(Long orderId){ // płatność za zamówienia
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            if (theOrder.isPaid()){
                return true;
            }else {
                Random generator = new Random();//losowe ustawienie płatności
                theOrder.setPaid(generator.nextBoolean()); //czemu set?
                return theOrder.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId){ //weryfikacja zamówienia
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            boolean result = theOrder.isPaid();
            Random generator = new Random(); // losowo weryfikacja
            if (!theOrder.isVerified()){
                theOrder.setVerified(result && generator.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) { //zatwierdzenie zamówienia
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator(); //znalezienie zamówienia
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isVerified()) {
                theOrder.setSubmitted(true); //sprawdzenie czy jest zweryfikowane
            }
            return true;
        }
        return false;
    }

    public void cancelOrder(Long orderId){ //usuwa z listy zamówień otwarte wcześniej zamówienie o danym id
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator(); //znalezienie zamówienia
        while (orderIterator.hasNext()){
            Order theOrder = orderIterator.next();
            orders.remove(theOrder);
        }
    }
}
