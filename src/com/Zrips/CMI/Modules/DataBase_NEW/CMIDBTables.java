package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMIDBTables {
    UserTable("users", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
    InvTable("inventories", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
    PlayTime("playtime", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
    PlayTimeReward("playtimereward", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
            "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);");

    private String mySQL = null;
    private String sQlite = null;
    private String tableName = null;

    CMIDBTables(String tableName, String MySQL, String SQlite) {
    }

    public String getQuery() {
        return null;
    }

    public String getUpdateQuery() {
        return null;
    }

    public String getInsertQuery(CMISqlType type) {
        return null;
    }

    public String getTableName() {
        return null;
    }
}
