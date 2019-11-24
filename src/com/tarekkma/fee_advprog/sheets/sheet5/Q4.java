package com.tarekkma.fee_advprog.sheets.sheet5;

import java.util.Scanner;

/**
 * Q4. Suppose there are 8 students, 10 exams, write a Java program to read their scores of “double” data type
 * into 2-dimensional array, and display their grades.
 * Expected Output:
 * <p>
 * 0 1 2 3 4 5 6 7 8 9
 * Student 0    A B A C C D E E A D
 * Student 1    D B A B C A E E A D
 * Student 2    E D D A C B E E A D
 * Student 3    C B A E D C E E A D
 * Student 4    A B D C C D E E A D
 * Student 5    B B E C C D E E A D
 * Student 6    B B A C C D E E A D
 * Student 7    E B E C C D E E A D
 * Student 7
 */
public class Q4 {

    public static void main(String[] args) {
        int numberOfStudents = 8;
        int numberOfExams = 10;
        char[][] grades = new char[numberOfStudents][numberOfExams];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            double[] studentScores = new double[numberOfExams];
            for (int j = 0; j < numberOfExams; j++) {
                studentScores[j] = scanner.nextDouble();
            }
            grades[i] = Q1.ArrayMethod.gradeScores(studentScores);
        }

        System.out.print("\t\t\t");
        for (int i = 0; i < numberOfExams; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + i + "\t");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j]+" ");
            }
            System.out.println();
        }
    }

}
/*
SAMPLE DATA
14	23	16	92	89	15	1	80	34	60
56	79	22	75	0	94	65	38	41	69
36	5	22	5	75	48	86	76	3	33
3	7	49	70	14	60	84	66	31	100
9	2	92	72	88	80	68	6	5	40
51	5	17	14	11	100	5	77	35	76
36	9	87	31	84	65	40	24	96	24
100	67	94	72	58	53	27	6	38	3
 */