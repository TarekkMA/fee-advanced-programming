package com.tarekkma.fee_advprog.lecs.lec4;

import javax.swing.*;
import java.util.Random;

public class AdvancedMathLearningTool {
    public static void main(String[] args) {
        Random r = new Random();

        int correct = 0;

        for (int i = 0; i < 10; i++) {
            int n1 = r.nextInt(10);
            int n2 = r.nextInt(10);
            int temp;


            if (n2 > n1) {
                //swap
                temp = n1;
                n1 = n2;
                n2 = temp;
            }

            String result = JOptionPane.showInputDialog(
                    null,
                    "What is the result of " + n1 + " - " + n2 + " ?",
                    "Math Learning Tool",
                    JOptionPane.QUESTION_MESSAGE
            );

            int intResult = Integer.parseInt(result);
            if (intResult == n1 - n2) {
                correct++;
                JOptionPane.showMessageDialog(
                        null,
                        n1 + " - " + n2 + " = " + intResult + " is true",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        n1 + " - " + n2 + " = " + intResult + " is false",
                        "Result",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Number of correct answers is " + correct,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
