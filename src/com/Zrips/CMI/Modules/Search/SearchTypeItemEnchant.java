package com.Zrips.CMI.Modules.Search;

import org.bukkit.enchantments.Enchantment;

public class SearchTypeItemEnchant extends SearchTypeItem {
    Enchantment enchant = null;
    int level = 0;

    public SearchTypeItemEnchant(Enchantment enchant, int level) {
        this(null, enchant, level);
    }

    public SearchTypeItemEnchant(SearchTypeItem parent, Enchantment enchant, int level) {
        super(parent);
    }

    public Enchantment getEnchant() {
        return null;
    }

    public int getLevel() {
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
