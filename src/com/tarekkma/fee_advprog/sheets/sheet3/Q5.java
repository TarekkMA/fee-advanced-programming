package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Scanner;

/**
 * Q5. Write a program in C to display the pattern like a pyramid using asterisk and each row contain an
 * odd number of asterisks.
 * Test Data:
 * Enter number of rows: 3
 * *
 * ***
 * *****
 */
public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int width = rows * 2 - 1;
        int wStart = -width / 2;
        int wEnd = width / 2;
        for (int i = 0; i < rows; i++) {
            for (int j = wStart; j <= wEnd; j++) {
                System.out.print(Math.abs(j) <= i ? "*" : " ");
            }
            System.out.println();
        }
    }

}