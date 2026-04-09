package com.Zrips.CMI.Modules.Search;

import org.bukkit.inventory.ItemStack;

public class SearchTypeItemExact extends SearchTypeItem {
    ItemStack searchedItem = null;

    public SearchTypeItemExact(ItemStack item) {
        this(null, item);
    }

    public SearchTypeItemExact(SearchTypeItem parent, ItemStack item) {
        super(parent);
    }

    public ItemStack getSearchedItem() {
        return null;
    }

    @Override
    protected boolean isValid() {
        return false;
    }

    @Override
    public String getSearchTypeName() {
        return null;
    }
}
