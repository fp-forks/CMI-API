package com.Zrips.CMI.Modules.DataBase_NEW;

import com.Zrips.CMI.CMI;

public class DBMySQL_NEW extends DBDAO_NEW {
    private CMI plugin = null;
    private String database = null;
    private static String path = null;

    public DBMySQL_NEW(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
        super(plugin, path, "jdbc:mysql://" + hostname + "/" + database + "?autoReconnect=" + autoReconnect + "&useSSL=" + ssl + "&verifyServerCertificate=" + certificate
                + "&allowPublicKeyRetrieval=true" + "&useUnicode=true&characterEncoding=utf8mb4_unicode_ci", username, password, prefix);
    }

    public void initialize() {
    }

    public DBMySQL_NEW initialize(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
        return null;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean createTable(String query) {
        return false;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isTable(String table) {
        return false;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isCollumn(String table, String collumn) {
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
    public String getTableRowFormat(CMIDBTables table) {
        return null;
    }

    @Override
    public boolean convertTableToUTF8(CMIDBTables table) {
        return false;
    }

    @Override
    public boolean convertTableRowFormat(CMIDBTables table) {
        return false;
    }
}
