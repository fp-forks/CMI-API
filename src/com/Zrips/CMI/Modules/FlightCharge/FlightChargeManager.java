package com.Zrips.CMI.Modules.FlightCharge;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class FlightChargeManager {
    CMI plugin = null;
    private boolean FlightChargeEnabledByDefault = false;
    private boolean FlightChargeAutoSwitch = false;
    private boolean bossbar = false;
    private double ExpRechargeCost = 0.0;
    private double MoneyRechargeCost = 0.0;
    private int MaxChargeLevel = 0;
    private int DeductOnFallMulti = 0;
    private double DeductOnIdling = 0.0;
    private double DeductOnlyForTime = 0.0;
    private boolean DamageOnFall = false;
    private boolean DamageOnToggle = false;
    private boolean KillOnFall = false;
    private CMIChatColor GlowColor = null;
    private double autoRechargeFrom = 0.0;
    private double autoRechargeAmount = 0.0;
    private ConcurrentHashMap<UUID, FlightCharge> flightCharges = null;
    public static final String flightChargeBossBar = null;

    public FlightChargeManager(CMI plugin) {
    }

    public FlightCharge getFlightCharge(UUID uuid) {
        return null;
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid) {
        return null;
    }

    @Deprecated
    public PlayerCharge getPCharge(UUID uuid, boolean update) {
        return null;
    }

    public void load() {
    }

    public void process(Player player, Integer take) {
    }

    public void process(traveledDistance dinfo, Integer take) {
    }

    public void autorecharge(CMIUser user) {
    }

    public void updateBossBar(CMIUser user) {
    }

    public double getExpRechargeCost() {
        return 0.0;
    }

    public void setExpRechargeCost(double expRechargeCost) {
    }

    public double getMoneyRechargeCost() {
        return 0.0;
    }

    public void setMoneyRechargeCost(double moneyRechargeCost) {
    }

    public int getMaxChargeLevel() {
        return 0;
    }

    public void setMaxChargeLevel(int maxChargeLevel) {
    }

    public int getDeductOnFallMulti() {
        return 0;
    }

    public void setDeductOnFallMulti(int deductOnFallMulti) {
    }

    public boolean isDamageOnFall() {
        return false;
    }

    public void setDamageOnFall(boolean damageOnFall) {
    }

    public boolean isDamageOnToggle() {
        return false;
    }

    public void setDamageOnToggle(boolean damageOnToggle) {
    }

    public boolean isKillOnFall() {
        return false;
    }

    public void setKillOnFall(boolean killOnFall) {
    }

    public double getDeductOnIdling() {
        return 0.0;
    }

    public void setDeductOnIdling(int deductOnIdling) {
    }

    public boolean isFlightChargeEnabledByDefault() {
        return false;
    }

    public void setFlightChargeEnabledByDefault(boolean flightChargeEnabledByDefault) {
    }

    public boolean isFlightChargeAutoSwitch() {
        return false;
    }

    public CMIChatColor getGlowColor() {
        return null;
    }

    public void setGlowColor(CMIChatColor glowColor) {
    }

    public double getAutoRechargeFrom() {
        return 0.0;
    }

    public double getAutoRechargeAmount() {
        return 0.0;
    }
}
