package com.tarekkma.fee_advprog.sheets.sheet1;

import java.util.Scanner;

/**
 * Q4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 * Test Data
 * Input a degree in Fahrenheit: 212
 * Expected Output:
 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }

}