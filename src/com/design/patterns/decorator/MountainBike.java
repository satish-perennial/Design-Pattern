package com.design.patterns.decorator;

public class MountainBike extends Bike{
    public MountainBike(String name) {
        super(name);
        setPrice(50000);
    }

    @Override
    public void showDetails() {

        System.out.println(" Cost Of : "+getName()+" Price : "+getPrice());
    }
}
