package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.List;
import java.util.Scanner;

/**
 * Q6. Write a Java program that takes the user to provide a single character from the alphabet. Print
 * Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or
 * A and Z), or is a string of length > 1, print an error message.
 * Test Data
 * Input an alphabet: p
 * Expected Output : Input letter is Consonant
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        if (input.length() != 1) {
            System.err.println("Input length must be one character");
            System.exit(1);
        }

        char c = input.charAt(0);
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            System.err.println("Input character must be in `a-z` range or in `A-Z` range");
            System.exit(1);
        }

        if(List.of('a','e','i','o','u').contains(Character.toLowerCase(c))){
            System.out.println("Input letter is Vowel");
        }else {
            System.out.println("Input letter is Consonant");
        }
    }

}