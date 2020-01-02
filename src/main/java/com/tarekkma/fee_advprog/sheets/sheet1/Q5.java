package com.tarekkma.fee_advprog.sheets.sheet1;

import java.util.Scanner;

/**
 * Q5. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the
 * integer.
 * Test Data
 * Input an integer between 0 and 1000: 565
 * Expected Output :
 * The sum of all digits in 565 is 16
 */
public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }

}