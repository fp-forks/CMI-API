package com.Zrips.CMI.Modules.PlayTimeRewards;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PlayTimeRewardsManager {
    private CMI plugin = null;
    private HashMap<String, PTRRepeat> repeatableRewards = null;
    private TreeMap<Long, PTROneTime> oneTimeRewards = null;
    private TreeMap<String, PTROneTime> oneTimeRewardsByName = null;
    private CMITask sched = null;
    private int interval = 0;
    private int OneTimeAmount = 0;
    private Long RewardInform = null;
    private boolean Enabled = false;
    private boolean ExcludeAfk = false;
    public static boolean RequiresPermission = false;
    private HashMap<CMIUser, Long> lastAction = null;
    HashMap<UUID, Long> informMap = null;
    private String fileName = null;
    ConcurrentHashMap<UUID, PlaytimeClaimCache> cache = null;

    public PlayTimeRewardsManager(CMI plugin) {
    }

    public void stop() {
    }

    public void loadConfig() {
    }

    public void removeFromAfkAction(CMIUser user) {
    }

    public void updateAfkAction(CMIUser user) {
    }

    public Long getAfkAction(CMIUser user) {
        return null;
    }

    public void informPlayer(Player player, String rewardName) {
    }

    public void load() {
    }

    public void clearCache(UUID uuid) {
    }

    public int getClaimableRewardCount(CMIUser user) {
        return 0;
    }

    public HashMap<String, PTRRepeat> getRepeatableRewards() {
        return null;
    }

    public void setRepeatableRewards(HashMap<String, PTRRepeat> repeatableRewards) {
    }

    public TreeMap<Long, PTROneTime> getOneTimeRewards() {
        return null;
    }

    public void setOneTimeRewards(TreeMap<Long, PTROneTime> oneTimeRewards) {
    }

    public PTROneTime getOneTimeRewardByName(String name) {
        return null;
    }

    public PTRRepeat getRepeatingRewardByName(String name) {
        return null;
    }

    public int getOneTimeAmount() {
        return 0;
    }

    public void setOneTimeAmount(int oneTimeAmount) {
    }

    public boolean isExcludeAfk() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }
}
