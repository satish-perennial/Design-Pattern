package com.design.patterns.decorator;

public abstract class Bike {

    private String name;
    private int price;

    public Bike(String name) {
    this.name=name;
    }

    public Bike() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void showDetails();
}
