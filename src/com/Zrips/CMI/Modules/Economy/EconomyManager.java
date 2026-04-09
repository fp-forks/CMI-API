package com.Zrips.CMI.Modules.Economy;

import java.io.File;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMILeaderboard;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.VaultManager.EconomySetupResponse;

public class EconomyManager {
    private CMI plugin = null;
    private boolean Enabled = false;
    private boolean CustomWorldsEnabled = false;
    private boolean Confirmation = false;
    private boolean OfflinePayments = false;
    private boolean LogEnabled = false;
    private List<String> logIgnoredUsers = null;
    private double MaxChequeValue = 0.0;
    private boolean ChequePaper = false;
    private boolean ChequePermission = false;
    private boolean ChequeInCreative = false;
    private boolean ChequeAcceptNotEncoded = false;
    private boolean BalTopIncludeFakes = false;
    private long ExcludeInactive = 0;
    private boolean BalTopDisplayWithShorts = false;
    private boolean BalTopLoadInAll = false;
    private List<String> BalTopExclude = null;
    private List<String> BalTopExcludeStartingWith = null;
    private HashMap<String, Double> shortAmountValues = null;
    private String townyTownPrefix = null;
    private String townyNationPrefix = null;
    private String townyDebtPrefix = null;
    private String townyClosed_economy = null;
    private boolean recalculatingTop = false;
    public final static String CMIDefaultWorld = null;
    HashMap<String, WorldGroup> groups = null;
    private WorldGroup defaultGroup = null;
    private VaultManager vmanager = null;
    CMILeaderboard<Double> leaderboard = null;
    private double totalServerMoney = 0.0;
    DecimalFormat defaultFormat = null;
    DecimalFormat shortDefaultFormat = null;
    File file = null;
    Writer writer = null;
    boolean checkedOldFile = false;
    private boolean recording = false;

    public EconomyManager(CMI plugin) {
    }

    public EconomySetupResponse recheckEconomyPlugin() {
        return null;
    }

    public CMILeaderboard<Double> getLeaderboard() {
        return null;
    }

    @Deprecated
    public void setForBalTopRecalculation() {
    }

    public String format(Double money) {
        return null;
    }

    public boolean isVaultEnabled() {
        return false;
    }

    @Deprecated
    public void removeFromUpdateCache(UUID uuid) {
    }

    public synchronized void updateBalTop(CMIUser user) {
    }

    @Deprecated
    public void recalculateBalTop() {
    }

    @Deprecated
    public SortedMap<Double, UUID> getBalTopMap() {
        return null;
    }

    @Deprecated
    public int getBalTopPlace(UUID uuid) {
        return 0;
    }

    public Set<WorldGroup> getWorldGroups() {
        return null;
    }

    public Set<String> getWorlds(WorldGroup worldGroup) {
        return null;
    }

    public WorldGroup getWorldGroup(String name) {
        return null;
    }

    public DecimalFormat getMoneyFormat() {
        return null;
    }

    public Double translateMoney(String value) {
        return null;
    }

    public DecimalFormat getShortMoneyFormat() {
        return null;
    }

    public DecimalFormat getMoneyFormat(String worldName) {
        return null;
    }

    public void loadConfig() {
    }

    public boolean isCustomWorldsEnabled() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public VaultManager getVaultManager() {
        return null;
    }

    public boolean isConfirmation() {
        return false;
    }

    public List<String> getBalTopExclude() {
        return null;
    }

    public void setBalTopExclude(List<String> balTopExclude) {
    }

    public Boolean isRecalculatingTop() {
        return null;
    }

    public void setRecalculatingTop(boolean recalculatingTop) {
    }

    public Double getMaxChequeValue() {
        return null;
    }

    public Double getTotalServerMoney() {
        return null;
    }

    public WorldGroup getDefaultGroup() {
        return null;
    }

    public void closeStream() {
    }

    public void moneyLog(CMIUser targetUser, CMIUser sourceUser, double change, CMIMoneyLogType type, String sType) {
    }

    public String getTownyTownPrefix() {
        return null;
    }

    public void setTownyTownPrefix(String townyTownPrefix) {
    }

    public String getTownyNationPrefix() {
        return null;
    }

    public void setTownyNationPrefix(String townyNationPrefix) {
    }

    public boolean isBalTopIncludeFakes() {
        return false;
    }

    public boolean isTownyAccount(String playerName) {
        return false;
    }

    public String getTownyClosedEconomyName() {
        return null;
    }

    public boolean isBalTopDisplayWithShorts() {
        return false;
    }

    public String getTownyDebtPrefix() {
        return null;
    }

    public void setTownyDebtPrefix(String townyDebtPrefix) {
    }

    public boolean isChequePaperRequired() {
        return false;
    }

    public boolean isChequeRequiresPermission() {
        return false;
    }

    public boolean isChequeInCreative() {
        return false;
    }

    public boolean isChequeAcceptNotEncoded() {
        return false;
    }

    public boolean isOfflinePayments() {
        return false;
    }

    public enum EconResponseType {
        SUCCESS, FAILURE, NOT_IMPLEMENTED;
    }

    public class CMIEconomyResponse {
        private double amount = 0.0;
        private double balance = 0.0;
        private EconResponseType type = null;

        public CMIEconomyResponse(double amount, double balance, EconResponseType type) {
        }

        public double getAmount() {
            return 0.0;
        }

        public double getBalance() {
            return 0.0;
        }

        public EconResponseType getType() {
            return null;
        }
    }

    public class WorldGroup {
        private double StartingAmount = 0.0;
        private double MinimalAmount = 0.0;
        private double MaximumAmount = 0.0;
        private double MinimalPay = 0.0;
        private String CurrencyName = null;
        private String CurrencySymbol = null;
        private String CurrencyFormat = null;
        private String Placing = null;
        private boolean switchPlaces = false;
        private boolean UseShortNumbers = false;
        private boolean fractions = false;
        private HashMap<Double, String> ShortNumbersSuffixes = null;
        private String name = null;
        private CMIEconomyTax tax = null;

        public WorldGroup(String name) {
        }

        public Double getStartingAmount() {
            return null;
        }

        public WorldGroup setStartingAmount(Double startingAmount) {
            return null;
        }

        public Double getMinimalAmount() {
            return null;
        }

        public WorldGroup setMinimalAmount(Double minimalAmount) {
            return null;
        }

        public Double getMaximumAmount() {
            return null;
        }

        public WorldGroup setMaximumAmount(Double maximumAmount) {
            return null;
        }

        public String getCurrencyName() {
            return null;
        }

        public WorldGroup setCurrencyName(String currencyName) {
            return null;
        }

        public String getCurrencySymbol() {
            return null;
        }

        public WorldGroup setCurrencySymbol(String currencySymbol) {
            return null;
        }

        public String getName() {
            return null;
        }

        public void setName(String name) {
        }

        public String getCurrencyFormat() {
            return null;
        }

        public WorldGroup setCurrencyFormat(String currencyFormat) {
            return null;
        }

        public boolean isSwitchPlaces() {
            return false;
        }

        public WorldGroup setSwitchPlaces(boolean switchPlaces) {
            return null;
        }

        public String getPlacing() {
            return null;
        }

        public WorldGroup setPlacing(String Placing) {
            return null;
        }

        public boolean isUseShortNumbers() {
            return false;
        }

        public WorldGroup setUseShortNumbers(boolean useShortNumners) {
            return null;
        }

        public HashMap<Double, String> getShortNumbersSuffixes() {
            return null;
        }

        public WorldGroup setShortNumbersSuffixes(HashMap<Double, String> shortNumbersSuffixes) {
            return null;
        }

        public Double getMinimalPay() {
            return null;
        }

        public WorldGroup setMinimalPay(Double minimalPay) {
            return null;
        }

        public boolean isFractions() {
            return false;
        }

        public WorldGroup setFractions(boolean fractions) {
            return null;
        }

        public CMIEconomyTax getTax() {
            return null;
        }

        public void setTax(CMIEconomyTax tax) {
        }
    }

    public enum CMIMoneyLogType {
        Unknown, Transfer;

        private boolean enabled = false;

        CMIMoneyLogType() {
        }

        public boolean isEnabled() {
            return false;
        }

        public void setEnabled(boolean enabled) {
        }
    }
}
