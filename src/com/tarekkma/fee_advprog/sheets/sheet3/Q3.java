package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Scanner;

/**
 * Q3. Write a Java program to find the sum of the series [1 +11 + 111 + 1111 + .. ] with n terms.
 * Test Data :
 * Input the number of terms : 5
 * Expected Output :
 * 1 + 11 + 111 + 1111 + 11111
 * The Sum is : 12345
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int terms = scanner.nextInt();

        long sum = 0;
        int c = 0;
        for (String s = "1"; c < terms; s+="1",c++) {
            sum += Long.parseLong(s);
            System.out.print(s);
            if(c + 1 != terms){
                System.out.print(" + ");
            }
        }
        System.out.println();

        System.out.printf("The Sum is : %d\n",sum);
    }

}