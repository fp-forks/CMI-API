package com.Zrips.CMI.Modules.Search;

import org.bukkit.Material;

public class SearchTypeItemMaterial extends SearchTypeItem {
    Material material = null;

    public SearchTypeItemMaterial(Material material) {
        this(null, material);
    }

    public SearchTypeItemMaterial(SearchTypeItem parent, Material material) {
        super(parent);
    }

    public Material getMaterial() {
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
