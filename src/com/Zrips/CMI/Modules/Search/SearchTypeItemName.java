package com.Zrips.CMI.Modules.Search;

public class SearchTypeItemName extends SearchTypeItem {
    String name = null;

    public SearchTypeItemName(String name) {
        this(null, name);
    }

    public SearchTypeItemName(SearchTypeItem parent, String name) {
        super(parent);
    }

    public String getName() {
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
