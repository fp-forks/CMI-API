package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;

import javax.annotation.Nonnull;

import org.bukkit.inventory.ItemStack;

public class CMIDialogItem extends CMIDialogVisualField {
    private String itemString = null;
    private ItemStack itemStack = null;
    private int height = 0;
    private int width = 0;
    private boolean tooltip = false;
    private boolean decorations = false;
    CMIDialogText text = null;

    public CMIDialogItem(ItemStack itemStack) {
        super();
    }

    public CMIDialogItem(String item) {
        super();
    }

    public String getItemString() {
        return null;
    }

    public CMIDialogText getText() {
        return null;
    }

    public int getHeight() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public boolean isTooltip() {
        return false;
    }

    public boolean isDecorations() {
        return false;
    }

    public CMIDialogItem setTooltip(boolean tooltip) {
        return null;
    }

    public CMIDialogItem setDecorations(boolean decorations) {
        return null;
    }

    public CMIDialogItem setHeight(int height) {
        return null;
    }

    public CMIDialogItem setWidth(int width) {
        return null;
    }

    public CMIDialogItem setText(CMIDialogText text) {
        return null;
    }

    @Override
    @Nonnull
    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogItem deserialize(Map<String, Object> entry) {
        return null;
    }

    public ItemStack getItemStack() {
        return null;
    }

    public void setItemStack(ItemStack itemStack) {
    }
}
