/**@Purpose: Given Distance And Time, The Invoice Generator Should Return The Total Fare For The Journey
 * Cost- Rs 10 Per KiloMeter + Rs 1 Per Minute. Minimum Fare- Rs 5
 * Take In Multiple Rides,And Calculate The Aggregate Total For All
 * @File: Cab Invoice Generator
 * @Author: Akshay Kumar
 */
package com.invoicegenerator;


import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    public static InvoiceGenerator invoicegenerator = new InvoiceGenerator();

    /**
     * Rigorous Test :- Given Distance And Time Return Total Fare Equality Check
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoicegenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    /**
     * Rigorous Test :- Given Less Distance And Less Time Return Minimum Fare Equality Check
     */
    @Test
    public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoicegenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    /**
     * Rigorous Test :- Given Multiple Rides Return Total Fare Equality Check
     */
    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
        double fare = invoicegenerator.calculateFare(rides);
        Assert.assertEquals(30, fare, 0.0);
    }
}