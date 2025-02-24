package org.bukola.java.test.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
    @Test
    public void testPassengerCreation() {
        Passenger passenger = new Passenger("123-45-6789", "Bukola Omokehinde", "UK");
        assertNotNull(passenger);
    }

    @Test
    public void testInvalidSsn() {
        assertThrows(RuntimeException.class, () -> {
            Passenger passenger = new Passenger ("123-456-789", "Bukola Omokehinde", "US");
        });
    }
}
