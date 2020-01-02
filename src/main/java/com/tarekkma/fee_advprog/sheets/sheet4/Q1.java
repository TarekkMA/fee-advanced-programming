package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q1. Write a Java method to find the square of specific number.
 * Test Data:
 * Input any number for square: 20
 * Expected Output: The square of 20 is: 400.00
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any number for square:");
        int num = scanner.nextInt();
        System.out.printf("The square of %d is: %d",num,num*num);
    }

}