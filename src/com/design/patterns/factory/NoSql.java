package com.design.patterns.factory;

public class NoSql extends Db {

    public NoSql(){
        setUserName("Ravi");
        setDbName("No SQL");
    }
    @Override
    public String toString() {
        return "NoSql";
    }
}
