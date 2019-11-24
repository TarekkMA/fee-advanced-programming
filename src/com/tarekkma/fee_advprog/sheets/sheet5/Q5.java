package com.tarekkma.fee_advprog.sheets.sheet5;

import java.util.Scanner;

/**
 * Q5. Write a Java program to read 2-dimensional array and rotate it, as the following example.
 */
public class Q5 {

    static int[][] rotate(int[][] matrix) {
        int originalRows = matrix.length;
        int originalColumns = matrix[0].length;
        int[][] result = new int[originalColumns][originalRows];
        for (int oc = 0; oc < originalColumns; oc++) {
            for (int or = 0; or < originalRows; or++) {
                result[oc][or] = matrix[or][oc];
            }
        }
        return result;
    }

    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        int[][] matrix;
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] rotated = rotate(matrix);

        System.out.println("== Original ==");
        displayMatrix(matrix);
        System.out.println("== Rotated ==");
        displayMatrix(rotated);
    }

}

/*
SAMPLE DATA
7 4
5520	3598	3025	7215
1203	5129	5948	5663
2799	7721	4145	2108
1898	4368	6596	6184
1826	8591	9854	6643
6907	4599	713  	1785
7794	4638	4839	9147
*/