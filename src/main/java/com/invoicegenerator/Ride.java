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

public class Ride {
    public double distance;
    public int time;

    //Generate Constructor With Distance And Time As Parameter
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
