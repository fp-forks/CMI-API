package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMIPlaytimeRewardTablesFields {
    player_id(CMITablesFieldsType.number), repeatable(CMITablesFieldsType.stringLongMap), onetime(CMITablesFieldsType.stringList);

    private CMITablesFieldsType fieldType = null;

    CMIPlaytimeRewardTablesFields(CMITablesFieldsType fieldType) {
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
