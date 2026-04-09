package com.Zrips.CMI.Modules.Dialogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import javax.annotation.Nullable;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.paper.dialog.Dialog;
import io.papermc.paper.registry.data.dialog.ActionButton;
import io.papermc.paper.registry.data.dialog.DialogBase;
import io.papermc.paper.registry.data.dialog.body.DialogBody;
import io.papermc.paper.registry.data.dialog.input.DialogInput;
import net.kyori.adventure.text.Component;

public class CMIDialog {
    private DialogBase base = null;
    private List<DialogBody> body = null;
    private List<ActionButton> buttons = null;
    private List<DialogInput> inputs = null;
    private ActionButton exitButton = null;
    private boolean canCloseWithESC = false;
    private Dialog dialog = null;
    private int collumns = 0;
    private boolean closeOnExit = false;
    private String title = null;
    private HashMap<String, Consumer<?>> callbacks = null;
    protected HashMap<String, Object> values = null;
    private CMICustomDialog customDialog = null;
    private Player player = null;

    public CMIDialog(CommandSender sender) {
        this(sender instanceof Player ? (Player) sender : null, "");
    }

    public CMIDialog(Player player) {
        this(player, "");
    }

    public CMIDialog(CommandSender sender, String title) {
        this(sender instanceof Player ? (Player) sender : null, title);
    }

    public CMIDialog(Player player, String title) {
    }

    public CMIDialog(Player player, CMICustomDialog customDialog) {
    }

    public static List<String> updateVariable(Player player, List<String> list) {
        return null;
    }

    public static String updateVariable(Player player, String list) {
        return null;
    }

    public void addMultiButton(CMIDialogButton button, Consumer<Player> onClick) {
    }

    public void addMultiButtons(List<CMIDialogButton> buttons) {
    }

    public void addMultiButton(CMIDialogButton button) {
    }

    public void addMultiButtonUrl(CMIDialogButton button) {
    }

    public void addMultiButtonCmdSuggestion(CMIDialogButton button) {
    }

    public void addVisuals(List<CMIDialogVisualField> visuals) {
    }

    public void addVisual(CMIDialogVisualField visual) {
    }

    public void addText(CMIDialogText dialogText) {
    }

    public static List<String> updateCommandVariables(List<String> input, Map<String, String> variables) {
        return null;
    }

    public static String updateCommandVariables(String input, Map<String, String> variables) {
        return null;
    }

    public void addItem(CMIDialogItem dialogItem) {
    }

    public void addInputs(List<CMIDialogInputField> inputs) {
    }

    @Nullable
    public String addBoolean(CMIDialogInputBoolean binput, Consumer<Boolean> consumer) {
        return null;
    }

    @Nullable
    public String addTextInput(CMIDialogInputText textInput, Consumer<String> consumer) {
        return null;
    }

    @Nullable
    public String addNumberRangeInput(CMIDialogInputSlider slider, Consumer<Float> consumer) {
        return null;
    }

    @Nullable
    public String addSingletonInput(CMIDialogInputSingletons singletons, Consumer<String> consumer) {
        return null;
    }

    public DialogBase createBase() {
        return null;
    }

    public static Component getComponent(String text) {
        return null;
    }

    public static Component getComponent(Player player, String text) {
        return null;
    }

    public static void showDialog(Player player, String name) {
    }

    public static CMICustomDialog getCustomDialog(Player player, String name) {
        return null;
    }

    public static Set<String> getDialogNames(CommandSender sender) {
        return null;
    }

    public static Set<String> getDialogNames(boolean includeHidden) {
        return null;
    }

    public int getCollumns() {
        return 0;
    }

    public void setCollumns(int collumns) {
    }

    public List<ActionButton> getButtons() {
        return null;
    }

    public void setButtons(List<ActionButton> buttons) {
    }

    public ActionButton getExitButton() {
        return null;
    }

    public DialogBase getBase() {
        return null;
    }

    public CMIDialog setBase(DialogBase base) {
        return null;
    }

    public List<DialogInput> getInputs() {
        return null;
    }

    public CMIDialog setInputs(List<DialogInput> inputs) {
        return null;
    }

    public List<DialogBody> getBody() {
        return null;
    }

    public CMIDialog setBody(List<DialogBody> body) {
        return null;
    }

    public boolean isCanCloseWithESC() {
        return false;
    }

    public CMIDialog setCanCloseWithESC(boolean canCloseWithESC) {
        return null;
    }

    public void show() {
    }

    public void show(CommandSender sender) {
    }

    public void show(Player player) {
    }

    public void addSaveButton(Consumer<Player> onClick) {
    }

    public void addSaveButton(CMIDialogButton button, Consumer<Player> onClick) {
    }

    public void addExitButton() {
    }

    public void addExitButton(CMIDialogButton button) {
    }

    public void addExitButton(CMIDialogButton button, Consumer<Player> onClick) {
    }

    public void addExitButtonUrl(CMIDialogButton button) {
    }

    public void close(Player player) {
    }

    public boolean isCloseOnExit() {
        return false;
    }

    public void setCloseOnExit(boolean closeOnExit) {
    }

    @Nullable
    public CMICustomDialog getCustomDialog() {
        return null;
    }
}
