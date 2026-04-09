package com.Zrips.CMI.Modules.Packets;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Holograms.FakeEntityInfo;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

public class PacketHandler extends ChannelDuplexHandler {
    private Player p = null;
    static ConcurrentHashMap<UUID, HashMap<packetNames, Long>> map = null;
    public static ConcurrentHashMap<Integer, FakeInfo> fakeEntities = null;
    public static ConcurrentHashMap<Integer, FakeEntityInfo> fakeEntities_v2 = null;
    public static ConcurrentHashMap<UUID, HashSet<Integer>> fakeEntitiesByPlayer = null;
    static Field entityIdField = null;
    static Field actionField = null;

    public PacketHandler(Player p) {
        super();
    }

    @Deprecated
    public static synchronized void addFakeEntity(FakeInfo fake) {
    }

    public static synchronized void addFakeEntity(FakeEntityInfo fake) {
    }

    @Deprecated
    public static synchronized void clearFakeEntities() {
    }

    @Deprecated
    public static synchronized void removeFakeEntity(FakeInfo fake) {
    }

    public static synchronized void removeFakeEntity(FakeEntityInfo fake) {
    }

    public static synchronized void clearCache(UUID uuid) {
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object m, ChannelPromise promise) throws Exception {
    }

    @Override
    public void channelRead(ChannelHandlerContext c, Object m) throws Exception {
    }

    private enum packetNames {
        PacketPlayInSetCreativeSlot,
        PacketPlayInUseEntity,
        ServerboundInteractPacket,
        PacketPlayOutPlayerInfo,
        PacketPlayOutEntityVelocity,
        PacketPlayOutEntityTeleport,
        PacketPlayOutLookAt,
        PacketPlayOutCamera,
        PacketPlayOutEntityHeadRotation,
        PacketStatusOutServerInfo,
        PacketPlayOutScoreboardTeam,
        PacketPlayOutChat,
        PacketHandshakingInSetProtocol;

        static Class<?> packet = null;

        public static packetNames get(String name) {
            return null;
        }

        public Class<?> getPacket() {
            return null;
        }
    }
}
