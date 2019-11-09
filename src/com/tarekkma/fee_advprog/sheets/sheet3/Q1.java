package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Scanner;

/**
 * Q1. Write a Java program to read 10 numbers from keyboard and find their sum and average.
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, avg, sum = 0;
        int numberCount = 10;
        for (int i = 0; i < numberCount; i++) {
            x = scanner.nextInt();
            sum += x;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Avg is : " + sum / numberCount);
    }

}