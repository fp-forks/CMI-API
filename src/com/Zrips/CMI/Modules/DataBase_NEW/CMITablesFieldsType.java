package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMITablesFieldsType {
    decimal("double"),
    number("int"),
    longtext("longtext"),
    text("text"),
    stringList("longtext"),
    stringLongMap("text"),
    stringIntMap("text"),
    stringDoubleMap("text"),
    stringStringMap("text"),
    locationMap("text"),
    state("boolean"),
    location("text"),
    longNumber("bigint");

    private String type = null;

    CMITablesFieldsType(String type) {
    }

    public static CMITablesFieldsType get(String name) {
        return null;
    }

    public String getType() {
        return null;
    }
}
