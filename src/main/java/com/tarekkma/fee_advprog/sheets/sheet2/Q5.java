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

    public static void main(String[] args) {
        String[] names = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December",
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a monthIndex number: ");
        int monthIndex = scanner.nextInt();
        System.out.print("Input a monthIndex year: ");
        int year = scanner.nextInt();

        int days = 0;
        String name = names[monthIndex-1];

        switch (monthIndex) {
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    days = 29;
                }else {
                    days = 28;
                }
                break;
            case 4: case 11: case 9:
                days = 30;
                break;
            case 1: case 12: case 10: case 8:
            case 7: case 6: case 5: case 3:
                days = 31;
                break;
        }

        System.out.printf("%s %d has %d days\n", name, year,days);
    }

}