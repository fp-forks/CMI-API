package com.Zrips.CMI.Modules.DataBase_NEW;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class DBManager_NEW {
    private DBDAO_NEW dao = null;
    private CMI plugin = null;
    int autoSaveInterval = 0;
    private boolean ForceSaveOnLogOut = false;
    private boolean ForceLoadOnLogIn = false;
    private static final String fileName = null;
    private String username = null;
    private String password = null;
    private String hostname = null;
    private String database = null;
    private String prefix = null;
    private boolean autoReconnect = false;
    private boolean useSSL = false;
    private boolean verifyServerCertificate = false;
    private ConcurrentHashMap<CMIUser, InvSave> invToSave = null;
    private Set<CMIUser> playerListToSave = null;
    private Set<CMIUser> playerPlayTimeRewardToSave = null;
    CMITask autosaveBukkitId = null;
    CompletableFuture<Void> task = null;
    Long startedAt = null;
    private Runnable autoSave = null;
    HashMap<String, CMIUser> getPlayerId = null;
    HashMap<Integer, CMIUser> getPlayerInvId = null;
    HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId = null;
    HashMap<Integer, CMIUser> getPlayerPlayTimeRewardId = null;
    Boolean all = null;
    Integer oldRapidvalue = null;
    boolean startingDb = false;

    public DBManager_NEW(CMI plugin) {
    }

    public DBDAO_NEW getDB() {
        return null;
    }

    public boolean isConnected() {
        return false;
    }

    public void closeConnections() {
    }

    public void switchDataBase() {
    }

    public void load() {
    }

    public CMISqlType getDbType() {
        return null;
    }

    public void stop() {
    }

    public void start() {
    }

    public void addForSave(CMIUser user) {
    }

    public void addForPlayTimeRewardSave(CMIUser user) {
    }

    public void addForSave(CMIUser user, String inventory) {
    }

    public void clear() {
    }

    public void saveAllInNextCicle() {
    }

    public void saveBatchAsync(boolean allEntries) {
    }

    public void startRapidSave() {
    }

    public void saveBatch(boolean all) {
    }

    public boolean isRapidModeEnabled() {
        return false;
    }

    public boolean isForceSaveOnLogOut() {
        return false;
    }

    public boolean isForceLoadOnLogIn() {
        return false;
    }

    class InvSave {
        private CMIUser user = null;
        private String inv = null;

        public InvSave(CMIUser user, String inv) {
        }

        public String getInv() {
            return null;
        }

        public CMIUser getUser() {
            return null;
        }
    }
}
