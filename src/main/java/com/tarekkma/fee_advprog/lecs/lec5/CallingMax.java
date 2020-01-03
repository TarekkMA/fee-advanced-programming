package com.tarekkma.fee_advprog.lecs.lec5;

public class CallingMax {

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("Max of " + i + "," + j + " is " + k);
    }
}
