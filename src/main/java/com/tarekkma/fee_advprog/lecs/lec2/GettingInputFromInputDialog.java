package com.tarekkma.fee_advprog.lecs.lec2;

import javax.swing.*;

public class GettingInputFromInputDialog {
    public static void main(String[] args) {
        //The result input will be returned and
        //assigned to the variable s
        String s = JOptionPane.showInputDialog(
                null,
                "Enter X",
                "Dialog Title",
                /*Message Type*/JOptionPane.QUESTION_MESSAGE
        );
    }
}
