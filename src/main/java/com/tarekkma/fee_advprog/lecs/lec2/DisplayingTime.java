package com.tarekkma.fee_advprog.lecs.lec2;

public class DisplayingTime {
    public static void main(String[] args) {

        long timeMills = System.currentTimeMillis();

        long sec  = (timeMills / (1000)) % 60;
        long min  = (timeMills / (1000 * 60)) % 60;
        long hour = (timeMills / (1000 * 60 * 60)) % 24;

        System.out.println(hour+":"+min+":"+sec);
    }
}
