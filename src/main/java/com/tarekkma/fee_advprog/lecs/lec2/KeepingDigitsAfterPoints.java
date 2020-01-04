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

        System.out.println("Sales Tax: " + ((int) (price * 100)) / 100.0);
    }
}
