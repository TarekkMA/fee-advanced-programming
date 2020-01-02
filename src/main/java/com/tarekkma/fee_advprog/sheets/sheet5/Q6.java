package com.tarekkma.fee_advprog.sheets.sheet5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Q6. Write a Java program that calculates the total score for each students in a class. Suppose the scores are
 * stored in a three-dimensional array. The first index in an array refers to a student, the second refers to an
 * exam, and the third refers to the part of the exam. Suppose there are 10 students, 5 exams, and each exam has
 * two parts; the multiple-choice part and the programming part. So, scores[i][j][0] represents the score on the
 * multiple-choice part for the i’s student on the j’s exam. the program displays the total score for each student.
 */
public class Q6 {

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int numberOfExams = 5;
        int numberOfExamParts = 2;

        double[][][] scores = new double
                [numberOfStudents]
                [numberOfExams]
                [numberOfExamParts];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("For Student #" + i + ":");
            for (int j = 0; j < numberOfExams; j++) {
                System.out.println("\tFor Exam #" + j + ":");
                for (int k = 0; k < numberOfExamParts; k++) {
                    System.out.println("\t\tFor Exam Part #" + k + ":");
                    System.out.print("\t\t\tEnter The Score:");
                    scores[i][j][k] = scanner.nextDouble();
                }
            }
        }


        System.out.println("\n\nTotal Scores for Students:");
        for (int i = 0; i < numberOfStudents; i++) {
            double totalScore = 0;
            for (int j = 0; j < numberOfExams; j++) {
                for (int k = 0; k < numberOfExamParts; k++) {
                    totalScore += scores[i][j][k];
                }
            }
            System.out.println("\tStudent #" + i + " => " + totalScore);

        }

    }

}

/*
SAMPLE DATA
42 90
60 78
19 21
47 42
67 11

68 9
15 61
65 19
11 82
83 80

28 49
26 34
40 99
62 30
26 5

27 21
28 36
46 17
66 20
6 82

57 56
79 81
45 75
92 16
40 93

25 31
46 94
26 0
24 90
60 20

41 15
28 12
58 68
90 9
92 77

70 78
57 59
60 31
84 74
76 12

86 4
53 31
18 23
65 66
59 10

86 50
79 35
48 34
36 57
61 38


//CODE FOR SAMPLE DATA
function genData(numStu,numExam,numberParts){
	var s = "";
    for(var i = 0;i<numStu;i++){
		for(var j = 0;j<numExam;j++){
        	for(var k = 0;k<numberParts;k++){
				s += rand() + " ";
            }
			s += "\n";
		}
		s += "\n";
	}
	return s;
}
*/