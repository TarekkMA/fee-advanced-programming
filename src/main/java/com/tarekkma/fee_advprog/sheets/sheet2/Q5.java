package com.tarekkma.fee_advprog.sheets.sheet2;

import java.util.Scanner;

/**
 * Q5. Write a Java program to find the number of days in a month.
 * Test Data
 * Input a month number: 2
 * Input a year: 2016
 * Expected Output : February 2016 has 29 days
 */
public class Q5 {

    interface DaysInMonthFunc {
        int calcDays(int year);
    }

    static class Month {
        final DaysInMonthFunc daysInMonthFunc;
        final String name;

        Month(String name, DaysInMonthFunc daysInMonthFunc) {
            this.daysInMonthFunc = daysInMonthFunc;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Month[] months = {
                new Month("January", (y) -> 31),
                new Month("February", (y) -> (y % 4 == 0) ? 29 : 28),
                new Month("March", (y) -> 31),
                new Month("April", (y) -> 30),
                new Month("May", (y) -> 31),
                new Month("June", (y) -> 31),
                new Month("July", (y) -> 31),
                new Month("August", (y) -> 31),
                new Month("September", (y) -> 30),
                new Month("October", (y) -> 31),
                new Month("November", (y) -> 30),
                new Month("December", (y) -> 31),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a monthIndex number: ");
        int monthIndex = scanner.nextInt();
        System.out.print("Input a monthIndex year: ");
        int year = scanner.nextInt();

        Month m = months[monthIndex-1];
        System.out.printf("%s %d has %d days\n", m.name, year, m.daysInMonthFunc.calcDays(year));
    }

}