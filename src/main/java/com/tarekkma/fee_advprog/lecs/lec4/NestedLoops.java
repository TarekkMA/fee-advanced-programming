package com.tarekkma.fee_advprog.lecs.lec4;

import javax.swing.*;

public class NestedLoops {
    public static void main(String[] args) {
        String message = "";
        message += "Multiplication Table\n";
        message += "---------------------\n";

        message += " |";
        for (int i = 1; i < 10; i++) {
            message += "\t"+i;
        }
        message += "\n";

        for (int i = 1; i < 10; i++) {
            message += i +"|";
            for (int j = 1; j < 10; j++) {
                message += "\t" + i * j;
            }
            message += "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                message,
                "Multiplication Table",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
