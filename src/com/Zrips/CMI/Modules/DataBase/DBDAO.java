package com.Zrips.CMI.Modules.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

public abstract class DBDAO {
    private DBConnectionPool pool = null;
    private String prefix = null;
    protected CMI plugin = null;
    private DataBaseType dbType = null;
    public mysqltypes Format = null;
    private PreparedStatement updateBatch = null;
    private boolean updateBatchExecuted = false;
    private PreparedStatement insertBatch = null;
    private boolean insertBatchExecuted = false;
    private PreparedStatement inventoryUpdateBatch = null;
    private boolean inventoryUpdateBatchExecuted = false;
    private PreparedStatement inventoryInsertBatch = null;
    private boolean inventoryInsertBatchExecuted = false;
    private PreparedStatement playtimerewardUpdateBatch = null;
    private boolean playtimerewardUpdateBatchExecuted = false;
    private PreparedStatement playtimerewardInsertBatch = null;
    private boolean playtimerewardInsertBatchExecuted = false;
    private PreparedStatement playtimeUpdateBatch = null;
    private boolean playtimeUpdateBatchExecuted = false;
    private PreparedStatement playtimeInsertBatch = null;
    private boolean playtimeInsertBatchExecuted = false;
    private boolean autoCommit = false;
    private boolean locked = false;

    protected DBDAO(CMI plugin, String driverName, String url, String username, String password, String pr) {
    }

    public final synchronized void setUp() throws SQLException {
    }

    public final synchronized void setUpTables() {
    }

    public abstract Statement prepareStatement(String query) throws SQLException;

    public abstract boolean createTable(String query) throws SQLException;

    public abstract boolean isTable(String table);

    public abstract boolean isCollumn(String table, String collumn);

    public abstract boolean truncate(String table);

    public abstract boolean addCollumn(String table, String collumn, String type);

    public abstract boolean convertTableToUTF8(DBTables table);

    public abstract String getTableCharSet(DBTables table);

    public abstract String getTableRowFormat(DBTables table);

    public abstract boolean convertTableRowFormat(DBTables table);

    public abstract boolean isColumnUnique(DBTables table, String collumn);

    public boolean containsDuplicates(DBTables table, String collumn) {
        return false;
    }

    public String getPrefix() {
        return null;
    }

    public void updateUUID(int id, UUID uuid) {
    }

    public void updateUserName(int id, String name) {
    }

    public void executeSQL(String sql) throws SQLException {
    }

    public boolean isConnected() {
        return false;
    }

    public DBConnection getConnection() {
        return null;
    }

    public Connection getTemporaryConnection() {
        return null;
    }

    public synchronized void closeConnections() {
    }

    public static void close(ResultSet res) {
    }

    public static void close(Statement stmt) {
    }

    public boolean updatePlayer(CMIUser user) {
        return false;
    }

    public boolean createNewPlayerRecord(CMIUser user) {
        return false;
    }

    public void updatePlayerPlayTime(CMIUser user) {
    }

    public void updatePlayerInventory(CMIUser user, String string) {
    }

    public void updatePlayerPlayTimeRewards(CMIUser user) {
    }

    public void setAutoCommit(boolean state) {
    }

    public boolean executeTempBatch() {
        return false;
    }

    public void prepareTempBatch() {
    }

    public int getInvId(int iid) {
        return 0;
    }

    public String getInv(CMIUser user) {
        return null;
    }

    public CompletableFuture<String> getSavedInventories(CMIUser user) {
        return null;
    }

    public void loadUser(UUID uuid) {
    }

    public CompletableFuture<Void> loadUserAsync(UUID uuid) {
        return null;
    }

    public void loadUser(int id) {
    }

    public void loadAllUsers() {
    }

    public void loadPlayTimes() {
    }

    public LinkedHashSet<CMIUser> getLastLogOffList(int from, int to) {
        return null;
    }

    public int getLogOffCount(long timeRangeSec) {
        return 0;
    }

    public void loadPlayTimes(CMIUser user) {
    }

    public void loadPlayerPlayTimeRewards() {
    }

    public void loadPlayerPlayTimeRewards(CMIUser user) {
    }

    public void getUserIds(HashMap<String, CMIUser> users) {
    }

    public void getUserPlayTimeIds(HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId) {
    }

    public void getUserInvIds(HashMap<Integer, CMIUser> users) {
    }

    public void getUserPlayTimeRewardIds(HashMap<Integer, CMIUser> users) {
    }

    public boolean removeUser(int id) {
        return false;
    }

    public DataBaseType getDbType() {
        return null;
    }

    public void setDbType(DataBaseType dabType) {
    }

    public boolean isLocked() {
        return false;
    }

    public enum TablesFieldsType {
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

        TablesFieldsType(String type) {
        }

        public static TablesFieldsType getByname(String name) {
            return null;
        }

        public String getType() {
            return null;
        }
    }

    public enum UserTablesFields {
        player_uuid("text", TablesFieldsType.text),
        username("text", TablesFieldsType.text),
        nickname("text", TablesFieldsType.text),
        LogOutLocation("text", TablesFieldsType.location),
        DeathLocation("text", TablesFieldsType.location),
        TeleportLocation("text", TablesFieldsType.location),
        Homes("text", TablesFieldsType.locationMap),
        LastLoginTime("bigint", TablesFieldsType.longNumber),
        LastLogoffTime("bigint", TablesFieldsType.longNumber),
        TotalPlayTime("bigint", TablesFieldsType.longNumber),
        tFly("bigint", TablesFieldsType.longNumber),
        tGod("bigint", TablesFieldsType.longNumber),
        Glow("text", TablesFieldsType.text),
        Ips("text", TablesFieldsType.stringIntMap),
        Cuffed("boolean", TablesFieldsType.state),
        AlertUntil("bigint", TablesFieldsType.longNumber),
        AlertReason("text", TablesFieldsType.text),
        JoinedCounter("boolean", TablesFieldsType.state),
        LockedIps("text", TablesFieldsType.stringList),
        pTime("bigint", TablesFieldsType.longNumber),
        Kits("text", TablesFieldsType.stringLongMap),
        Charges("text", TablesFieldsType.text),
        Cooldowns("mediumtext", TablesFieldsType.text),
        Balance("double", TablesFieldsType.decimal),
        Notes("text", TablesFieldsType.stringList),
        Rank("text", TablesFieldsType.text),
        BannedUntil("bigint", TablesFieldsType.longNumber),
        BannedAt("bigint", TablesFieldsType.longNumber),
        BannedBy("text", TablesFieldsType.text),
        BanReason("text", TablesFieldsType.text),
        Ignores("text", TablesFieldsType.text),
        Vanish("text", TablesFieldsType.text),
        Economy("text", TablesFieldsType.stringDoubleMap),
        Mail("mediumtext", TablesFieldsType.stringList),
        FlightCharge("double", TablesFieldsType.decimal),
        UserMeta("text", TablesFieldsType.stringStringMap),
        Flying("boolean", TablesFieldsType.state),
        Votifier("int", TablesFieldsType.number),
        Jail("text", TablesFieldsType.text),
        JailedUntil("bigint", TablesFieldsType.longNumber),
        FakeAccount("boolean", TablesFieldsType.state),
        PlaytimeOptimized("bigint", TablesFieldsType.longNumber),
        flightChargeEnabled("boolean", TablesFieldsType.state),
        JailReason("text", TablesFieldsType.text),
        Skin("text", TablesFieldsType.text),
        Collision("boolean", TablesFieldsType.state),
        NamePrefix("text", TablesFieldsType.text),
        NameSuffix("text", TablesFieldsType.text),
        Warnings("text", TablesFieldsType.stringLongMap),
        NameColor("text", TablesFieldsType.text),
        Muted("text", TablesFieldsType.text),
        AFRecharge("text", TablesFieldsType.text),
        DisplayName("text", TablesFieldsType.text),
        Options("text", TablesFieldsType.text),
        ChatColor("text", TablesFieldsType.text);

        private String type = null;
        private TablesFieldsType fieldType = null;

        UserTablesFields(String type, TablesFieldsType fieldType) {
        }

        @Deprecated
        public String getCollumn() {
            return null;
        }

        public String getColumn() {
            return null;
        }

        public String getType() {
            return null;
        }

        public TablesFieldsType getFieldType() {
            return null;
        }

        public static UserTablesFields getByName(String name) {
            return null;
        }
    }

    public enum PlaytimeTablesFields {
        player_id(TablesFieldsType.number),
        date(TablesFieldsType.number),
        h0(0, TablesFieldsType.longNumber),
        h1(1, TablesFieldsType.longNumber),
        h2(2, TablesFieldsType.longNumber),
        h3(3, TablesFieldsType.longNumber),
        h4(4, TablesFieldsType.longNumber),
        h5(5, TablesFieldsType.longNumber),
        h6(6, TablesFieldsType.longNumber),
        h7(7, TablesFieldsType.longNumber),
        h8(8, TablesFieldsType.longNumber),
        h9(9, TablesFieldsType.longNumber),
        h10(10, TablesFieldsType.longNumber),
        h11(11, TablesFieldsType.longNumber),
        h12(12, TablesFieldsType.longNumber),
        h13(13, TablesFieldsType.longNumber),
        h14(14, TablesFieldsType.longNumber),
        h15(15, TablesFieldsType.longNumber),
        h16(16, TablesFieldsType.longNumber),
        h17(17, TablesFieldsType.longNumber),
        h18(18, TablesFieldsType.longNumber),
        h19(19, TablesFieldsType.longNumber),
        h20(20, TablesFieldsType.longNumber),
        h21(21, TablesFieldsType.longNumber),
        h22(22, TablesFieldsType.longNumber),
        h23(23, TablesFieldsType.longNumber);

        private TablesFieldsType fieldType = null;
        private int hour = 0;

        PlaytimeTablesFields(TablesFieldsType fieldType) {
        }

        PlaytimeTablesFields(int hour, TablesFieldsType fieldType) {
        }

        public String getCollumn() {
            return null;
        }

        public String getType() {
            return null;
        }

        public TablesFieldsType getFieldType() {
            return null;
        }

        public boolean isTimeField() {
            return false;
        }

        public int getHour() {
            return 0;
        }

        public static PlaytimeTablesFields getByName(String name) {
            return null;
        }
    }

    public enum PlaytimeRewardTablesFields {
        player_id(TablesFieldsType.number), repeatable(TablesFieldsType.stringLongMap), onetime(TablesFieldsType.stringList);

        private TablesFieldsType fieldType = null;

        PlaytimeRewardTablesFields(TablesFieldsType fieldType) {
        }

        public String getCollumn() {
            return null;
        }

        public String getType() {
            return null;
        }

        public TablesFieldsType getFieldType() {
            return null;
        }

        public static PlaytimeRewardTablesFields getByName(String name) {
            return null;
        }
    }

    public enum InventoryTablesFields {
        player_id("player_id", "int", TablesFieldsType.number), inventories("inventories", "longtext", TablesFieldsType.longtext);

        private String column = null;
        private String type = null;
        private TablesFieldsType fieldType = null;

        InventoryTablesFields(String column, String type, TablesFieldsType fieldType) {
        }

        public String getCollumn() {
            return null;
        }

        public String getType() {
            return null;
        }

        public TablesFieldsType getFieldType() {
            return null;
        }

        public static InventoryTablesFields getByName(String name) {
            return null;
        }
    }

    public enum DBTables {
        UserTable("users", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        InvTable("inventories", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        PlayTime("playtime", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);", "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        PlayTimeReward("playtimereward", "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
                "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);");

        private String mySQL = null;
        private String sQlite = null;
        private String tableName = null;

        DBTables(String tableName, String MySQL, String SQlite) {
        }

        public static DBTables get(String name) {
            return null;
        }

        public boolean hasColumn(String name) {
            return false;
        }

        public String getQuery(DataBaseType dbType) {
            return null;
        }

        public String getUpdateQuery() {
            return null;
        }

        public String getInsertQuery(DataBaseType dbType, mysqltypes Format) {
            return null;
        }

        public String getTableName() {
            return null;
        }

        public String getTableNameOnly() {
            return null;
        }
    }

    public enum mysqltypes {
        MySQL, MariaDB;

        boolean fallback = false;

        public boolean isFallback() {
            return false;
        }

        public void setFallback(boolean fallback) {
        }
    }
}
