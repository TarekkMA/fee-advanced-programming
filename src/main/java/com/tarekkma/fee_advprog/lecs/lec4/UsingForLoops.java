package com.tarekkma.fee_advprog.lecs.lec4;

public class UsingForLoops {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 0.01;i <= 1; i += 0.01){
            sum += i;
        }
        System.out.println(sum);
    }
}
