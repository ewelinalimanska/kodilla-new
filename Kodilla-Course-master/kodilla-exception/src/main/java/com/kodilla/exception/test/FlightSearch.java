package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static javafx.application.Application.launch;

public class FlightSearch {

    private Map<String, Boolean> airports = new HashMap<>();

    public FlightSearch() {
        airports.put("KEF", true);
        airports.put("KTW", true);
        airports.put("JFK", true);
        airports.put("WAW", false);
        airports.put("TXL", false);
    }

    public String findFlight(Flight flight) throws RouteNotFoundException {

        List<String> filterAirports = airports.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Boolean.TRUE))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        boolean arrivalAirportPossible = filterAirports.contains(flight.getArrivalAirport());
        boolean departureAirportPossible = filterAirports.contains(flight.getDepartureAirport());

        if (arrivalAirportPossible && departureAirportPossible) {
            return "Flight found!";
        } else {
            throw new RouteNotFoundException("Flight no possible");
        }

    }
}
