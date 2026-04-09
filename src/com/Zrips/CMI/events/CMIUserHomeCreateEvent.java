package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Homes.CmiHome;

public class CMIUserHomeCreateEvent extends CMIUserCancellableEvent {
    private CmiHome home = null;

    public CMIUserHomeCreateEvent(CMIUser user, CmiHome home) {
        super(user);
    }

    public CmiHome getHome() {
        return null;
    }
}
