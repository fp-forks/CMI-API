package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.entity.Player;

public class SearchTypeFlyMode extends SearchTypePlayerBase {
    boolean allowFlight = false;

    public SearchTypeFlyMode(boolean allowFlight) {
        super();
    }

    @Override
    public Set<CMIDataResultBase> checkPlayer(Player player) {
        return null;
    }

    @Override
    public String getSearchTypeName() {
        return null;
    }
}
