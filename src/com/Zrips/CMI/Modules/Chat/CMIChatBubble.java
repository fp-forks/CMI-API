package com.Zrips.CMI.Modules.Chat;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Components.CMIComponentBase;
import com.Zrips.CMI.Modules.Display.CMITextDisplay;
import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramFadeAnimation;

import net.Zrips.CMILib.Version.Schedulers.CMITask;
import net.Zrips.CMILib.Version.Schedulers.CMITaskResult;

public class CMIChatBubble {
    private CMITextDisplay tDisplay = null;
    private Player player = null;
    private Location originPoint = null;
    private CMIComponentBase text = null;
    private long startTime = 0;
    private long endTime = 0;
    private Set<Player> receivers = null;
    private CMITask schedId = null;
    private CompletableFuture<CMITaskResult> initTask = null;
    CMIHologramFadeAnimation faneId = null;

    public CMIChatBubble(Player player, String text, Set<Player> receivers) {
        this(player, CMIComponentBase.quickAdd(text), receivers);
    }

    public CMIChatBubble(Player player, CMIComponentBase text, Set<Player> receivers) {
    }

    public void show() {
    }

    public CompletableFuture<Void> delete() {
        return null;
    }

    public CMITextDisplay getDisplay() {
        return null;
    }
}
