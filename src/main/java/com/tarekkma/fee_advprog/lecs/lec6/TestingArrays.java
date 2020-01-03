package com.tarekkma.fee_advprog.lecs.lec6;

import java.util.Scanner;

public class TestingArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for (int i : arr) {
            if(i > max)
                max = i;
        }

        int count = 0;
        for (int i : arr) {
            if(i == max)
                count++;
        }

        System.out.println("Max is " + max + " and occurrence count is " + count);
    }
}
