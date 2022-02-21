package com.design.patterns.factory2;

import com.design.patterns.factory.*;

public class DatabaseFactory {

    public DatabaseFactory() throws IllegalAccessException{

        throw new IllegalAccessException("You can not make object of it");
    }

    public static Package getPackage(PackageType packageType) throws IllegalStateException{
        switch (packageType)
        {
            case NOSQL -> {
                return new NoSqlDatabasePackage();
            }
            case SQL -> {
                return new SqlDatabasePackage();
            }
            default ->{
                throw new IllegalStateException("No package found");
            }
        }



    }
}
