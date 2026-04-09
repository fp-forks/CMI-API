package com.Zrips.CMI.Modules.DataBase_NEW;

public enum CMISqlType {
    SqLite, MySQL, MariaDB;

    boolean fallback = false;

    public boolean isFallback() {
        return false;
    }

    public void setFallback(boolean fallback) {
    }
}
