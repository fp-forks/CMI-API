package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Version.Version;

public enum PlayerOption {
    visibleHolograms("holograms", "{gcp}Visible holograms", CMIMaterial.BLACK_STAINED_GLASS),
    shiftSignEdit("shiftedit", "{gcp}Sign shift edit", CMIMaterial.OAK_SIGN),
    totemBossBar("totembar", "{gcp}Totem BossBar", CMIMaterial.TOTEM_OF_UNDYING),
    bossBarCompass("compass", "{gcp}Compass BossBar", CMIMaterial.COMPASS),
    tagSound("{gcp}Chat tagging sound", CMIMaterial.PAPER),
    chatSpy(false, "{gcp}Chat spy", CMIMaterial.BUCKET),
    cmdSpy(false, "{gcp}Command spy", CMIMaterial.WATER_BUCKET),
    signSpy(false, "{gcp}Sign spy", CMIMaterial.LAVA_BUCKET),
    acceptingPM("msg", "{gcp}Accepting private messages", CMIMaterial.MAP),
    acceptingTPA("tp", "{gcp}Accepting teleportations to you", CMIMaterial.CLOCK),
    acceptingMoney("pay", "{gcp}Accepting money payments", CMIMaterial.KNOWLEDGE_BOOK),
    chatbubble("{gcp}Chat bubbles", CMIMaterial.LANTERN, Version.v1_19_R3),
    pmSound("{gcp}Private messages sounds", CMIMaterial.STONE_BUTTON),
    rideMe("{gcp}Players can ride you", CMIMaterial.SADDLE),
    pveDamageNumbers("pvenumbers", "{gcp}Shows PvE damage numbers", CMIMaterial.WOODEN_SWORD),
    pvpDamageNumbers("pvpnumbers", "{gcp}Shows PvP damage numbers", CMIMaterial.DIAMOND_SWORD),
    InformDurability("durability", "{gcp}Inform on item durability loss", CMIMaterial.ANVIL),
    receivePets("{gcp}Do you want to receive pets as gifts", CMIMaterial.LEAD),
    deathMessages("{gcp}Do you want to show death messages", CMIMaterial.DEAD_BUSH),
    notarget(false, "{gcp}Do you want to be ignored by mobs", CMIMaterial.BEDROCK);

    private int slot = 0;
    private boolean defaults = false;
    private boolean globalEnabled = false;
    private ItemStack icon = null;
    private String desc = null;
    private String shortName = null;
    private Version versionFrom = null;
    private static HashMap<String, PlayerOption> cache = null;
    public static String defaultString = null;

    PlayerOption(String desc, CMIMaterial icon, Version version) {
        this(10, true, null, desc, icon, version);
    }

    PlayerOption(boolean defaults, String desc, CMIMaterial icon) {
        this(10, defaults, null, desc, icon, null);
    }

    PlayerOption(String shortName, String desc, CMIMaterial icon) {
        this(10, true, shortName, desc, icon, null);
    }

    PlayerOption(String desc, CMIMaterial icon) {
        this(10, true, null, desc, icon, null);
    }

    PlayerOption(int slot, boolean defaults, String shortName, String desc, CMIMaterial icon, Version version) {
    }

    public int getUISlot() {
        return 0;
    }

    public boolean isEnabled() {
        return false;
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String desc) {
    }

    void setEnabled(Boolean state) {
    }

    public void afterToggle(CMIUser user, boolean state) {
    }

    public static PlayerOption get(String name) {
        return null;
    }

    public static HashMap<PlayerOption, Boolean> fromString(String line) {
        return null;
    }

    public static String toString(HashMap<PlayerOption, Boolean> map) {
        return null;
    }

    public static String toDefaultValueString() {
        return null;
    }

    public boolean isGlobalEnabled() {
        return false;
    }

    public void setGlobalEnabled(boolean globalEnabled) {
    }

    public ItemStack getIcon() {
        return null;
    }

    public void setIcon(ItemStack icon) {
    }

    public Version getVersionFrom() {
        return null;
    }

    public String getShortName() {
        return null;
    }
}
