package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //given

        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("Ghana", new BigInteger("1000")));
        africaCountries.add(new Country("Egypt", new BigInteger("1000")));
        africaCountries.add(new Country("Nigeria", new BigInteger("1000")));

        Continent africa = new Continent(africaCountries,"Africa");

        List<Country> asiaCountries = new ArrayList<>();

        asiaCountries.add(new Country("China", new BigInteger("1000")));
        asiaCountries.add(new Country("India", new BigInteger("1000")));
        asiaCountries.add(new Country("Indonesia", new BigInteger("1000")));

        Continent asia = new Continent(asiaCountries,"Asia");

        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Spain", new BigInteger("1000")));
        europeCountries.add(new Country("Iceland", new BigInteger("1000")));
        europeCountries.add(new Country("Germany", new BigInteger("1000")));

        Continent europe = new Continent(europeCountries,"Europe");

        List<Continent> continents = new ArrayList<>();

        continents.add(africa);
        continents.add(asia);
        continents.add(europe);
        World world = new World(continents);
        //when
        BigInteger result = world.getPeopleQuantity();

        //then
        Assert.assertEquals( new BigInteger("9000"), result);
        System.out.println(result);

    }

}
