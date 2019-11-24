package com.tarekkma.fee_advprog.sheets.sheet5;

import java.util.Scanner;

/**
 * Q2. Write a Java program to read student scores of “double” data type and print the best score, and then
 * display their grades (A or B or C or D or F) by using the methods of Q1.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfScores;
        double[] scores;
        System.out.print("Input number of scores:");
        numOfScores = scanner.nextInt();
        scores = new double[numOfScores];
        for (int i = 0; i < numOfScores; i++) {
            System.out.print("#" + (i + 1) + ":");
            scores[i] = scanner.nextDouble();
        }
        char[] grades = Q1.ArrayMethod.gradeScores(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Best:100\tScore:" + scores[i] + "\tGrade:" + grades[i]);
        }
    }

}