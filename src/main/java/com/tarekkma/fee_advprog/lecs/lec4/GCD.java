package com.tarekkma.fee_advprog.lecs.lec4;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int gcd = 1;

        for (int i = 2; i <= n1 && i <= n2; i++) {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD is " + gcd);
    }
}
