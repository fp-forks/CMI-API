package com.Zrips.CMI.Modules.Economy;

import java.util.HashMap;
import java.util.Map;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;

public class CMIEconomyAcount {
    private Map<WorldGroup, Double> balances = null;
    private CMIUser user = null;
    private double lastKnownBalance = 0.0;

    public CMIEconomyAcount(CMIUser user) {
    }

    public WorldGroup getCurrentWorldGroup() {
        return null;
    }

    public String getCurrentWorldGroupName() {
        return null;
    }

    public Double setBalance(double amount) {
        return null;
    }

    public Double setBalance(WorldGroup defaultGroup, double amount) {
        return null;
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save) {
        return null;
    }

    public Double setBalance(WorldGroup defaultGroup, double amount, boolean save, boolean reloading) {
        return null;
    }

    public Double getBalance() {
        return null;
    }

    public Double getBalance(String worldName) {
        return null;
    }

    public String getFormatedBalance() {
        return null;
    }

    public String getFormatedBalance(boolean shorts) {
        return null;
    }

    public String getFormatedBalance(String worldName) {
        return null;
    }

    public String getFormatedBalance(String worldName, boolean shorts) {
        return null;
    }

    public static String format(double number, HashMap<Double, String> hashMap, String worldName) {
        return null;
    }

    public Double deposit(double amount) {
        return null;
    }

    public Double deposit(String worldName, double amount) {
        return null;
    }

    public Double deposit(String worldName, double amount, CMIUser source) {
        return null;
    }

    public Double withdraw(double amount) {
        return null;
    }

    public Double withdraw(String worldName, double amount) {
        return null;
    }

    public Double withdraw(String worldName, double amount, CMIUser target) {
        return null;
    }

    public boolean has(double amount) {
        return false;
    }

    public boolean has(String worldName, double amount) {
        return false;
    }

    public Map<WorldGroup, Double> getBalances() {
        return null;
    }

    public HashMap<String, Double> getWorldGroupBalancesRounded() {
        return null;
    }

    public HashMap<String, Double> getWorldGroupBalances() {
        return null;
    }

    @Deprecated
    public int updateBalTopPosition() {
        return 0;
    }

    @Deprecated
    public int getBalTopPosition() {
        return 0;
    }

    @Deprecated
    public void setBalTopPosition(int balTopPos) {
    }
}
