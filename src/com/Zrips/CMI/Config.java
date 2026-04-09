package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.Zrips.CMI.Containers.DamageControl;
import com.Zrips.CMI.Containers.RandomTeleport;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Config {
    public static String imageFolder = null;
    private boolean ShowNewVersion = false;
    public static boolean DyeBoundToPlayer = false;
    private List<String> signEditBlackList = null;
    private HashMap<String, Integer> FlyAboveRoofLimitationsMap = null;
    public boolean VaultMoney = false;
    private boolean OverrideLoginMessage = false;
    private boolean BossBarHpBarEnabled = false;
    private List<EntityType> HpBarBlackList = null;
    private String BooksDefaultAuthor = null;
    public static boolean BooksAddDate = false;
    public boolean VaultGroup = false;
    public boolean DynamicViewRangeEnabled = false;
    private int OptimizationsSimilarCommandChecker = 0;
    private boolean OptimizationsSimilarCommandPrevention = false;
    public int lfixDefaultSpeed = 0;
    public int SpawnMobMaxQuantity = 0;
    public int SpawnMobMaxPassengers = 0;
    public double lfixSoftCap = 0.0;
    public boolean fixLightOngeneration = false;
    private List<String> fixWorldsToFix = null;
    public boolean hungeroveride = false;
    public String Lang = null;
    public boolean LanguageDownload = false;
    public static boolean monochromeConsole = false;
    public static int ImmortalityOnJoin = 0;
    public boolean fileSaveAsync = false;
    private boolean PartialPlayerName = false;
    public static boolean PrioritizeOnlinePlayers = false;
    public boolean PreventDifferentCapitalizationNames = false;
    public boolean PlayTimeFromStats = false;
    public static boolean PlayTimeAutoUpdater = false;
    private List<Material> ItemLoreTypeBlackList = null;
    private boolean ItemNameMarkChanged = false;
    private boolean ItemLoreMarkChanged = false;
    public static int ItemLoreMaxLength = 0;
    private boolean CMIPlayTimeTracking = false;
    public static List<String> checkAccountExlusions = null;
    public static List<String> PlaytimeTopExclude = null;
    public static long PlaytimeTopOffline = 0;
    private boolean PerformCommandsOnNewName = false;
    private List<String> OptimizationsNameChangeCommands = null;
    private boolean OnLimitedItemUseInform = false;
    private boolean PreventEntityBoatEnterAnimals = false;
    private boolean PreventEntityBoatEnterMonsters = false;
    private boolean PreventEntityBoatEnterVillagers = false;
    private boolean PreventBedExplosionNether = false;
    private boolean PreventBedExplosionTheEnd = false;
    private boolean PreventPlayersOnNetherRoof = false;
    private int netherRoofHeight = 0;
    private boolean PreventPlayersBelowBedrock = false;
    private boolean PreventIronGolemRoses = false;
    public static boolean ShowMainHelpPage = false;
    private boolean PreventHook = false;
    public static int NearDefaultDistance = 0;
    public static boolean NearCommand = false;
    public static List<Integer> lastonlineTimers = null;
    public static boolean NearHideInvisible = false;
    public static boolean NearHideObfuscate = false;
    public static boolean NearDirection = false;
    public static int NearCommandCount = 0;
    private boolean MulticraftDisableList = false;
    private boolean PreventExpPortals = false;
    public static boolean NoCommandsInBed = false;
    public static boolean LimitBooks = false;
    public static boolean BlockEndPortalItemTransfers = false;
    public static List<String> CommandsClearExclude = null;
    public static boolean CommandsClearConfirmation = false;
    public static boolean CommandsListASCOrder = false;
    private boolean FlyAboveRoof = false;
    private boolean durabilityLossUse = false;
    private boolean armorDurabilityLossUse = false;
    private int durabilityLossPercentage = 0;
    private int armorDurabilityLossPercentage = 0;
    private String LongDateFormat = null;
    private String ShortDateFormat = null;
    private boolean SellLog = false;
    private boolean PermisionOnError = false;
    private boolean PermisionInConsole = false;
    private boolean OptimizationsCommandSorting = false;
    private boolean AllowRconCommands = false;
    private List<String> CustomCommandSenders = null;
    private boolean CleanRconCommands = false;
    private boolean OptimizationsCommandRemoveLabel = false;
    private HashMap<CMIItemStack, String> ItemRenamingPreventMap = null;
    public static boolean ItemRenamingGlobalDisable = false;
    public static boolean ItemRenamingCheckSource = false;
    public static boolean AddItalicByDefault = false;
    public static int ItemRenamingMaxLength = 0;
    private boolean PotionEffectsDeductWhileOffline = false;
    public int IPdelay = 0;
    public static boolean IPRecord = false;
    public static boolean helpopfeedbackMessage = false;
    public boolean LoginDisabled = false;
    public boolean LogoutDisabled = false;
    public boolean LoginCustomUse = false;
    public boolean LogoutCustomUse = false;
    public boolean LogoutServerSwitch = false;
    public boolean LoginServerSwitch = false;
    public boolean FirstJoinMessageUse = false;
    public static boolean loginNameFilterUse = false;
    public static boolean logoutNameFilterUse = false;
    public static ChatFilterRule loginLogoutNameFilter = null;
    private int LogoutAutoHideFrom = 0;
    private int LoginAutoHideFrom = 0;
    private boolean NotesShowOnAlertEvent = false;
    public static long alertTimer = 0;
    public String TimeDay = null;
    public String TimeNight = null;
    public String TimeMorning = null;
    public String TimeDusk = null;
    public int AutoTimeInterval = 0;
    private boolean AutoTimeSmooth = false;
    private int AutoTimeSmoothSpeed = 0;
    private CText Motd = null;
    public boolean SearchPurge = false;
    public boolean SearchLogIntoFile = false;
    public static boolean MuteNoPm = false;
    public boolean CuffMute = false;
    public List<String> CuffAllowed = null;
    private List<Material> GroundCleanWhiteList = null;
    private List<EntityType> GroundCleanEntityWhiteList = null;
    public boolean WorldLimits = false;
    public HashMap<String, GameMode> worldGameMode = null;
    public HashMap<String, Boolean> worldFlyMode = null;
    public HashMap<String, Boolean> worldGodMode = null;
    public HashMap<String, Boolean> worldElytraMode = null;
    public boolean hatIgnoreLored = false;
    public boolean hatBlockArmorItems = false;
    public boolean hatBlockNoneHatEnchanted = false;
    public boolean hatAllowMobHeads = false;
    public List<CMIMaterial> hatWhiteList = null;
    public boolean RemoveNegative = false;
    public List<String> RemoveNegativeEffects = null;
    private List<String> CommandSpyBlackListed = null;
    private List<String> CommandSpyCommandList = null;
    private int SpyDelayForTrigger = 0;
    private CMIParticle PointDefaultParticle = null;
    private boolean ExploitPatcherRiptide = false;
    private boolean ExploitPatcherCheckItem = false;
    public int CounterRange = 0;
    private int MaxHp = 0;
    private boolean NetherPortalPreventCreation = false;
    public int NetherPortalMaxHeight = 0;
    public int NetherPortalMaxWidth = 0;
    public HashMap<DamageCause, ArrayList<DamageControl>> DamageControlMap = null;
    private CMIItemStack SelectionTool = null;
    private CMILocation firstSpawnPoint = null;
    private boolean InvDisableOffline = false;
    public static List<String> InvBlackList = null;
    private long PlayerNotesExpiresIn = 0;
    public int DisposeUILines = 0;
    public boolean DisposeCustomModelData = false;
    public boolean DisposeAttachedCommands = false;
    public List<CMIMaterial> DisposeMaterials = null;
    private ConfigReader localeFile = null;
    private ConfigReader cfg = null;
    public static ChatFilterRule InteractiveCommandsSignRegex = null;
    public static boolean InteractiveCommandsSort = false;
    public static boolean UseFakeOperator = false;
    public static boolean InfiniteLoopDetection = false;
    public static boolean ShowSkullOwner = false;
    public static boolean ShowBeeHive = false;
    public static boolean ShowDecoratedPot = false;
    private List<String> ElevatorIndicator = null;
    private String ElevatorStaticIndicator = null;
    private boolean maintenance = false;
    public static boolean DisableTeamManagement = false;
    private boolean AutoDownloadGeoIp = false;
    private boolean AutoDownloadGeoLiteCity = false;
    private String maintenanceMessage = null;
    public static Boolean maintenanceBossbar = null;
    public static Boolean maintenanceAutoKick = null;
    private CMI plugin = null;
    List<String> CommentList = null;
    private static final Pattern PATTERN = null;

    public Config(CMI plugin) {
    }

    public void ChangeConfig(String path, Object list) {
    }

    public void ChangeConfig(String path, Object list, boolean load) {
    }

    public boolean LoadLang(String lang) {
        return false;
    }

    public boolean LoadLang(String lang, boolean isReload) {
        return false;
    }

    public CompletableFuture<Boolean> loadLangAsync(String lang) {
        return null;
    }

    public static String expand(String input) {
        return null;
    }

    public boolean load() {
        return false;
    }

    public boolean reload() {
        return false;
    }

    public boolean load(boolean isReload) {
        return false;
    }

    public void reload(CommandSender sender) {
    }

    public CompletableFuture<Boolean> reloadLanguage() {
        return null;
    }

    public Location getFirstSpawnPoint() {
        return null;
    }

    public ConfigReader getConfig() {
        return null;
    }

    public long getPlayerNotesExpiresIn() {
        return 0;
    }

    @Deprecated
    public long getPlayerMailExpiresIn() {
        return 0;
    }

    @Deprecated
    public boolean isDurabilityLossUse() {
        return false;
    }

    public boolean isToolDurabilityLossUse() {
        return false;
    }

    @Deprecated
    public int getDurabilityLossPercentage() {
        return 0;
    }

    public int getToolDurabilityLossPercentage() {
        return 0;
    }

    public HashMap<CMIItemStack, String> getItemRenamingPreventMap() {
        return null;
    }

    public boolean isOnLimitedItemUseInform() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareProtectNormalRepair() {
        return false;
    }

    @Deprecated
    public int getRepairShareDurability() {
        return 0;
    }

    @Deprecated
    public boolean isRepairShareAddLore() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareCancelEvent() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareInformWithMessage() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareProtectCommandRepair() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareBypassWithPerm() {
        return false;
    }

    public int getMaxHp() {
        return 0;
    }

    public boolean isNotesShowOnAlertEvent() {
        return false;
    }

    public boolean isPreventExpPortals() {
        return false;
    }

    public ConfigReader getLocaleConfig() {
        return null;
    }

    @Deprecated
    public boolean isDisableWorldChunkCheckInfo() {
        return false;
    }

    public boolean isPreventEntityBoatEnterAnimals() {
        return false;
    }

    public boolean isPreventEntityBoatEnterMonsters() {
        return false;
    }

    public boolean isPreventBedExplosionNether() {
        return false;
    }

    public boolean isPreventIronGolemRoses() {
        return false;
    }

    public boolean isMulticraftDisableList() {
        return false;
    }

    public boolean isPreventBedExplosionTheEnd() {
        return false;
    }

    public CMIItemStack getSelectionTool() {
        return null;
    }

    public boolean isNetherPortalPreventCreation() {
        return false;
    }

    public boolean isMaintenance() {
        return false;
    }

    public void setMaintenance(boolean maintenance) {
    }

    public String getMaintenanceMessage() {
        return null;
    }

    public void setMaintenanceMessage(String maintenanceMessage) {
    }

    public boolean isOverrideLoginMessage() {
        return false;
    }

    public CText getMotd() {
        return null;
    }

    public boolean isPermisionOnError() {
        return false;
    }

    public List<String> getFixWorldsToFix() {
        return null;
    }

    public List<String> getCommandSpyBlackListed() {
        return null;
    }

    public int getSpyDelayForTrigger() {
        return 0;
    }

    public boolean isOptimizationsCommandSorting() {
        return false;
    }

    public boolean isPreventPlayersOnNetherRoof() {
        return false;
    }

    public boolean isPreventPlayersBelowBedrock() {
        return false;
    }

    public boolean isBossBarHpBarEnabled() {
        return false;
    }

    public List<Material> getGroundCleanWhiteList() {
        return null;
    }

    public List<EntityType> getGroundCleanEntityWhiteList() {
        return null;
    }

    public boolean isPartialPlayerName() {
        return false;
    }

    public boolean isOptimizationsCommandRemoveLabel() {
        return false;
    }

    @Deprecated
    public boolean isBlockedSpawnReason(String worldName, SpawnReason reason) {
        return false;
    }

    public boolean isPreventHook() {
        return false;
    }

    public CMIParticle getPointDefaultParticle() {
        return null;
    }

    public boolean isPermisionInConsole() {
        return false;
    }

    public boolean isSellLog() {
        return false;
    }

    @Deprecated
    public boolean isSpawnersSupportDisabled() {
        return false;
    }

    public String getBooksDefaultAuthor() {
        return null;
    }

    @Deprecated
    public List<String> getCleanUpWhiteList() {
        return null;
    }

    @Deprecated
    public boolean isChatReplyToLastMessenger() {
        return false;
    }

    @Deprecated
    public int getLastMessengerTimeOut() {
        return 0;
    }

    @Deprecated
    public boolean isColorsMe() {
        return false;
    }

    @Deprecated
    public boolean isChatDynMapChat() {
        return false;
    }

    @Deprecated
    public boolean isModifyChatFormat() {
        return false;
    }

    @Deprecated
    public boolean isChatClickHoverMessages() {
        return false;
    }

    @Deprecated
    public boolean isColorsPublicMessages() {
        return false;
    }

    @Deprecated
    public boolean isColorsPrivateMessage() {
        return false;
    }

    @Deprecated
    public boolean isChatIgnorePublicMessage() {
        return false;
    }

    public List<String> getCommandSpyCommandList() {
        return null;
    }

    public boolean isCMIPlayTimeTracking() {
        return false;
    }

    public void setCMIPlayTimeTracking(boolean cMIPlayTimeTracking) {
    }

    @Deprecated
    public int getPlayerMailAllDays() {
        return 0;
    }

    @Deprecated
    public String getElevatorIndicator() {
        return null;
    }

    public List<String> getElevatorIndicators() {
        return null;
    }

    public String getElevatorStaticIndicator() {
        return null;
    }

    @Deprecated
    public boolean isSpawnersXpDrop() {
        return false;
    }

    @Deprecated
    public int getLogoutAutoHideFrom() {
        return 0;
    }

    @Deprecated
    public int getLoginAutoHideFrom() {
        return 0;
    }

    public boolean isAutoDownloadGeoIp() {
        return false;
    }

    public boolean isAutoDownloadGeoLiteCity() {
        return false;
    }

    @Deprecated
    public boolean isPreloadTopPlaytime() {
        return false;
    }

    @Deprecated
    public boolean isElytraPreventSelfDamage() {
        return false;
    }

    @Deprecated
    public boolean isFlyAboveRoof() {
        return false;
    }

    public int getOptimizationsSimilarCommandChecker() {
        return 0;
    }

    @Deprecated
    public HashMap<String, Integer> getFlyAboveRoofLimitationsMap() {
        return null;
    }

    public String getLongDateFormat() {
        return null;
    }

    public String getShortDateFormat() {
        return null;
    }

    public boolean isAutoTimeSmooth() {
        return false;
    }

    public int getAutoTimeSmoothSpeed() {
        return 0;
    }

    public List<EntityType> getHpBarBlackList() {
        return null;
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w) {
        return null;
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
        return null;
    }

    @Deprecated
    public HashMap<String, RandomTeleport> getRandomTeleports() {
        return null;
    }

    @Deprecated
    public int getRandomTeleportMaxTries() {
        return 0;
    }

    @Deprecated
    public int getRandomTeleportCooldown() {
        return 0;
    }

    @Deprecated
    public List<String> getRandomTeleportExcludedBiomes() {
        return null;
    }

    public List<Material> getItemLoreTypeBlackList() {
        return null;
    }

    @Deprecated
    public boolean isDisableRiptide() {
        return false;
    }

    public boolean isOptimizationsSimilarCommandPrevention() {
        return false;
    }

    @Deprecated
    public boolean isBossBarCompassEnabled() {
        return false;
    }

    @Deprecated
    public boolean isCompassRequireCompass() {
        return false;
    }

    @Deprecated
    public int getCompassUpdateInterval() {
        return 0;
    }

    @Deprecated
    public String getCompassShape() {
        return null;
    }

    @Deprecated
    public String getCompassColor() {
        return null;
    }

    @Deprecated
    public String getCompassHomeIcon() {
        return null;
    }

    @Deprecated
    public String getCompassSpawnIcon() {
        return null;
    }

    @Deprecated
    public String getCompassDeathIcon() {
        return null;
    }

    @Deprecated
    public String getCompassTargetIcon() {
        return null;
    }

    @Deprecated
    public boolean isRecoveryRequireCompass() {
        return false;
    }

    @Deprecated
    public boolean isRecoveryAsRegularCompass() {
        return false;
    }

    public boolean isPotionEffectsDeductWhileOffline() {
        return false;
    }

    public boolean isPreventEntityBoatEnterVillagers() {
        return false;
    }

    public int getArmorDurabilityLossPercentage() {
        return 0;
    }

    public void setArmorDurabilityLossPercentage(int armorDurabilityLossPercentage) {
    }

    public boolean isArmorDurabilityLossUse() {
        return false;
    }

    public void setArmorDurabilityLossUse(boolean armorDurabilityLossUse) {
    }

    public boolean isItemNameMarkChanged() {
        return false;
    }

    public boolean isItemLoreMarkChanged() {
        return false;
    }

    public boolean isShowNewVersion() {
        return false;
    }

    public boolean isSignEditBlocked(String line) {
        return false;
    }

    public int getNetherRoofHeight() {
        return 0;
    }

    public boolean isInvDisableOffline() {
        return false;
    }

    @Deprecated
    public boolean isMirrorBreakDisabled() {
        return false;
    }

    public boolean isExploitPatcherRiptide() {
        return false;
    }

    @Deprecated
    public int getPlayerMailMax() {
        return 0;
    }

    @Deprecated
    public int getTeleportTpaMaxDistance() {
        return 0;
    }

    @Deprecated
    public int getTeleportTpaHereMaxDistance() {
        return 0;
    }

    @Deprecated
    public List<String> getBackBlackList() {
        return null;
    }

    @Deprecated
    public int getBackMinDistance() {
        return 0;
    }

    @Deprecated
    public boolean isSafeLocationDownThenUp() {
        return false;
    }

    @Deprecated
    public boolean isTpaCurrentLoc() {
        return false;
    }

    @Deprecated
    public boolean isTpahereCurrentLoc() {
        return false;
    }

    @Deprecated
    public int getTeleportJumpDefault() {
        return 0;
    }

    @Deprecated
    public HashMap<Material, Integer> getBlockedItems() {
        return null;
    }

    @Deprecated
    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
        return null;
    }

    @Deprecated
    public boolean isTeleportSwitchPlaces() {
        return false;
    }

    @Deprecated
    public int getTeleportTpaWarmup() {
        return 0;
    }

    @Deprecated
    public boolean isTeleportTpaMove() {
        return false;
    }

    public boolean isAllowRconCommands() {
        return false;
    }

    public boolean isCleanRconCommands() {
        return false;
    }

    public boolean isPerformCommandsOnNewName() {
        return false;
    }

    public List<String> getOptimizationsNameChangeCommands() {
        return null;
    }

    public boolean isExploitPatcherCheckItem() {
        return false;
    }

    public List<String> getCustomCommandSenders() {
        return null;
    }
}
