package com.kodilla.exception.test;

public class App {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("JFK", "KEF");

        try {
            String result = flightSearch.findFlight(flight);
            System.out.println(result);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
