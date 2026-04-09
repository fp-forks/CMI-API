package com.Zrips.CMI.Modules.DataBase;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionPool {
    private DBConnection connection = null;
    private String url = null;
    private String username = null;
    private String password = null;

    public DBConnectionPool(String driverName, String url, String username, String password) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    }

    public synchronized DBConnection getConnection() throws SQLException {
        return null;
    }

    public Connection getTemporaryConnection() {
        return null;
    }

    public synchronized void closeConnection() {
    }
}
