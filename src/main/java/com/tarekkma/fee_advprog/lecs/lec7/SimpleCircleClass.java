package com.tarekkma.fee_advprog.lecs.lec7;

public class SimpleCircleClass {

    public static class Circle{

        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }


    public static void main(String[] args) {
        Circle circle;
        circle = new Circle(1);

        double area = circle.getArea();

        System.out.println("area = " + area);
    }


}
