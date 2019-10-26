package com.tarekkma.fee_advprog.sheets.sheet1;

import java.util.Scanner;

/**
 * Q3. Write a Java program to compute the area of a hexagon.
 * Area of a hexagon = (6 *s^2)/(4*tan(π/6)), where s is the length of a side
 * Test Data
 * Input the length of a side of the hexagon: 6
 * Expected Output
 * The area of the hexagon is: 93.53074360871938
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
    }

    private static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }

}