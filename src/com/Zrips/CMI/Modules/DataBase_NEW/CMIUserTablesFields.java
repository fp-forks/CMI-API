package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMIUserTablesFields {
    player_uuid(CMITablesFieldsType.text),
    username(CMITablesFieldsType.text),
    nickname(CMITablesFieldsType.text),
    LogOutLocation(CMITablesFieldsType.location),
    DeathLocation(CMITablesFieldsType.location),
    TeleportLocation(CMITablesFieldsType.location),
    Homes(CMITablesFieldsType.locationMap),
    LastLoginTime(CMITablesFieldsType.longNumber),
    LastLogoffTime(CMITablesFieldsType.longNumber),
    TotalPlayTime(CMITablesFieldsType.longNumber),
    tFly(CMITablesFieldsType.longNumber),
    tGod(CMITablesFieldsType.longNumber),
    Glow(CMITablesFieldsType.text),
    Ips(CMITablesFieldsType.stringIntMap),
    Cuffed(CMITablesFieldsType.state),
    AlertUntil(CMITablesFieldsType.longNumber),
    AlertReason(CMITablesFieldsType.text),
    JoinedCounter(CMITablesFieldsType.state),
    LockedIps("text", CMITablesFieldsType.stringList),
    pTime(CMITablesFieldsType.longNumber),
    Kits("text", CMITablesFieldsType.stringLongMap),
    Charges(CMITablesFieldsType.text),
    Cooldowns("mediumtext", CMITablesFieldsType.text),
    Balance(CMITablesFieldsType.decimal),
    Notes("text", CMITablesFieldsType.stringList),
    Rank(CMITablesFieldsType.text),
    BannedUntil(CMITablesFieldsType.longNumber),
    BannedAt(CMITablesFieldsType.longNumber),
    BannedBy(CMITablesFieldsType.text),
    BanReason(CMITablesFieldsType.text),
    Ignores(CMITablesFieldsType.text),
    Vanish(CMITablesFieldsType.text),
    Economy(CMITablesFieldsType.stringDoubleMap),
    Mail("mediumtext", CMITablesFieldsType.stringList),
    FlightCharge(CMITablesFieldsType.decimal),
    UserMeta(CMITablesFieldsType.stringStringMap),
    Flying(CMITablesFieldsType.state),
    Votifier(CMITablesFieldsType.number),
    Jail(CMITablesFieldsType.text),
    JailedUntil(CMITablesFieldsType.longNumber),
    FakeAccount(CMITablesFieldsType.state),
    PlaytimeOptimized(CMITablesFieldsType.longNumber),
    flightChargeEnabled(CMITablesFieldsType.state),
    JailReason(CMITablesFieldsType.text),
    Skin(CMITablesFieldsType.text),
    Collision(CMITablesFieldsType.state),
    NamePrefix(CMITablesFieldsType.text),
    NameSuffix(CMITablesFieldsType.text),
    Warnings(CMITablesFieldsType.stringLongMap),
    NameColor(CMITablesFieldsType.text),
    Muted(CMITablesFieldsType.text),
    AFRecharge(CMITablesFieldsType.text),
    DisplayName(CMITablesFieldsType.text),
    Options(CMITablesFieldsType.text),
    ChatColor(CMITablesFieldsType.text);

    private String type = null;
    private CMITablesFieldsType fieldType = null;

    CMIUserTablesFields(String type, CMITablesFieldsType fieldType) {
    }

    CMIUserTablesFields(CMITablesFieldsType fieldType) {
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
