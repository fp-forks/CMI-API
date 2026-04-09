package com.Zrips.CMI.commands.list;

import java.text.DecimalFormat;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class status implements Cmd {
    static final DecimalFormat df = null;
    private static String javaVersion = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Show server status", regVar = { 0 }, consoleVar = { 0 }, customAlias = { "gc", "!lag" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    class Data {
        private int tileEntities = 0;
        private int entities = 0;
        private int players = 0;
        private int loadedChunks = 0;
        private int mostTileEntities = 0;
        private String mostTileEntitiesAt = null;
        private int mostEntities = 0;
        private String mostEntitiesAt = null;

        public Data(int players, int loadedChunks) {
        }

        public int getTileEntities() {
            return 0;
        }

        public int getEntities() {
            return 0;
        }

        public void add(int x, int z, int tileEntities, int entities) {
        }

        public String getMostTileEntitiesAt() {
            return null;
        }

        public String getMostEntitiesAt() {
            return null;
        }

        public int getMostTileEntities() {
            return 0;
        }

        public int getMostEntities() {
            return 0;
        }

        public int getPlayerCount() {
            return 0;
        }

        public int getLoadedChunks() {
            return 0;
        }
    }
}
