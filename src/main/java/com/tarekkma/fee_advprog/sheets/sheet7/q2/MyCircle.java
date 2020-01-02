package com.tarekkma.fee_advprog.sheets.sheet7.q2;

public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setY(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }

}
