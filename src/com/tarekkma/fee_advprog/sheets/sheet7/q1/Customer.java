package com.tarekkma.fee_advprog.sheets.sheet7.q1;

public class Customer{

    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}