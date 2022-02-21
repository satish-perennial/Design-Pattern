package com.design.patterns.Singlton;

public class SingleTonConcept {

    public static volatile SingleTonConcept db;

    public SingleTonConcept() {

        if (db != null) {
            throw new RuntimeException("You can not create object of SingletonClass");
        }
    }

    public static SingleTonConcept getInstance() {

        synchronized (SingleTonConcept.class) {
            if (db == null) {
                return db = new SingleTonConcept();
            }
        }
        return db;

    }
}
