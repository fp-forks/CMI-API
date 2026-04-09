package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.EventActions.EventActionManager.eventAction;

public class CMIEventCommandEvent extends CMIPlayerCancellableEvent {
    private final eventAction action = null;
    private List<String> commands = null;
    private List<String> sourceCommands = null;
    private Player source = null;

    public CMIEventCommandEvent(Player player, Player source, eventAction action, List<String> commands, List<String> sourceCommands) {
        super(player);
    }

    public eventAction getAction() {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    @Deprecated
    public void setCommands(List<String> commands) {
    }

    public Player getSource() {
        return null;
    }

    public void setSource(Player source) {
    }

    public List<String> getSourceCommands() {
        return null;
    }
}
