package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMIInventoryTablesFields {
    player_id("player_id", "int", CMITablesFieldsType.number), inventories("inventories", "longtext", CMITablesFieldsType.longtext);

    private String column = null;
    private String type = null;
    private CMITablesFieldsType fieldType = null;

    CMIInventoryTablesFields(String column, String type, CMITablesFieldsType fieldType) {
    }

    public String getColumn() {
        return null;
    }

    public String getType() {
        return null;
    }

    public CMITablesFieldsType getFieldType() {
        return null;
    }
}
