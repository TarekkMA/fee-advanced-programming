package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.Scanner;

/**
 * Q3. Write a Java program that keeps a number from the user between 1 and 7 and displays the name
 * of the weekday.
 * Test Data
 * Input number: 3
 * Expected Output : Wednesday
 */
public class Q3 {

    public static void main(String[] args) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = scanner.nextInt();

        System.out.println(days[day-1]);
    }

}