package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Q2. Take three numbers from the user and print the greatest number.
 * Test Data
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * Expected Output : The greatest: 87
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();

        int max = Collections.max(Arrays.asList(num1,num2,num3));

        System.out.printf("Input the 3rd number: %d\n",max);
    }

}