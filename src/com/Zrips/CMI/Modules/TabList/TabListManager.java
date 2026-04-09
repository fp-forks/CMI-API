package com.Zrips.CMI.Modules.TabList;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TabListManager {
    private HashMap<Integer, TabList> TabList = null;
    private CMI plugin = null;
    private CMITask sched = null;
    private CMITask sortSched = null;
    private double interval = 0.0;
    private boolean async = false;
    private boolean UpdateTabListNames = false;
    private boolean GroupedEnabled = false;
    private boolean UpdatesOnJoin = false;
    private boolean UpdatesOnLeave = false;
    private boolean UpdatesOnWorldChange = false;
    private boolean UpdatesOnPlayerDeath = false;
    private boolean UpdatesOnAfkStateChange = false;
    private boolean UpdatesOnPlayerTeleport = false;
    private boolean UpdatesOnNickChange = false;
    private boolean addTabListHeader = false;
    private boolean addTabListFooter = false;
    private boolean sortingEnabled = false;
    private CMITabSortingType sortingType = null;
    private CMITabSortingOrder sortingOrder = null;
    private List<String> SortingCustomGroup = null;
    private int SortingBalanceInterval = 0;
    private int SortingAutoUpdate = 0;
    private String fileName = null;

    public TabListManager(CMI plugin) {
    }

    public void stop() {
    }

    public void loadConfig() {
    }

    public TabList getTL(Player player) {
        return null;
    }

    public void updateTabList(int delay) {
    }

    public void updateTabList() {
    }

    public void updateTablistName(Player player) {
    }

    public void updateTabList(Player player) {
    }

    public void updateTabListSync(Player player) {
    }

    public void updateTabListAsync(Player player) {
    }

    public boolean isUpdatesOnJoin() {
        return false;
    }

    public boolean isUpdatesOnLeave() {
        return false;
    }

    public boolean isUpdatesOnWorldChange() {
        return false;
    }

    public boolean isUpdatesOnPlayerDeath() {
        return false;
    }

    public boolean isUpdatesOnPlayerTeleport() {
        return false;
    }

    public boolean isUpdatesOnNickChange() {
        return false;
    }

    public boolean isUpdatesOnAfkStateChange() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isUpdateTabListNames() {
        return false;
    }

    public boolean isSortingEnabled() {
        return false;
    }

    public CMITabSortingType getSortingType() {
        return null;
    }

    public CMITabSortingOrder getSortingOrder() {
        return null;
    }
}
