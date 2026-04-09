package com.Zrips.CMI.Modules.DataBase_NEW;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CMIDbBatch {
    private static Connection batchConnection = null;
    private PreparedStatement batch = null;

    public PreparedStatement getBatch() {
        return null;
    }

    public PreparedStatement prepareBatch(String query) {
        return null;
    }

    public static boolean commitBatch() {
        return false;
    }

    public boolean commit() {
        return false;
    }

    public void addBatch() {
    }

    public boolean close() {
        return false;
    }
}
