package com.tarekkma.fee_advprog.sheets.sheet6;

import javax.swing.*;

/**
 * Q3. Write a Java program to use the JFrame class in the javax.swing package to create two frames, use the
 * methods in the JFrame class to set the title, size and location of the frames and to display the frames.
 */
public class Q3 {

    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();

        frame1.setTitle("Frame 1");
        frame1.setSize(500,500);
        frame1.setLocation(0,0);
        frame1.setVisible(true);

        frame2.setTitle("Frame 2");
        frame2.setSize(250,250);
        frame2.setLocation(500,500);
        frame2.setVisible(true);
    }
}
