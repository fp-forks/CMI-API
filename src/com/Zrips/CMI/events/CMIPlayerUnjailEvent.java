package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public class CMIPlayerUnjailEvent extends CMIEvent {
    private CMIUser user = null;
    private CMIJailCell cell = null;

    public CMIPlayerUnjailEvent(CMIUser user, CMIJailCell cell) {
        super();
    }

    public CMIUser getUser() {
        return null;
    }

    public CMIJailCell getCell() {
        return null;
    }
}
