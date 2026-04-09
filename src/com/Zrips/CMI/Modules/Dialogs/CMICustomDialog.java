package com.Zrips.CMI.Modules.Dialogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CMICustomDialog {
    private String name = null;
    private boolean enabled = false;
    private boolean closeOnExit = false;
    private String label = null;
    private List<CMIDialogVisualField> visualFields = null;
    private List<CMIDialogInputField> inputFields = null;
    private int columns = 0;
    private List<CMIDialogButton> buttons = null;
    private CMIDialogButton closeButton = null;
    private HashMap<UUID, CMIDialog> dialog = null;
    protected HashMap<UUID, HashMap<String, Object>> values = null;
    private Map<String, String> variables = null;
    private CMICustomDialogCondition condition = null;

    public CMICustomDialog(String name) {
    }

    public String getName() {
        return null;
    }

    public void clearCache(UUID uuid) {
    }

    public CMIDialog getCMIDialog(Player player) {
        return null;
    }

    public CMICustomDialog show(Player player) {
        return null;
    }

    public CMICustomDialog build(Player player) {
        return null;
    }

    public void reset() {
    }

    public CMICustomDialog setEnabled(boolean enabled) {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    @Nullable
    public List<CMIDialogButton> getButtons() {
        return null;
    }

    public CMICustomDialog setButtons(List<CMIDialogButton> buttons) {
        return null;
    }

    public CMICustomDialog addButton(CMIDialogButton button) {
        return null;
    }

    @NotNull
    public String getLabel() {
        return null;
    }

    public CMICustomDialog setLabel(String label) {
        return null;
    }

    public int getColumns() {
        return 0;
    }

    public CMICustomDialog setColumns(int columns) {
        return null;
    }

    public CMIDialogButton getCloseButton() {
        return null;
    }

    public CMICustomDialog setCloseButton(CMIDialogButton closeButton) {
        return null;
    }

    public CMICustomDialog setCloseButtonLabel(String closeButtonLabel) {
        return null;
    }

    public boolean isCloseOnExit() {
        return false;
    }

    public CMICustomDialog setCloseOnExit(boolean closeOnExit) {
        return null;
    }

    public static CMICustomDialog deserialize(String name, Map<String, Object> entry) {
        return null;
    }

    public List<CMIDialogVisualField> getVisualFields() {
        return null;
    }

    public CMICustomDialog setVisualFields(List<CMIDialogVisualField> visualFields) {
        return null;
    }

    public CMICustomDialog addVisualField(CMIDialogVisualField visualField) {
        return null;
    }

    public List<CMIDialogInputField> getInputFields() {
        return null;
    }

    public CMICustomDialog setInputFields(List<CMIDialogInputField> inputFields) {
        return null;
    }

    public CMICustomDialog addInputField(CMIDialogInputField inputField) {
        return null;
    }

    @NotNull
    public CMICustomDialogCondition getCondition() {
        return null;
    }

    public CMICustomDialog setCondition(CMICustomDialogCondition condition) {
        return null;
    }

    public Map<String, String> getVariables() {
        return null;
    }

    public CMICustomDialog setVariables(Map<String, String> variables) {
        return null;
    }
}
