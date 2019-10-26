package com.tarekkma.fee_advprog.sheets.sheet1;

import java.util.Scanner;

/**
 * Q7. Write a Java program to break an integer into a sequence of individual digits.
 * Test Data
 * Input six non-negative digits: 123456
 * Expected Output :
 * 1 2 3 4 5 6
 */
public class Q7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }

}