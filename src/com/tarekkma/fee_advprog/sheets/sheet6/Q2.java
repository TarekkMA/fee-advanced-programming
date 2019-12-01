package com.tarekkma.fee_advprog.sheets.sheet6;

/**
 * Q2. Write a Java programs to create the following class and objects, use addStudent method to insert four
 * students for each object, and invoke the methods of each object to display its name, students and number of
 * students.
 */
public class Q2 {

    static class Course{
        private String name;
        private String[] students;
        private int numberOfStudents;

        public Course(String name) {
            this.name = name;
            this.students = new String[]{};
            this.numberOfStudents = 0;
        }

        public String getName() { return name; }

        public String[] getStudents() { return students; }

        public int getNumberOfStudents() { return numberOfStudents; }

        public void addStudent(String student){
            String[] newStudents = new String[students.length + 1];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            newStudents[students.length] = student;
            students = newStudents;

            numberOfStudents = students.length;
        }
    }

    public static void main(String[] args) {

        Course course1 = new Course("Software Eng.");
        Course course2 = new Course("Database");

        course1.addStudent("S 1");
        course1.addStudent("S 2");
        course1.addStudent("S 3");
        course1.addStudent("S 4");
        course2.addStudent("S 1");
        course2.addStudent("S 2");
        course2.addStudent("S 3");
        course2.addStudent("S 4");

        System.out.println(course1.getName());
        System.out.println(course1.getNumberOfStudents());
        for (String student : course1.getStudents()) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println(course2.getName());
        System.out.println(course2.getNumberOfStudents());
        for (String student : course2.getStudents()) {
            System.out.println(student);
        }
    }
}
