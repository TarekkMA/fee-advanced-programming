package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q5. Create a class named “FormatNumber” and place it in the package “com.digital.numberspackage”,
 * the FormatNumber class contains the “DectoBinary” method to convert decimal number to binary
 * number.
 * Test Data :
 * Input any decimal number : 65
 * Expected Output :
 * The Binary value is: 1000001
 */
public class Q5 {

    public static class FormatNumber {
        static String DectoBinary(int number) {
            StringBuilder res = new StringBuilder();
            int rem;
            while (number != 0) {
                rem = number % 2;
                res.append(rem == 0 ? "0" : "1");
                number /= 2;
            }
            return res.toString();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any decimal number : ");
        int num = scanner.nextInt();
        System.out.printf("The Binary value is: %s",FormatNumber.DectoBinary(num));
    }

}