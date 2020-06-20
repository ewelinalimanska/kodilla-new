package com.kodilla.good.patterns.flights;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {

    private FlightsList flightsList;

    public FlightProcessor(FlightsList flightsList) {
        this.flightsList = flightsList;
    }

    public void findAllFlightsFrom(String departureCity){

        System.out.println("All flights from: " + departureCity);

        flightsList.getFlights().get(departureCity)
                .forEach(System.out::println);

    }

    public void findAllFlightsTo(String arrivalsCity){

        System.out.println("All flights to: " + arrivalsCity);

        flightsList.getFlights().values().stream()
                .flatMap(Collection::stream)
                .filter(f -> arrivalsCity.equals(f.getArrival()))
                .forEach(System.out::println);

    }

    public void findTransitFlights(Flight flight){

        System.out.println("All transit flights from " + flight.getArrival() + " to " + flight.getDeparture());

        Set<Flight> flightsFrom = flightsList.getFlights().get(flight.getDeparture());

        Set<Flight> flightsTo = flightsList.getFlights().values().stream()
                .flatMap(Collection::stream)
                .filter(f -> flight.getArrival().equals(f.getArrival()))
                .collect(Collectors.toSet());

        for (Flight theFlight : flightsFrom) {
            flightsTo.stream()
                    .filter(f -> f.getDeparture().equals(theFlight.getArrival()))
                    .forEach(f -> System.out.println(f + " " + theFlight));

        }

    }
}
