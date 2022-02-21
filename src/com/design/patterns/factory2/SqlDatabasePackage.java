package com.design.patterns.factory2;

import com.design.patterns.factory2.db.MS_Sql;
import com.design.patterns.factory2.db.MySql;
import com.design.patterns.factory2.db.SqlLite;

public class SqlDatabasePackage extends Package{

    @Override
    protected void creatingPackage() {

        dbList.add(new MySql());
        dbList.add(new MS_Sql());
        dbList.add(new SqlLite());
    }
}
