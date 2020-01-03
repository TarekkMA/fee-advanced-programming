package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.Scanner;

/**
 * Q4. Write a Java program that reads in two floating-point numbers and tests whether they are the
 * same up to three decimal places.
 * Test Data
 * Input floating-point number: 1256
 * Input floating-point another number: 3254
 * Expected Output : They are different
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();
        boolean isEqual = isDoublesEqual(num1,num2,3);

        System.out.println("They are " + (isEqual ? "equal" : "different"));
    }

    private static boolean isDoublesEqual(double f1,double f2,int decimalPlaces){
        final double THRESHOLD = Math.pow(0.1,decimalPlaces);
        return Math.abs(f1 - f2) < THRESHOLD;
    }

}