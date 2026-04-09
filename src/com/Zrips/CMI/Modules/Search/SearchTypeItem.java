package com.Zrips.CMI.Modules.Search;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class SearchTypeItem extends SearchTypeContentsBase {
    SearchTypeItem parent = null;
    private CMIPlayerSearchPlaceType currentCheckPlace = null;
    Set<CMIDataResultBase> results = null;
    private UUID uuid = null;
    private ItemStack itemToCompare = null;
    protected int checkTotalAmount = 0;
    Map<CMIPlayerSearchPlaceType, CMIDataResultItem> totalCountResult = null;

    public SearchTypeItem(SearchTypeItem parent) {
        super();
    }

    public synchronized void setCurrentCheckedLocation(CMIPlayerSearchPlaceType type) {
    }

    protected CMIDataResultItem getTotalCountResult(CMIPlayerSearchPlaceType type) {
        return null;
    }

    protected void setTotalCountResult(CMIDataResultItem result) {
    }

    protected void clearTotalCountResult() {
    }

    protected UUID getCurrentUUID() {
        return null;
    }

    public void setCurrentUUID(UUID player) {
    }

    protected ItemStack getItemToCompare() {
        return null;
    }

    protected int getCheckTotalAmount() {
        return 0;
    }

    protected void setItemToCompare(ItemStack itemStack) {
    }

    protected void addResult(CMIDataResultBase result) {
    }

    @Override
    public Set<CMIDataResultBase> checkContent(ItemStack[] contents) {
        return null;
    }

    public void finishedLocationCheck() {
    }

    protected boolean checkShulkerBundle() {
        return false;
    }

    protected boolean isValid() {
        return false;
    }
}
