package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMIPlaytimeTablesFields {
    player_id(CMITablesFieldsType.number),
    date(CMITablesFieldsType.number),
    h0(0),
    h1(1),
    h2(2),
    h3(3),
    h4(4),
    h5(5),
    h6(6),
    h7(7),
    h8(8),
    h9(9),
    h10(10),
    h11(11),
    h12(12),
    h13(13),
    h14(14),
    h15(15),
    h16(16),
    h17(17),
    h18(18),
    h19(19),
    h20(20),
    h21(21),
    h22(22),
    h23(23);

    private CMITablesFieldsType fieldType = null;
    private int hour = 0;

    CMIPlaytimeTablesFields(CMITablesFieldsType fieldType) {
    }

    CMIPlaytimeTablesFields(int hour) {
    }

    CMIPlaytimeTablesFields(int hour, CMITablesFieldsType fieldType) {
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

    public boolean isTimeField() {
        return false;
    }

    public int getHour() {
        return 0;
    }
}
