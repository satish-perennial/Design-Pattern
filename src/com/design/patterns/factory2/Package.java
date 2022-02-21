package com.design.patterns.factory2;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

    protected List<Database> dbList = new ArrayList<>();

    public Package() {
        creatingPackage();
    }

    protected abstract void creatingPackage();

    @Override
    public String toString() {
        return "Package{" +
                "dbList=" + dbList +
                '}';
    }
}
