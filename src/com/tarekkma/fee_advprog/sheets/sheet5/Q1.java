package com.tarekkma.fee_advprog.sheets.sheet5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Q1. Create a class named “ArrayMethod” and place it in the package “com.FEE.STpackage”, the
 * ArrayMethod class contains five methods:
 * 1. First method has (an input array of “double” data type) to return the largest number of its values.
 * 2. Second method has (an input array of “int” data type) to reverse it.
 * 3. Third method has (an input array of “int” data type and an integer value) to count the number of its
 * occurrence.
 * 4. Fourth method has (an input array of “char” data type and character value) to count the number of
 * its occurrence.
 * 5. Fifth method has (an input array of student scores “double” data type) to return an array of their
 * grades based on the following scheme:
 * Grade is A if score is >= best–10;
 * Grade is B if score is >= best–20;
 * Grade is C if score is >= best–30;
 * Grade is D if score is >= best–40;
 * Grade is F otherwise.
 */
public class Q1 {


    /*package com.FEE.STpackage;*/
    static class ArrayMethod {

        static double max(double[] arr) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }

        static int[] reverse(int[] arr) {
            int temp;
            for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return arr;
        }

        static int countInt(int[] arr, int target) {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) c++;
            }
            return c;
        }

        static int countChar(char[] arr, char target) {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) c++;
            }
            return c;
        }

        static <T> int count(T[] arr, T target) {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) c++;
            }
            return c;
        }

        static char[] gradeScores(double[] scores) {
            //Assuming the best is 100
            double best = 100;
            char[] grades = new char[scores.length];
            for (int i = 0; i < scores.length; i++) {
                double score = scores[i];
                if (score >= best - 10) grades[i] = 'A';
                else if (score >= best - 20) grades[i] = 'B';
                else if (score >= best - 30) grades[i] = 'C';
                else if (score >= best - 40) grades[i] = 'D';
                else grades[i] = 'F';
            }
            return grades;
        }

    }
    /* 1 2 3 3*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

}