package com.kodilla.good.patterns.flights;

public class FlightMain {

    public static void main(String[] args) {

        FlightProcessor flightProcessor = new FlightProcessor(new FlightsList());

        flightProcessor.findAllFlightsFrom("WAW");
        flightProcessor.findAllFlightsTo("CDG");
        flightProcessor.findTransitFlights(new Flight("WAW", "GDA"));
    }
}
