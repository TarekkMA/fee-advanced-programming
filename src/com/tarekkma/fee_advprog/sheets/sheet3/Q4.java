package com.tarekkma.fee_advprog.sheets.sheet3;

import java.util.Scanner;

/**
 * Q4. Write a Java program to find the sum of the series [ 1- X^2/2! + X^4/4! - .........] with n terms.
 * Test Data :
 * Input the Value of x :4
 * Input the number of terms : 6
 * Expected Output :
 * the sum = -0.57854
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the Value of x : ");
        int xVal = scanner.nextInt();
        System.out.print("Input the number of terms : ");
        int terms = scanner.nextInt();

        double sum = 1;
        for (int i = 1; i <= terms; i++) {
            int sign = (i%2==0) ? 1 : -1;
            double num = Math.pow(xVal,i*2);
            double dom = fact(i*2);
            sum += sign * (num / dom);
        }

        System.out.println("The sum = " + sum);


    }

    private static int fact(int i){
        if(i == 0)return 1;
        return i * fact(i-1);
    }


}