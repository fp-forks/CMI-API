package com.Zrips.CMI.Modules.DataBase_NEW;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

public abstract class DBDAO_NEW {
    private static DBConnectionPool_NEW pool = null;
    private static String prefix = null;
    protected CMI plugin = null;
    private CMISqlType format = null;
    private CMIDbBatch playerInsertBatch = null;
    private CMIDbBatch playerUpdateBatch = null;
    private CMIDbBatch inventoryUpdateBatch = null;
    private CMIDbBatch inventoryInsertBatch = null;
    private CMIDbBatch playtimerewardUpdateBatch = null;
    private CMIDbBatch playtimerewardInsertBatch = null;
    private CMIDbBatch playtimeUpdateBatch = null;
    private CMIDbBatch playtimeInsertBatch = null;

    protected DBDAO_NEW(CMI plugin, String driverName, String url, String username, String password, String dbprefix) {
    }

    public static DBConnectionPool_NEW getPool() {
        return null;
    }

    public final synchronized void setUp() throws SQLException {
    }

    public abstract boolean createTable(String query) throws SQLException;

    public abstract boolean isTable(String table);

    public abstract boolean isCollumn(String table, String collumn);

    public abstract boolean truncate(String table);

    public abstract boolean addCollumn(String table, String collumn, String type);

    public abstract boolean convertTableToUTF8(CMIDBTables table);

    public abstract String getTableCharSet(CMIDBTables table);

    public abstract String getTableRowFormat(CMIDBTables table);

    public abstract boolean convertTableRowFormat(CMIDBTables table);

    public static String getPrefix() {
        return null;
    }

    public CompletableFuture<Void> updateUUID(int id, UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> updateUserName(int id, String name) {
        return null;
    }

    public boolean isConnected() {
        return false;
    }

    protected Connection getConnection() {
        return null;
    }

    public static Connection getPooledConnection() {
        return null;
    }

    public void close(ResultSet res) {
    }

    public void close(Statement stmt) {
    }

    public void close(Connection con) {
    }

    public boolean updatePlayer(CMIUser user) {
        return false;
    }

    public void updatePlayerPlayTime(CMIUser user) {
    }

    public void updatePlayerInventory(CMIUser user, String string) {
    }

    public void updatePlayerPlayTimeRewards(CMIUser user) {
    }

    public boolean executeTempBatch() {
        return false;
    }

    public CompletableFuture<Integer> getInvId(int iid) {
        return null;
    }

    public CompletableFuture<String> getSavedInventories(CMIUser user) {
        return null;
    }

    public CompletableFuture<Void> loadUser(UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> loadUser(int id) {
        return null;
    }

    public void loadAllUsers() {
    }

    public void loadPlayTimes() {
    }

    public CompletableFuture<LinkedHashSet<CMIUser>> getLastLogOffList(int from, int to) {
        return null;
    }

    public CompletableFuture<Integer> getLogOffCount(long timeRangeSec) {
        return null;
    }

    public CompletableFuture<Void> loadPlayTimes(CMIUser user) {
        return null;
    }

    public void loadPlayerPlayTimeRewards() {
    }

    public CompletableFuture<Void> getUserIds(HashMap<String, CMIUser> users) {
        return null;
    }

    public CompletableFuture<Void> getUserPlayTimeIds(HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId) {
        return null;
    }

    public CompletableFuture<Void> getUserInvIds(HashMap<Integer, CMIUser> users) {
        return null;
    }

    public CompletableFuture<Void> getUserPlayTimeRewardIds(HashMap<Integer, CMIUser> users) {
        return null;
    }

    public CompletableFuture<Boolean> removeUser(int id) {
        return null;
    }

    public CMISqlType getDbFormat() {
        return null;
    }

    public void setDbFormat(CMISqlType type) {
    }
}
