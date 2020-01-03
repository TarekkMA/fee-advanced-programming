package com.tarekkma.fee_advprog.lecs.lec8;

public class NumberOfCircles {

    public static class Circle{

        public static int numberOfObjects;

        public Circle(){
            numberOfObjects++;
        }

    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        Circle c5 = new Circle();

        //should be 5
        System.out.println(Circle.numberOfObjects);
    }
}
