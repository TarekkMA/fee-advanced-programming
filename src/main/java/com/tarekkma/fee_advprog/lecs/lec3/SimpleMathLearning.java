package com.tarekkma.fee_advprog.lecs.lec3;

import javax.swing.*;
import java.util.Random;

public class SimpleMathLearning {
    public static void main(String[] args) {
        Random r = new Random();

        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);

        String result = JOptionPane.showInputDialog(
                null,
                "What is the result of " + n1 + " + " + n2 + " ?",
                "Math Learning Tool",
                JOptionPane.QUESTION_MESSAGE
        );

        int intResult = Integer.parseInt(result);
        if(intResult == n1 + n2){
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " + " + n2 + " = " + intResult + " is true",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " + " + n2 + " = " + intResult + " is false",
                    "Result",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
