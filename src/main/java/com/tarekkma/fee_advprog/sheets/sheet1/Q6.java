package com.tarekkma.fee_advprog.sheets.sheet1;

import java.util.Scanner;

/**
 * Q6. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three
 * numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
 * and miles per hour (hint: 1 mile = 1609 meters).
 * Test Data
 * Input distance in meters: 2500
 * Input hour: 5
 * Input minutes: 56
 * Input seconds: 23
 * Expected Output :
 * Your speed in meters/second is 0.11691531
 * Your speed in km/h is 0.42089513
 * Your speed in miles/h is 0.26158804
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float timeSeconds;
        float mps,kph, mph;
        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();
        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();
        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();
        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);
        scanner.close();
    }

}