package com.design.patterns.factory2;

import com.design.patterns.factory2.db.*;

public class NoSqlDatabasePackage extends Package{

    @Override
    protected void creatingPackage() {

        dbList.add(new MongoDB());
        dbList.add(new NoSQL());
    }
}
