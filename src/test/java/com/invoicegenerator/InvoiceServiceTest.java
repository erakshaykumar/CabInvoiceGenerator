/**
 * @Purpose: Given Distance And Time, The Invoice Generator Should Return The Total Fare For The Journey
 * Cost- Rs 10 Per KiloMeter + Rs 1 Per Minute. Minimum Fare- Rs 5
 * Take In Multiple Rides,And Calculate The Aggregate Total For All
 * Return The Following As A Part Of Invoice:-
 * Total Number Of Rides, Total Fare, Average Fare Per ride
 * Given User ID, Invoice Service Gets List Of Rides From Ride Repository, Returns Invoice.
 * @File: Cab Invoice Generator
 * @Author: Akshay Kumar
 */
package com.invoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    public static InvoiceService invoiceService = new InvoiceService();

    /**
     * Rigorous Test :- Given Distance And Time Return Total Fare Equality Check
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    /**
     * Rigorous Test :- Given Less Distance And Less Time Return Minimum Fare Equality Check
     */
    @Test
    public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    /**
     * Rigorous Test :- Given Multiple Rides Return Invoice Summary Equality Check
     */
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        InvoiceSummary summary = invoiceService.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    /**
     * Rigorous Test :- Given User And Rides Return Invoice Summary Check
     */
    @Test
    public void givenUserAndRides_ShouldReturnInvoiceSummary() {
        String user1 = "Akshay";
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        invoiceService.addRides(user1, rides);
        String user2 = "Kumar";
        Ride[] rides1 = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        invoiceService.addRides(user2, rides1);
        InvoiceSummary summary = invoiceService.getInvoiceService(user1);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);

    }

}