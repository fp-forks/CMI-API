package com.Zrips.CMI.Modules.Search;

public class SearchTypeItemLore extends SearchTypeItem {
    String lore = null;

    public SearchTypeItemLore(String lore) {
        this(null, lore);
    }

    public SearchTypeItemLore(SearchTypeItem parent, String lore) {
        super(parent);
    }

    public String getLore() {
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
