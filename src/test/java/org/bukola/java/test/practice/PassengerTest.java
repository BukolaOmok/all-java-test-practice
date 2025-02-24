package org.bukola.java.test.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    public void testPassengerCreation() {
        Passenger passenger = new Passenger("123-45-6789", "Bukola Omokehinde", "US");
        assertNotNull(passenger);
    }

    @Test
    public void testInvalidSsn() {
        assertThrows(RuntimeException.class, () -> {
            Passenger passenger = new Passenger ("123-45-6789", "Bukola Omokehinde", "US");
            passenger.setIdentifier("123-456-789");
        });
    }

    @Test
    public void testValidSSN () {
        Passenger passenger = new Passenger("123-45-6789", "Bukola Omokehinde", "US");
        passenger.setIdentifier("123-45-6789");
        assertEquals("123-45-6789", passenger.getIdentifier());
    }

    @Test
    public void testInvalidCountryCode () {
        assertThrows(RuntimeException.class, () -> {
            Passenger passenger = new Passenger("123-45-678", "Bukola Omokehinde", "US");
            passenger.setCountryCode("GJ");
        });
    }

    @Test
    public void testValidCountryCode () {
        Passenger passenger = new Passenger("123-45-6789", "Bukola Omokehinde", "GB");
        passenger.setCountryCode("US");
        assertEquals("US", passenger.getCountryCode());
    }


}
