package com.Zrips.CMI.Modules.DataBase_NEW;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Queue;
import java.util.Set;

public class DBConnectionPool_NEW {
    private final String url = null;
    private final String username = null;
    private final String password = null;
    private final int maxPoolSize = 0;
    private final Queue<Connection> pool = null;
    private final Set<Connection> created = null;

    public DBConnectionPool_NEW(String url, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    }

    public synchronized Connection getConnection() throws SQLException {
        return null;
    }

    public synchronized void releaseConnection(Connection conn) {
    }

    public synchronized void closeAll() {
    }

    public synchronized boolean hasValidConnection() {
        return false;
    }
}
