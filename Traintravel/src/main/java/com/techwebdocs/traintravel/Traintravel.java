/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.traintravel;

/**
 *
 * @author HP
 */
public class Traintravel {

    public static void main(String[] args) {
                // (i) Calculate the number of stops for passenger loading/unloading
        int totalDistance = 10000; // km
        int distanceBetweenStops = 150; // km
        int numPassengerStops = totalDistance / distanceBetweenStops;
        System.out.println("Number of stops for passenger loading/unloading: " + numPassengerStops);

        // (ii) Calculate the total travel time from Kampala to Kabale
        int speed = 250; // km/h
        int stopTime = 5; // minutes
        double travelTime = (double) totalDistance / speed; // hours
        double totalStopTime = numPassengerStops * stopTime; // minutes
        double totalTravelTime = travelTime * 60 + totalStopTime; // minutes
        System.out.println("Total travel time from Kampala to Kabale: " + totalTravelTime + " minutes");

        // (iii) Calculate the travel time from Kabale to Kampala with only refueling stops
        int distanceBetweenRefuelingStops = 200; // km
        int numRefuelingStops = totalDistance / distanceBetweenRefuelingStops;
        double refuelingStopTime = numRefuelingStops * stopTime; // minutes
        double travelTimeBack = travelTime * 60 + refuelingStopTime; // minutes
        System.out.println("Total travel time from Kabale to Kampala: " + travelTimeBack + " minutes");

        // (iv) Calculate the arrival time of the second coach in Kampala
        double secondCoachSpeed = 225.5; // m/s
        double secondCoachSpeedKmh = secondCoachSpeed * 3.6; // km/h
        double secondCoachTravelTime = (double) totalDistance / secondCoachSpeedKmh; // hours
        double secondCoachArrivalTime = 9 + secondCoachTravelTime; // hours
        System.out.println("Arrival time of the second coach in Kampala: " + secondCoachArrivalTime + " hours");
    }
}

   
