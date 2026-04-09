package com.Zrips.CMI.Modules.Economy;

public class CMIEconomyTax {
    private CMIEconomyTaxType type = null;
    private double amount = 0.0;
    private double min = 0.0;
    private double max = 0.0;
    private boolean deductOnTop = false;

    public CMIEconomyTax() {
    }

    public CMIEconomyTax(CMIEconomyTaxType type, double amount) {
        this(type, amount, 0D, 0D);
    }

    public CMIEconomyTax(CMIEconomyTaxType type, double amount, double min, double max) {
    }

    public CMIEconomyTaxType getType() {
        return null;
    }

    public CMIEconomyTax setType(CMIEconomyTaxType type) {
        return null;
    }

    public double getAmount() {
        return 0.0;
    }

    public CMIEconomyTax setAmount(double amount) {
        return null;
    }

    public double getMin() {
        return 0.0;
    }

    public CMIEconomyTax setMin(double min) {
        return null;
    }

    public double getMax() {
        return 0.0;
    }

    public CMIEconomyTax setMax(double max) {
        return null;
    }

    public boolean isDeductOnTop() {
        return false;
    }

    public void setDeductOnTop(boolean deductOnTop) {
    }

    public double getTaxAmount(double payingAmount) {
        return 0.0;
    }
}
