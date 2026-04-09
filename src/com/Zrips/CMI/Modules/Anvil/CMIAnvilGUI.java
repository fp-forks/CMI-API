package com.Zrips.CMI.Modules.Anvil;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilGUI {
    private boolean colorrename = false;
    private Player player = null;
    private String title = null;
    private String defaulttext = null;
    private Inventory inventory = null;
    private HashMap<AnvilSlot, ItemStack> items = null;
    private Listener listener = null;
    private AnvilClickEventHandler handler = null;
    private static Class<?> BlockPosition = null;
    private static Class<?> PacketPlayOutOpenWindow = null;
    private static Class<?> ContainerAnvil = null;
    private static Class<?> ChatMessage = null;
    private static Class<?> EntityHuman = null;
    private static Class<?> ContainerAccess = null;
    private static Class<?> Containers = null;
    private static Class<?> Container = null;
    private static boolean useNewVersion = false;

    public CMIAnvilGUI(Player Player, AnvilClickEventHandler Handler) {
    }

    public boolean getColorRename() {
        return false;
    }

    public void setColorRename(boolean ColorRename) {
    }

    public Player getPlayer() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public void setTitle(String Title) {
    }

    public String getDefaultText() {
        return null;
    }

    public void setDefaultText(String DefaultText) {
    }

    public ItemStack getSlot(AnvilSlot Slot) {
        return null;
    }

    public void setSlot(AnvilSlot Slot, ItemStack Item) {
    }

    public String getSlotName(AnvilSlot Slot) {
        return null;
    }

    public void setSlotName(AnvilSlot Slot, String Name) {
    }

    public void open() {
    }

    public Field getField(Class<?> clazz, String fieldName) throws Exception {
        return null;
    }

    public void open(String Title) {
    }

    public enum AnvilSlot {
        INPUT_LEFT(0), INPUT_RIGHT(1), OUTPUT(2);

        private int slot = 0;

        private AnvilSlot(int Slot) {
        }

        public int getSlot() {
            return 0;
        }

        public static AnvilSlot bySlot(int Slot) {
            return null;
        }
    }

    public interface AnvilClickEventHandler {
        public void onAnvilClick(AnvilClickEvent event);

        public void onAnvilClose(InventoryCloseEvent event);
    }

    public class AnvilClickEvent {
        private AnvilSlot slot = null;
        private ItemStack item = null;
        private String text = null;

        public AnvilClickEvent(AnvilSlot Slot, ItemStack Item, String Text) {
        }

        public AnvilSlot getSlot() {
            return null;
        }

        public ItemStack getItemStack() {
            return null;
        }

        public void setItemStack(ItemStack Item) {
        }

        public boolean hasText() {
            return false;
        }

        public String getText() {
            return null;
        }
    }
}
