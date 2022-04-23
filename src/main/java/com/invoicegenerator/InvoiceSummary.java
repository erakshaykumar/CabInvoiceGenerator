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

public class InvoiceSummary {
    private final int noOfRides;
    private final double totalFare;
    private final double averageFare;

    //Generate Constructor With Number Of Rides, Total Fare As Parameters
    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.noOfRides;
    }

    //Generate equals() Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }

    //Generate toString() Method
    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "noOfRides=" + noOfRides +
                ", totalFare=" + totalFare +
                ", averageFare=" + averageFare +
                '}';
    }
}
