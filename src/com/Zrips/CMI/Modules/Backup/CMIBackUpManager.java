package com.Zrips.CMI.Modules.Backup;

import java.io.File;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBDAO.DBTables;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIBackUpManager {
    private static String databaseBackups = null;
    private static CMITask task = null;
    private static boolean enabled = false;
    private static boolean zip = false;
    private static int maxBackups = 0;
    private static int intervalBetween = 0;
    private static Set<DBTables> autoTablesToSave = null;
    private static Set<DBTables> manualTablesToSave = null;
    private static String defaultSuffix = null;
    private static boolean unzipping = false;

    public static void onStop() {
    }

    public static void loadConfig() {
    }

    public static File zipFile(File dbFile) {
        return null;
    }

    public static File unzipFile(CommandSender sender, File zipFile) {
        return null;
    }

    public static CompletableFuture<File> getFileAsync(String fileName) {
        return null;
    }

    public static void cleanOldBackups() {
    }

    public static CompletableFuture<CMIBackupFeedback> backupDataBase() {
        return null;
    }

    public static CompletableFuture<CMIBackupFeedback> backupDataBase(DBTables... tables) {
        return null;
    }

    public static CompletableFuture<CMIBackupFeedback> backupDataBase(String fileName, DBTables... tables) {
        return null;
    }

    @SuppressWarnings("resource")
    public static CompletableFuture<CMIBackupFeedback> backupDataBase(File file, DBTables... tables) {
        return null;
    }

    public static CompletableFuture<CMIBackupFeedback> restoreUserFromBackup(CommandSender sender, CMIUser user, DBTables... tables) {
        return null;
    }

    public static CompletableFuture<CMIBackupFeedback> restoreUserFromBackup(CommandSender sender, CMIUser user, File file, DBTables... tables) {
        return null;
    }

    public static File getLatestBackup() {
        return null;
    }
}
