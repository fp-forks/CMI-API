package com.Zrips.CMI.Modules.PlayTime;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIPlayDay {
    Long[] map = null;
    private long lastUpdate = 0;
    private CMIUser user = null;
    private int date = 0;
    private int id = 0;
    private final static Long maxValue = null;

    public CMIPlayDay(CMIUser user, int date) {
    }

    public long getLastUpdate() {
        return 0;
    }

    public Long getTotalTime() {
        return null;
    }

    public void setLastUpdate(Long lastUpdate) {
    }

    public void updatePlayTime() {
    }

    public void checkPreviousHour(int hour) {
    }

    public Long getCurrentHourPlaytime() {
        return null;
    }

    public Long getHourPlaytime(int hour) {
        return null;
    }

    public void setHourPlaytime(int hour, Long playTime, boolean overTime) {
    }

    public int getDate() {
        return 0;
    }

    public Integer getId() {
        return null;
    }

    public void setId(Integer id) {
    }
}
