package com.design.patterns.decorator;

public class AlarmDecorator extends BikeDecorator {

    Bike bike;

    public AlarmDecorator(Bike bike) {
        super(bike);
        this.bike = bike;

    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Alarm added to " + bike.getName());

    }

    @Override
    public String addNewFeatureName() {
        return "alarm";
    }

    @Override
    public int addNewFeaturePrice() {
        return 10000;
    }
}
