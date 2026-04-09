package com.Zrips.CMI.Modules.Search;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

public class CMIPlayerDataSearch extends CMIDataSearch {
    protected static CMIPlayerDataSearch activeSearch = null;
    private List<OfflinePlayer> players = null;
    private ConcurrentHashMap<UUID, ConcurrentHashMap<CMIPlayerSearchPlaceType, CMIDataResultPlayerBase>> foundIn = null;

    public CMIPlayerDataSearch(CommandSender sender) {
        super(sender);
    }

    public static CMIPlayerDataSearch getActiveSearch() {
        return null;
    }

    protected static void setActiveSearch(CMIPlayerDataSearch newSearch) {
    }

    public ConcurrentMap<UUID, ConcurrentHashMap<CMIPlayerSearchPlaceType, CMIDataResultPlayerBase>> getSearchResults() {
        return null;
    }

    @Override
    public void search() {
    }

    @Override
    protected void initSearch() {
    }
}
