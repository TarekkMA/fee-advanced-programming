package com.tarekkma.fee_advprog.sheets.sheet8;

public class Test {

    public static void main(String[] args) {
        Circle c = new Circle(10,"blue");
        System.out.println(c.getArea());

        Cylinder cy = new Cylinder(5,10,"green");
        System.out.println(cy.getVolume());

        Point2D point2D = new Point2D(5,3);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(2,4,6);
        System.out.println(point3D.toString());
    }

}
