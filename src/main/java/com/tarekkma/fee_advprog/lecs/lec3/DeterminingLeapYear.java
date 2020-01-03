package com.tarekkma.fee_advprog.lecs.lec3;

import java.util.Scanner;

public class DeterminingLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Normal Year");
        }
    }
}
