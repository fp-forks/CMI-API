package com.Zrips.CMI.Modules.BungeeCord;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

import com.google.gson.Gson;

public class ServerListPing {
    private InetSocketAddress host = null;
    private int timeout = 0;
    private Gson gson = null;

    public ServerListPing(String ip, int port) {
    }

    public ServerListPing(InetSocketAddress host) {
    }

    public InetSocketAddress getAddress() {
        return null;
    }

    void setTimeout(int timeout) {
    }

    int getTimeout() {
        return 0;
    }

    public int readVarInt(DataInputStream in) throws IOException {
        return 0;
    }

    public void writeVarInt(DataOutputStream out, int paramInt) throws IOException {
    }

    public StatusResponse fetchData() throws IOException {
        return null;
    }

    public class Description {
        private String text = null;

        public String getText() {
            return null;
        }
    }

    public class Description116 {
        private Gson text = null;

        public Gson getText() {
            return null;
        }
    }

    public class StatusResponse {
        private String description = null;
        private Players players = null;
        private Version version = null;
        private String favicon = null;
        private int time = 0;

        public String getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }

        public void setDescription(String description) {
        }

        public void setPlayers(Players players) {
        }

        public void setVersion(Version version) {
        }

        public void setFavicon(String favicon) {
        }
    }

    public class StatusResponse19 {
        private Description description = null;
        private Players players = null;
        private Version version = null;
        private String favicon = null;
        private int time = 0;

        public Description getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }
    }

    public class StatusResponse116 {
        private Description116 description = null;
        private Players players = null;
        private Version version = null;
        private String favicon = null;
        private int time = 0;

        public Description116 getDescription() {
            return null;
        }

        public Players getPlayers() {
            return null;
        }

        public Version getVersion() {
            return null;
        }

        public String getFavicon() {
            return null;
        }

        public int getTime() {
            return 0;
        }

        public void setTime(int time) {
        }
    }

    public class Players {
        private int max = 0;
        private int online = 0;
        private List<Player> sample = null;

        public int getMax() {
            return 0;
        }

        public int getOnline() {
            return 0;
        }

        public List<Player> getSample() {
            return null;
        }
    }

    public class Player {
        private String name = null;
        private String id = null;

        public String getName() {
            return null;
        }

        public String getId() {
            return null;
        }
    }

    public class Version {
        private String name = null;
        private String protocol = null;

        public String getName() {
            return null;
        }

        public String getProtocol() {
            return null;
        }
    }
}
