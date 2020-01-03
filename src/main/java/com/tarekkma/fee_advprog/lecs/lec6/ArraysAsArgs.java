package com.tarekkma.fee_advprog.lecs.lec6;

public class ArraysAsArgs {
    public static void main(String[] args) {
        int x = 1;
        int[] y = {1};

        increment(x,y);

        System.out.println("x = " + x);
        System.out.println("y[0] = " + y[0]);

        //array element 0 will be 2
        //while x will still be 1
    }

    public static void increment(int num,int[] arr){
        arr[0]++;
        num++;
    }
}
