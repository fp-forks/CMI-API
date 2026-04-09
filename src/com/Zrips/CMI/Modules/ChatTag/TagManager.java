package com.Zrips.CMI.Modules.ChatTag;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class TagManager {
    private CMI plugin = null;
    private boolean ChatTagEnabled = false;
    private boolean HardCoreMode = false;
    private boolean OnlyWhenAfk = false;
    private String ChatTagColor = null;
    private boolean ChatTagRemoveEta = false;
    List<String> commands = null;

    public TagManager(CMI plugin) {
    }

    public void load(ConfigReader cfg) {
    }

    @Deprecated
    public String tag(Player player, String msg, String format) {
        return null;
    }

    public String tag(Player player, String msg, String format, boolean performCmds) {
        return null;
    }

    public String tag(CMIUser senderUser, String msg, String format, boolean performCmds) {
        return null;
    }

    public String getChatTagColor() {
        return null;
    }

    public boolean isChatTagRemoveEta() {
        return false;
    }

    public boolean isChatTagEnabled() {
        return false;
    }

    public boolean isHardCoreMode() {
        return false;
    }

    public void setHardCoreMode(boolean hardCoreMode) {
    }
}
