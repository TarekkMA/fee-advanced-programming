package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Scanner;

/**
 * Q6. Write a program in C to print the Floyd's Triangle.
 * Test Data:
 * Enter number of rows: 5
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        boolean rb = true;
        for (int i = 0; i < rows; i++, rb = !rb) {
            boolean cb = rb;
            for (int j = 0; j <= i; j++, cb = !cb) {
                System.out.print(cb ? 1 : 0);
            }
            System.out.println();
        }
    }

}