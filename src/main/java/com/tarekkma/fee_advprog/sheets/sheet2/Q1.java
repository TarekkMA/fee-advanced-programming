package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.Scanner;

/**
 * Q1. Write a Java program to get a number from the user and print whether it is positive or negative.
 * Test Data
 * Input number: 35
 * Expected Output : Number is positive
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = scanner.nextInt();
        System.out.println("Number is " + (number > 0 ? "Positive" : "Negative"));
    }

}