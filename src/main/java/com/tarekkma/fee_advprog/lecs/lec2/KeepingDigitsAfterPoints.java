package com.tarekkma.fee_advprog.lecs.lec2;

import java.util.Scanner;

public class KeepingDigitsAfterPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales Tax:");
        double taxRate = scanner.nextDouble();
        System.out.print("Enter Price");
        double price = scanner.nextDouble();

        price = price * taxRate;

        int pr = (int) (price * 100);
        double price2Decimals = pr / 100.0;

        System.out.println("Sales Tax: " +price2Decimals);
    }
}
