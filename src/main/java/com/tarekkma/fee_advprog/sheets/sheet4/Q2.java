package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q2. Write a Java method to check a given number is even or odd.
 * Test Data:
 * Input any number: 5
 * Expected Output: The entered number is odd.
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = scanner.nextInt();

        System.out.printf("The entered number is %s.", num % 2 == 0 ? "even" : "odd");
    }

}