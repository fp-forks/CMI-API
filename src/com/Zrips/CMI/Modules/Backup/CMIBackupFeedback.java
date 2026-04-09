package com.Zrips.CMI.Modules.Backup;

import java.io.File;
import java.util.Map;

import com.Zrips.CMI.Modules.DataBase.DBDAO.DBTables;

public class CMIBackupFeedback {
    private File file = null;
    private Map<DBTables, Boolean> tables = null;

    public CMIBackupFeedback(File file, Map<DBTables, Boolean> table) {
    }

    public CMIBackupFeedback(File file) {
    }

    public File getFile() {
        return null;
    }

    public CMIBackupFeedback setFile(File file) {
        return null;
    }

    public CMIBackupFeedback setTables(Map<DBTables, Boolean> tables) {
        return null;
    }

    public Map<DBTables, Boolean> getTables() {
        return null;
    }
}
