package com.design.patterns.decorator;

public class ElectricDecorator extends BikeDecorator {

    Bike bike;

    public ElectricDecorator(Bike bike) {
        super(bike);
        this.bike = bike;

    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Electric added to " + bike.getName());

    }

    @Override
    public String addNewFeatureName() {
        return "electric";
    }

    @Override
    public int addNewFeaturePrice() {
        return 100000;
    }
}
