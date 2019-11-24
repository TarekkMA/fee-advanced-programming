package com.tarekkma.fee_advprog.sheets.sheet4;

import java.util.Scanner;

/**
 * Q6. Write a Java method to check whether a string is a valid password.
 * Password rules:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.next();

        boolean hasErrors = false;

        if(password.length() < 10){
            System.out.println("A password must have at least ten characters.");
            hasErrors = true;
        }

        if(!password.matches("^[a-zA-Z0-9]$")){
            System.out.println("A password consists of only letters and digits.");
            hasErrors = true;
        }

        if(!password.matches("^[0-9]{2,}$")){
            System.out.println("A password must contain at least two digits.");
            hasErrors = true;
        }

        if(!hasErrors){
            System.out.println("Password Accepted");
        }

    }




}