package com.kodilla.stream.world;

import java.util.List;

public class Continent {

    private List<Country> countries;
    private String countryName;


    public Continent(List<Country> countries, String countryName) {
        this.countries = countries;
        this.countryName = countryName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getCountryName() {
        return countryName;
    }
}
