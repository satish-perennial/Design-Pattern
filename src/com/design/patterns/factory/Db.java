package com.design.patterns.factory;

public abstract class Db {

   private String dbName;
    private String userName;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void displayDetails(){
        System.out.println("DB Name: "+this.dbName);
        System.out.println("User Name: "+this.userName);
    }
}
