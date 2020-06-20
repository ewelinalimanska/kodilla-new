package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.List;

public class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigInteger getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(a -> a.getPeopleQuantity())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
