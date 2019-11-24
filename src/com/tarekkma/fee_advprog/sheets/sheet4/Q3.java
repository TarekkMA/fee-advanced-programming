package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q3. Write a Java method to compute the sum of the digits in an integer.
 * Test Data:
 * Input an integer: 25
 * Expected Output: The sum is 7
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String num = scanner.next();
        int sum = 0;
        for (char c : num.toCharArray()) {
            sum += Integer.parseInt(Character.toString(c));
        }
        System.out.printf("The sum is %d",sum);
    }

}