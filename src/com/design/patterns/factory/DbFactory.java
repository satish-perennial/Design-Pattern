package com.design.patterns.factory;

public class DbFactory {

    public DbFactory() throws IllegalAccessException{

        throw new IllegalAccessException("You can not make object of it");
    }

    public static Db getDbObject(DbType dbType) throws IllegalStateException{
        switch (dbType)
        {
            case MYSQL -> {
                return new MySql();
            }
            case NOSQL -> {
                return new NoSql();
            }
            case ORACLE -> {
                return new Oracle();
            }
            default ->{
                throw new IllegalStateException("No DB FOUND");
            }
        }



    }
}
