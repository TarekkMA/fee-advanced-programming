package com.tarekkma.fee_advprog.lecs.lec8;

public class NumberOfCircles {

    public static class Circle{

        public double r;
        public static int numberOfObjects;

        public Circle(double r){
            numberOfObjects++;
            this.r = r;
        }

        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        public double getArea() {
            return r * r * Math.PI;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(1.5);
        Circle c3 = new Circle(2.5);
        Circle c4 = new Circle(5.2);
        Circle c5 = new Circle(10.135);

        //should be 5
        //static method
        System.out.println(Circle.getNumberOfObjects());
        //non-static method (instance method)
        System.out.println(c1.getArea());

        //static variable
        System.out.println(Circle.numberOfObjects);
        //non-static variable (instance variable)
        System.out.println(c1.r);
    }
}
