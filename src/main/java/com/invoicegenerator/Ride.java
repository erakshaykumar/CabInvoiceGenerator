/**@Purpose: Given Distance And Time, The Invoice Generator Should Return The Total Fare For The Journey
 * Cost- Rs 10 Per KiloMeter + Rs 1 Per Minute. Minimum Fare- Rs 5
 * Take In Multiple Rides,And Calculate The Aggregate Total For All
 * @File: Cab Invoice Generator
 * @Author: Akshay Kumar
 */
package com.invoicegenerator;

public class Ride {
    public double distance;
    public int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
