package org.bukola.java.test.practice;

public class Main {

    public static void main(String[] args) {
       Passenger passenger = new Passenger("123-45-6789", "Bukola Omokehinde", "UK");
       passenger.recordToSystem();

       Flight flight = new Flight("BA884", 100);
       flight.setOrigin("London");
       flight.setDestination("Tokyo");
       flight.sellTicket();
       flight.takeOff();
       flight.land();
    }
}
