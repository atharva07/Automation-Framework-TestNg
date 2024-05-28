package com.automation.Tests.FlightReservation.model;

public record FlightReservationTestData(String firstName, String lastName,
                                        String email, String password,
                                        String street, String city,
                                        String zip, String passengerCount,
                                        String expectedPrice) {             
}
