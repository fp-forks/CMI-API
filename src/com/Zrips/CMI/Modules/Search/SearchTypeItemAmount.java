package com.Zrips.CMI.Modules.Search;

public class SearchTypeItemAmount extends SearchTypeItem {
    int stackSize = 0;

    public SearchTypeItemAmount(int stackSize) {
        this(null, stackSize);
    }

    public SearchTypeItemAmount(SearchTypeItem parent, int stackSize) {
        super(parent);
    }

    public int getStackSize() {
        return 0;
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
