package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightsList {

  private Map<String, Set<Flight>> flights = new HashMap<>();

  public FlightsList() {

      Set<Flight> waw = new HashSet<>();
      waw.add(new Flight("KTW", "WAW"));
      waw.add(new Flight("JFK", "WAW"));
      waw.add(new Flight("CDG", "WAW"));

      Set<Flight> krk = new HashSet<>();
      krk.add(new Flight("YYZ", "KRK"));
      krk.add(new Flight("JFK", "KRK"));
      krk.add(new Flight("WAW", "KRK"));

      Set<Flight> gda = new HashSet<>();
      gda.add(new Flight("BOS", "GDA"));
      gda.add(new Flight("KRK", "GDA"));
      gda.add(new Flight("CDG", "GDA"));

      flights.put("WAW", waw);
      flights.put("KRK",krk);
      flights.put("GDA", gda);
  }

    public Map<String, Set<Flight>> getFlights() {
        return flights;
    }
}
