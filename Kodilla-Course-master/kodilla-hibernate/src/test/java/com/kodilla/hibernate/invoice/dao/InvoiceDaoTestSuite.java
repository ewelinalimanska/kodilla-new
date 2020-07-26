package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){

        //given
        Product pen = new Product("Pen");
        Product book = new Product("Book");
        Product computer = new Product("Computer");

        Item item1 = new Item(pen, new BigDecimal(1.5), 2, new BigDecimal(3));
        Item item2 = new Item(book, new BigDecimal(25), 4, new BigDecimal(100));
        Item item3 = new Item(computer, new BigDecimal(3000), 1, new BigDecimal(3000));

        Invoice invoice1 = new Invoice("FV/01/01/2020");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        item1.setProduct(pen);
        item2.setProduct(book);
        item3.setProduct(computer);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        //when
        int item1ID = item1.getId();
        int item2ID = item2.getId();
        int item3ID = item3.getId();

        int invoiceID = invoice1.getId();

        //then
        Assert.assertNotEquals(0, item1ID);
        Assert.assertNotEquals(0, item2ID);
        Assert.assertNotEquals(0, item3ID);
        Assert.assertNotEquals(0, invoiceID);

        //cleanUp
        try {
            itemDao.deleteById(item1ID);
            itemDao.deleteById(item2ID);
            itemDao.deleteById(item3ID);
            itemDao.deleteById(invoiceID);
        } catch (Exception e){
        }
    }
}
