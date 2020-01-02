package com.tarekkma.fee_advprog.sheets.sheet5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Q3. Write a Java program to generate 100 letters randomly and assign to an array of characters. Count the
 * occurrence of each letter in the array by using the methods of Q1.
 */
public class Q3 {

    final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    static int randomFromRange(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    static char[] genRandomChars(int count) {
        char[] res = new char[count];
        for (int i = 0; i < count; i++) {
            res[i] = alphabet[randomFromRange(0, alphabet.length - 1)];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] randomChars = genRandomChars(100);
        System.out.println("Random String:" + String.copyValueOf(randomChars));
        System.out.print("Enter a Character to count:");
        char target = scanner.next().charAt(0);
        int count = Q1.ArrayMethod.countChar(randomChars, target);
        System.out.println("Char:" + target + " was found " + count + " times.");
    }

}