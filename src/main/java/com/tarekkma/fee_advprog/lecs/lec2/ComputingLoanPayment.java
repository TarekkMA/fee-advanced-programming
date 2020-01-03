package com.tarekkma.fee_advprog.lecs.lec2;

import java.util.Scanner;

public class ComputingLoanPayment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Interest Rate:");
        double rate = s.nextDouble();
        System.out.print("Enter Years:");
        int years = s.nextInt();
        System.out.print("Enter Loan Amount:");
        double amount = s.nextDouble();

        double result =
                (amount * rate) / (1 - (1 / Math.pow(1 + rate, years * 12)));

        System.out.println("result = " + result);
    }
}
