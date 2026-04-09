package com.Zrips.CMI.Modules.Packets;

import java.lang.reflect.Field;

import org.bukkit.entity.Player;

public class PacketInjector {
    private static Field EntityPlayer_playerConnection = null;
    private Class<?> PlayerConnection = null;
    private static Field PlayerConnection_networkManager = null;
    private Class<?> NetworkManager = null;
    private Field channel = null;

    public PacketInjector() {
    }

    public void addPlayer(Player p) {
    }

    public void removePlayer(Player p) {
    }
}
