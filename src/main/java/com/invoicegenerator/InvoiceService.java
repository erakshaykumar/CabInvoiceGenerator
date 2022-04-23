/**
 * @Purpose: Given Distance And Time, The Invoice Generator Should Return The Total Fare For The Journey
 * Cost- Rs 10 Per KiloMeter + Rs 1 Per Minute. Minimum Fare- Rs 5
 * Take In Multiple Rides,And Calculate The Aggregate Total For All
 * Return The Following As A Part Of Invoice:-
 * Total Number Of Rides, Total Fare, Average Fare Per ride
 * @File: Cab Invoice Generator
 * @Author: Akshay Kumar
 */
package com.invoicegenerator;

public class InvoiceService {
    private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    /**
     @Purpose: Calculate Fare
     @Param: Distance, Time
     @Return: Fare
     */
    public double calculateFare(double distance, int time) {
        double fare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(fare, MINIMUM_FARE);
    }

    /**
     @Purpose: Calculate Fare
     @Param: Ride Array Having Distance And Time
     @Return: Rides-Length, Fare
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double fare = 0;
        for (Ride ride : rides) {
            fare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, fare);
    }


}

