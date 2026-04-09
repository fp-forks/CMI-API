package com.Zrips.CMI.Modules.ModuleHandling;

import net.Zrips.CMILib.Version.Version;

public class CMIModuleClass {
    private Class<?> listener = null;
    private Version from = null;
    private Version to = null;
    private CMIModuleServerType type = null;

    public CMIModuleClass(Class<?> listener) {
        this(listener, null, null, CMIModuleServerType.Any);
    }

    public CMIModuleClass(Class<?> listener, Version from, CMIModuleServerType type) {
        this(listener, from, null, type);
    }

    public CMIModuleClass(Class<?> listener, Version from) {
        this(listener, from, null, CMIModuleServerType.Any);
    }

    public CMIModuleClass(Class<?> listener, Version from, Version to) {
        this(listener, from, to, CMIModuleServerType.Any);
    }

    public CMIModuleClass(Class<?> listener, Version from, Version to, CMIModuleServerType type) {
    }

    public Version getFrom() {
        return null;
    }

    public Version getTo() {
        return null;
    }

    public Class<?> getListener() {
        return null;
    }

    public CMIModuleServerType getType() {
        return null;
    }
}
