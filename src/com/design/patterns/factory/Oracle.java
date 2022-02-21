package com.design.patterns.factory;

public class Oracle extends Db {

    public Oracle(){
        setUserName("jayesh");
        setDbName("Oracle");
    }
    @Override
    public String toString() {
        return "Oracle";
    }
}
