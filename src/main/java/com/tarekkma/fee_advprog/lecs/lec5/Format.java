package com.tarekkma.fee_advprog.lecs.lec5;

public class Format {
    public static double format(double number,
                                int numberOfDecimalDigits) {
        return Math.round(number * Math.pow(10, numberOfDecimalDigits))
                / Math.pow(10, numberOfDecimalDigits);
    }
}
