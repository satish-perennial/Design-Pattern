package com.design.patterns.factory;

public class MySql extends Db {

    public MySql() {
        setUserName("satish");
        setDbName("MySQL");
    }

    @Override
    public String toString() {
        return "MySql";
    }
}
