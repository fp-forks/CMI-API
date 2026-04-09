package com.Zrips.CMI.Modules.Homes;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CmiHome {
    private CMILocation loc = null;
    private String name = null;
    private CMIHomeSettings settings = null;

    public CmiHome(String name, CMILocation loc) {
    }

    public CmiHome(String name, CMILocation loc, boolean privateH) {
    }

    public CMILocation getLoc() {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean isPrivate() {
        return false;
    }

    public void setPrivate(boolean privateH) {
    }

    public CMIHomeSettings getSettings() {
        return null;
    }

    public CMIMaterial getIconMaterial() {
        return null;
    }

    public CMIMaterial getMaterial() {
        return null;
    }

    public void setMaterial(CMIMaterial material) {
    }

    public Integer getSlot() {
        return null;
    }

    public void setSlot(Integer slot) {
    }

    public boolean isBed() {
        return false;
    }

    public void setBed(boolean bed) {
    }

    public boolean isFavorite() {
        return false;
    }

    public void setFavorite(boolean fav) {
    }

    public void teleportPlayerTo(CommandSender sender, Player player, CMIUser owner) {
    }
}
