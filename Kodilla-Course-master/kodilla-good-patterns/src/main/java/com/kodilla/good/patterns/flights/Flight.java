package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    private String arrival;
    private String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getArrival(), flight.getArrival()) &&
                Objects.equals(getDeparture(), flight.getDeparture());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
