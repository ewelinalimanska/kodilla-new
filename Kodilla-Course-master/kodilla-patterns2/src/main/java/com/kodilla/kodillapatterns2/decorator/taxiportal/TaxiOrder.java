package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {

    BigDecimal getCost(); // łączna kwota za przejazd
    String getDescription(); //opis zamówienia widoczny na fv lub paragonie
}
