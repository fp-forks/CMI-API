package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIItemStack;

public class PlayerOptionsManager {
    private CMI plugin = null;
    private Boolean guiCloseButton = null;
    private int guiCloseButtonSlot = 0;
    private CMIItemStack guiCloseButtonItem = null;
    private List<String> guiCloseButtonCommands = null;
    private boolean guiInfoButton = false;
    private int guiInfoButtonSlot = 0;
    private CMIItemStack guiInfoButtonItem = null;
    private List<String> guiInfoButtonCommands = null;
    public static String defaultString = null;

    public PlayerOptionsManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void openOptionGUI(CMIUser user) {
    }

    public void openOptionGUI(Player sender, CMIUser user) {
    }
}
