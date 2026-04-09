package com.Zrips.CMI.Modules.TagName;

import com.Zrips.CMI.CMI;

public class TagNameManager {
    private CMI plugin = null;

    public TagNameManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public enum TeamAction {
        CREATE, UPDATE, DESTROY;
    }
}
