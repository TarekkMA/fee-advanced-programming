package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q4. Write a Java method to find the sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5.
 * Test Data:
 * Enter the number of the operands: 5
 * Expected Output: The sum of the series is: 34
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the operands: ");
        int terms = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += fact(i) / ((double) i);
        }

        System.out.println("The sum of the series is: " + sum);


    }

    private static int fact(int i) {
        return i == 0 ? 1 : i * fact(i - 1);
    }


}