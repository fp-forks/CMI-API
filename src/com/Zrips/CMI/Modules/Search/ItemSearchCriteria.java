package com.Zrips.CMI.Modules.Search;

import java.util.Set;
import java.util.regex.Pattern;

public enum ItemSearchCriteria {
    MATERIAL, NAME, LORE, ENCHANT, MODELDATA, POTION, AMOUNT, EXACT, OVERSIZE;

    private static String prefix = null;
    private static Pattern pname = null;
    private static Pattern plore = null;
    private static Pattern penchant = null;
    private static Pattern pmodel = null;

    public static ItemSearchCriteria getByName(String name) {
        return null;
    }

    public static Set<ItemSearchCriteria> getFromString(String criteria) {
        return null;
    }
}
