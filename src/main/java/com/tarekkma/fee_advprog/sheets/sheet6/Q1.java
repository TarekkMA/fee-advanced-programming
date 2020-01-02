package com.tarekkma.fee_advprog.sheets.sheet6;


import java.util.Arrays;
import java.util.List;

/**
 * Q1. Write a Java programs to create the following class and objects, use addCourse method to insert four
 * courses for each object, and invoke the methods of each object to display its name, address, grads and average
 * of grades.
 */
public class Q1 {

    static class Student {
        private String name;
        private String address;
        private int numCourses;
        private String[] courses;
        private int[] grades;

        public Student(String name, String address) {
            this.name = name;
            this.address = address;
            numCourses = 0;
            courses = new String[]{};
            grades = new int[]{};
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return name + "(" + address + ")";
        }

        public void addCourse(String course, int grade) {
            String[] newCourses = new String[courses.length + 1];
            System.arraycopy(courses, 0, newCourses, 0, courses.length);
            newCourses[courses.length] = course;
            courses = newCourses;

            int[] newGrades = new int[grades.length + 1];
            System.arraycopy(grades, 0, newGrades, 0, grades.length);
            newGrades[grades.length] = grade;
            grades = newGrades;

            numCourses = courses.length;
        }

        public void printGrades() {
            for (int i = 0; i < numCourses; i++) {
                System.out.printf("%s : %d\n", courses[i], grades[i]);
            }
        }

        public double getAverage() {
            double sum = 0;
            for (int i = 0; i < numCourses; i++) {
                sum += grades[i];
            }
            return sum / numCourses;
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("Mohamed Elsaid","Menouf");
        Student student2 = new Student("Ahmed Hassan","Cairo");

        student1.addCourse("A",23);
        student1.addCourse("B",12);
        student1.addCourse("C",34);
        student1.addCourse("D",90);

        student2.addCourse("A",34);
        student2.addCourse("B",63);
        student2.addCourse("C",23);
        student2.addCourse("D",54);

        System.out.println(student1.toString());
        student1.printGrades();
        System.out.println("Avg:"+student1.getAverage());

        System.out.println();

        System.out.println(student2.toString());
        student2.printGrades();
        System.out.println("Avg:"+student2.getAverage());
    }

}
