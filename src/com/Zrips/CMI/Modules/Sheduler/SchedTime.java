package com.Zrips.CMI.Modules.Sheduler;

import com.Zrips.CMI.Containers.CMIWeekday;

public class SchedTime {
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private int dayOfWeek = 0;
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private boolean done = false;
    private CMIWeekday firstDayOfMonth = null;
    private CMIWeekday lastDayOfMonth = null;
    long next = 0;

    public SchedTime() {
    }

    public Integer getYear() {
        return null;
    }

    public void setYear(Integer year) {
    }

    public Integer getMonth() {
        return null;
    }

    public void setMonth(Integer month) {
    }

    public Integer getDay() {
        return null;
    }

    public void setDay(Integer day) {
    }

    public Integer getHour() {
        return null;
    }

    public void setHour(Integer hour) {
    }

    public Integer getMinute() {
        return null;
    }

    public void setMinute(Integer minute) {
    }

    public Integer getSecond() {
        return null;
    }

    public void setSecond(Integer second) {
    }

    public boolean isNow() {
        return false;
    }

    public long getNextMili() {
        return 0;
    }

    public boolean isDone() {
        return false;
    }

    public void setDone(boolean done) {
    }

    public Integer getDayOfWeek() {
        return null;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
    }

    public CMIWeekday getFirstDayOfMonth() {
        return null;
    }

    public void setFirstDayOfMonth(CMIWeekday firstDayOfMonth) {
    }

    public CMIWeekday getLastDayOfMonth() {
        return null;
    }

    public void setLastDayOfMonth(CMIWeekday lastDayOfMonth) {
    }

    public String toString() {
        return null;
    }
}
