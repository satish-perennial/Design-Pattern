package com.design.patterns.decorator;

public abstract class BikeDecorator extends Bike {

    public Bike bike;

    public BikeDecorator(Bike bike) {
        this.bike = bike;
        setName(bike.getName() + " " + addNewFeatureName());
        setPrice(bike.getPrice() + addNewFeaturePrice());
    }

    public abstract String addNewFeatureName();

    public abstract int addNewFeaturePrice();

    @Override
    public void showDetails() {
        bike.showDetails();
        System.out.println(" Cost Of :  "+getName()+" Price :"+getPrice());
    }
}
