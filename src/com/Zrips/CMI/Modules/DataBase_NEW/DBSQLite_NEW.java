package com.Zrips.CMI.Modules.DataBase_NEW;

import java.io.File;

import com.Zrips.CMI.CMI;

public class DBSQLite_NEW extends DBDAO_NEW {
    DBSQLite_NEW(CMI plugin, File file) {
        super(plugin, "org.sqlite.JDBC", "jdbc:sqlite:" + new File(file, "cmi.sqlite.db").getPath(), null, null, "");
    }

    public void initialize() {
    }

    @SuppressWarnings("resource")
    @Override
    public boolean createTable(String query) {
        return false;
    }

    @Override
    public boolean isTable(String table) {
        return false;
    }

    @Override
    public boolean isCollumn(String table, String column) {
        return false;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean addCollumn(String table, String collumn, String type) {
        return false;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean truncate(String table) {
        return false;
    }

    @Override
    public String getTableCharSet(CMIDBTables table) {
        return null;
    }

    @Override
    public boolean convertTableToUTF8(CMIDBTables table) {
        return false;
    }

    @Override
    public String getTableRowFormat(CMIDBTables table) {
        return null;
    }

    @Override
    public boolean convertTableRowFormat(CMIDBTables table) {
        return false;
    }
}
