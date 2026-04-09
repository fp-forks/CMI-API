package com.Zrips.CMI.Modules.TabList;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Version;

public class TabListHeaderFooterHandler {
    private Version version = null;
    private Method getHandle = null;
    private Method sendPacket = null;
    private Field playerConnection = null;
    private Class<?> nmsChatSerializer = null;
    private Class<?> IChatBaseComponent = null;
    private Class<?> packetType = null;
    private CMI plugin = null;

    public TabListHeaderFooterHandler(CMI plugin) {
    }

    public void send(Player receivingPacket, List<String> h, List<String> f) {
    }

    public void send(Player receivingPacket, String header, String footer) {
    }
}
