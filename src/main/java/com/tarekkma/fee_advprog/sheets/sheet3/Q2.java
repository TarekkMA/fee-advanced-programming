package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Q2. Write a Java program to calculate factorial of an integer number.
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = scanner.nextInt();

        System.out.printf("%d! = %d\n",num,fact(num));
    }

    private static int fact(int i){
        if(i == 0)return 1;
        return i * fact(i-1);
    }

}