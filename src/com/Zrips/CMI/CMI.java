package com.Zrips.CMI;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.Language;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Alias.AliasManager;
import com.Zrips.CMI.Modules.Animations.AnimationManager;
import com.Zrips.CMI.Modules.Anvil.AnvilManager;
import com.Zrips.CMI.Modules.ArmorEffects.ArmorEffectManager;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager;
import com.Zrips.CMI.Modules.BlueMap.BlueMapManager;
import com.Zrips.CMI.Modules.BungeeCord.BungeeCordManager;
import com.Zrips.CMI.Modules.Chat.ChatBubbleManager;
import com.Zrips.CMI.Modules.Chat.ChatManager;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager;
import com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager;
import com.Zrips.CMI.Modules.ChatTag.TagManager;
import com.Zrips.CMI.Modules.ChunkPreview.ChunkPreview;
import com.Zrips.CMI.Modules.CmdCooldown.CooldownManager;
import com.Zrips.CMI.Modules.CmdCost.CMICommandCostManager;
import com.Zrips.CMI.Modules.CmdWarmUp.WarmUpManager;
import com.Zrips.CMI.Modules.ConsoleFilter.ConsoleFilterManager;
import com.Zrips.CMI.Modules.CustomText.CTextManager;
import com.Zrips.CMI.Modules.DataBase.DBClassLoader;
import com.Zrips.CMI.Modules.DataBase.DBManager;
import com.Zrips.CMI.Modules.DataBase_NEW.DBManager_NEW;
import com.Zrips.CMI.Modules.DeathMessages.DeathMessageManager;
import com.Zrips.CMI.Modules.Dialogs.DialogManager;
import com.Zrips.CMI.Modules.DiscordSRV.DiscordSRVManager;
import com.Zrips.CMI.Modules.DynMap.DynMapManager;
import com.Zrips.CMI.Modules.DynamicSigns.SignManager;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.Elytra.ElytraManager;
import com.Zrips.CMI.Modules.Enchants.EnchantManager;
import com.Zrips.CMI.Modules.EventActions.EventActionManager;
import com.Zrips.CMI.Modules.FindBiome.FindBiomeManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightChargeManager;
import com.Zrips.CMI.Modules.GeoIP.LookupService;
import com.Zrips.CMI.Modules.Holograms.HologramManager;
import com.Zrips.CMI.Modules.Homes.HomeManager;
import com.Zrips.CMI.Modules.InteractiveCommand.CitizensManager;
import com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandManager;
import com.Zrips.CMI.Modules.InvEndEditor.EnderChestManager;
import com.Zrips.CMI.Modules.InvRegEditor.RegChestManager;
import com.Zrips.CMI.Modules.Ips.IpManager;
import com.Zrips.CMI.Modules.Jail.JailManager;
import com.Zrips.CMI.Modules.Kits.KitsManager;
import com.Zrips.CMI.Modules.LightFix.LightFix;
import com.Zrips.CMI.Modules.Mirror.CMIMirrorManager;
import com.Zrips.CMI.Modules.NickName.NickNameManager;
import com.Zrips.CMI.Modules.Packets.PacketInjector;
import com.Zrips.CMI.Modules.Painting.PaintingManager;
import com.Zrips.CMI.Modules.Particl.ParticleManager;
import com.Zrips.CMI.Modules.Patrol.PatrolManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager;
import com.Zrips.CMI.Modules.Placeholders.Placeholder;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager;
import com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsManager;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager;
import com.Zrips.CMI.Modules.PlayerOptions.PlayerOptionsManager;
import com.Zrips.CMI.Modules.Portals.PortalManager;
import com.Zrips.CMI.Modules.Ranks.RankManager;
import com.Zrips.CMI.Modules.Recipes.RecipeManager;
import com.Zrips.CMI.Modules.Region.WorldManager;
import com.Zrips.CMI.Modules.Repair.RepairManager;
import com.Zrips.CMI.Modules.ReplaceBlock.ReplaceBlock;
import com.Zrips.CMI.Modules.SavedInv.SavedInventoryManager;
import com.Zrips.CMI.Modules.SavedItems.SavedItemManager;
import com.Zrips.CMI.Modules.Scan.CMIWorldChunkManager;
import com.Zrips.CMI.Modules.Scavenger.ScavengeManager;
import com.Zrips.CMI.Modules.Selection.SelectionManager;
import com.Zrips.CMI.Modules.Sheduler.SchedulerManager;
import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxManager;
import com.Zrips.CMI.Modules.Skin.SkinManager;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeManager;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager;
import com.Zrips.CMI.Modules.Statistics.StatsManager;
import com.Zrips.CMI.Modules.TabList.TabListHeaderFooterHandler;
import com.Zrips.CMI.Modules.TabList.TabListManager;
import com.Zrips.CMI.Modules.Teleportations.RandomTeleportationManager;
import com.Zrips.CMI.Modules.Teleportations.TeleportHandler;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager;
import com.Zrips.CMI.Modules.TimedCommands.TimedCommandManager;
import com.Zrips.CMI.Modules.Totems.TotemManager;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import com.Zrips.CMI.Modules.Votifier.VotifierManager;
import com.Zrips.CMI.Modules.Warnings.WarningManager;
import com.Zrips.CMI.Modules.Warps.WarpManager;
import com.Zrips.CMI.Modules.Worth.WorthManager;
import com.Zrips.CMI.NBT.NMS;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.utils.ChunkFix;
import com.Zrips.CMI.utils.Lag;
import com.Zrips.CMI.utils.Purge;
import com.Zrips.CMI.utils.TimeManager;
import com.Zrips.CMI.utils.UnloadChunks;
import com.Zrips.CMI.utils.Util;
import com.Zrips.CMI.utils.VersionChecker;

import net.Zrips.CMILib.GUI.GUIManager;
import net.Zrips.CMILib.Util.Sorting;
import net.Zrips.CMILib.Version.Schedulers.CMITask;
import net.milkbowl.vault.permission.Permission;

public class CMI extends JavaPlugin {
    public static final String settingsFolderName = null;
    public static final String savesFolderName = null;
    public static final String logsFolderName = null;
    public static final String kitsFolderName = null;
    public static final String dialogsFolderName = null;
    public static final String translationsFolderName = null;
    public static final String deathMessagesFolderName = null;
    boolean fullyLoaded = false;
    boolean serverLoaded = false;
    protected NMS nms = null;
    protected Reflections ref = null;
    private Placeholder Placeholder = null;
    private Permission vaultPerm = null;
    public static String bugReportLink = null;
    static long serverStartupTime = 0;
    private String worldFolderPath = null;
    protected SavedItemManager SavedItemManager = null;
    protected BlueMapManager BlueMapManager = null;
    protected PlayTimeManager PlayTimeManager = null;
    protected CommandsHandler cManager = null;
    protected LightFix LightFixManager = null;
    protected ChunkPreview ChunkPreviewManager = null;
    protected DiscordSRVManager DiscordSRVManager = null;
    protected ConsoleFilterManager ConsoleFilterManager = null;
    protected Purge PurgeManager = null;
    protected CMIWorldChunkManager ScanManager = null;
    protected ChunkFix ChunkFixManager = null;
    protected ReplaceBlock replaceblock = null;
    protected UnloadChunks unloadchunks = null;
    protected ElytraManager ElytraManager = null;
    protected RepairManager RepairManager = null;
    protected SkinManager SkinManager = null;
    protected Util UtilManager = null;
    protected Config config = null;
    protected Language languageManager = null;
    protected ScavengeManager scavengeManager = null;
    protected VersionChecker versionCheckManager = null;
    protected PlayTimeRewardsManager PlayTimeRewardsManager = null;
    protected TimeManager TimeManager = null;
    protected CMIMirrorManager mirrorV2 = null;
    protected KitsManager kits = null;
    protected SpawnerChargeManager charges = null;
    protected ParticleManager ParticleManager = null;
    protected FlightChargeManager FlightChargeManager = null;
    protected ChatBubbleManager ChatBubbleManager = null;
    protected ChatManager ChatManager = null;
    private ArmorEffectManager armorEffectManager = null;
    protected PaintingManager PaintingManager = null;
    protected VanishManager VanishManager = null;
    protected PlayerOptionsManager PlayerOptionsManager = null;
    protected InteractiveCommandManager InteractiveCommandManager = null;
    protected SpecializedCommandManager SpecializedCommandManager = null;
    protected ArmorStandManager ArmorStandManager = null;
    protected LookupService LookupService = null;
    protected DynMapManager DynMapManager = null;
    protected WorthManager WorthManager = null;
    protected JailManager JailManager = null;
    protected DialogManager DialogManager = null;
    protected TeleportHandler TeleportHandler = null;
    protected WarningManager WarningManager = null;
    protected com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager PlayerCombatManager = null;
    private EconomyManager economyManager = null;
    protected EnderChestManager EnderChestManager = null;
    protected RegChestManager RegChestManager = null;
    protected VotifierManager VotifierManager = null;
    protected CitizensManager CitizensManager = null;
    protected AfkManager AfkManager = null;
    protected TabListManager TabListManager = null;
    protected TabListHeaderFooterHandler TabListHandler = null;
    protected RecipeManager RecipeManager = null;
    protected PortalManager portalManager = null;
    protected SignManager signManager = null;
    protected HologramManager HologramManager = null;
    protected SelectionManager SelectionManager = null;
    protected CMICommandCostManager CMICommandCostManager = null;
    protected CooldownManager cooldownManager = null;
    protected WarmUpManager WarmUpManager = null;
    protected WorldManager regionManager = null;
    protected TotemManager totemManager = null;
    protected AnimationManager AnimationManager = null;
    protected RandomTeleportationManager RandomTeleportationManager = null;
    protected ChatFormatManager ChatFormatManager = null;
    protected ShulkerBoxManager shulkerBoxManager = null;
    protected SchedulerManager schedulerManager = null;
    protected EnchantManager EnchantManager = null;
    protected AnvilManager anvilManager = null;
    protected TimedCommandManager timedCommandManager = null;
    protected PermissionsManager permissionsManager = null;
    protected DeathMessageManager DeathMessageManager = null;
    protected TagManager TagManager = null;
    protected NickNameManager nickNameManager = null;
    protected HomeManager homeManager = null;
    protected WarpManager warpManager = null;
    protected IpManager ipManager = null;
    protected TeleportManager TeleportManager = null;
    protected StatsManager statsManager = null;
    protected AliasManager aliasManager = null;
    protected CTextManager cTextManager = null;
    protected EventActionManager eventActionManager = null;
    protected CustomNBTManager CustomNBTManager = null;
    protected FindBiomeManager findBiomeManager = null;
    protected ChatFilterManager chatFilterManager = null;
    protected GUIManager GUIManager = null;
    protected SavedInventoryManager SavedInventoryManager = null;
    protected PatrolManager PatrolManager = null;
    private DBManager dbManager = null;
    private DBManager_NEW dbManager_new = null;
    private RankManager rankManager = null;
    private Lag lagMeter = null;
    protected PlayerManager PM = null;
    protected Sorting Sorting = null;
    private TabComplete tab = null;
    private long timer = 0;
    protected HashMap<String, List<String>> preFetchNames = null;
    protected HashMap<String, UUID> preFetchUUIDs = null;
    private static final UUID ServerUUID = null;
    private String s1 = null;
    private String s2 = null;
    private String s3 = null;
    private String s4 = null;
    private String s5 = null;
    protected static CMI instance = null;
    public String prefix = null;
    protected Scoreboard scoreboard = null;
    PacketInjector injector = null;
    private DBClassLoader classLoader = null;
    BungeeCordManager BungeeCordManager = null;
    static boolean shuttingdown = false;
    CMITask lagTask = null;

    public PacketInjector getPacketInjector() {
        return null;
    }

    protected String getWorldFolderPath() {
        return null;
    }

    public static CMI getInstance() {
        return null;
    }

    public DBClassLoader getDBClassloader() {
        return null;
    }

    public void setDBClassloader() {
    }

    public HashMap<String, List<String>> preFetchNames() {
        return null;
    }

    public HashMap<String, UUID> preFetchUUIDS() {
        return null;
    }

    public NMS getNMS() {
        return null;
    }

    @Deprecated
    public Reflections getRef() {
        return null;
    }

    public Reflections getReflectionManager() {
        return null;
    }

    public CMIMirrorManager getMirrorManager() {
        return null;
    }

    public DialogManager getDialogManager() {
        return null;
    }

    public BlueMapManager getBlueMapManager() {
        return null;
    }

    public ConsoleFilterManager getConsoleFilterManager() {
        return null;
    }

    public LookupService getLookupService() {
        return null;
    }

    public DiscordSRVManager getDiscordSRVManager() {
        return null;
    }

    public ArmorStandManager getArmorStandManager() {
        return null;
    }

    public PlayerCombatManager getPlayerCombatManager() {
        return null;
    }

    public DynMapManager getDynMapManager() {
        return null;
    }

    public WarningManager getWarningManager() {
        return null;
    }

    public EnchantManager getEnchantManager() {
        return null;
    }

    public ChatBubbleManager getChatBubbleManager() {
        return null;
    }

    public VotifierManager getVotifierManager() {
        return null;
    }

    public ChatManager getChatManager() {
        return null;
    }

    public CitizensManager getCitizensManager() {
        return null;
    }

    public SpecializedCommandManager getSpecializedCommandManager() {
        return null;
    }

    public InteractiveCommandManager getInteractiveCommandManager() {
        return null;
    }

    public ChatFormatManager getChatFormatManager() {
        return null;
    }

    public KitsManager getKitsManager() {
        return null;
    }

    public SpawnerChargeManager getSpawnerChargesManager() {
        return null;
    }

    public SkinManager getSkinManager() {
        return null;
    }

    public RecipeManager getRecipeManager() {
        return null;
    }

    public PaintingManager getPaintingManager() {
        return null;
    }

    public VanishManager getVanishManager() {
        return null;
    }

    public PlayerOptionsManager getPlayerOptionsManager() {
        return null;
    }

    public ParticleManager getParticleManager() {
        return null;
    }

    public DeathMessageManager getDeathMessageManager() {
        return null;
    }

    public FlightChargeManager getFlightChargeManager() {
        return null;
    }

    public Lag getLagMeter() {
        return null;
    }

    public EnderChestManager getEnderChestManager() {
        return null;
    }

    public RegChestManager getRegChestManager() {
        return null;
    }

    public HologramManager getHologramManager() {
        return null;
    }

    public EconomyManager getEconomyManager() {
        return null;
    }

    public CMICommandCostManager getCommandCostManager() {
        return null;
    }

    public CooldownManager getCooldownManager() {
        return null;
    }

    public PortalManager getPortalManager() {
        return null;
    }

    public SignManager getSignManager() {
        return null;
    }

    public SelectionManager getSelectionManager() {
        return null;
    }

    public ArmorEffectManager getArmorEffectManager() {
        return null;
    }

    public WarmUpManager getWarmUpManager() {
        return null;
    }

    public WorldManager getRegionManager() {
        return null;
    }

    public ShulkerBoxManager getShulkerBoxManager() {
        return null;
    }

    public TimedCommandManager getTimedCommandManager() {
        return null;
    }

    public PermissionsManager getPermissionsManager() {
        return null;
    }

    public NickNameManager getNickNameManager() {
        return null;
    }

    public TagManager getTagManager() {
        return null;
    }

    public WarpManager getWarpManager() {
        return null;
    }

    public IpManager getIpManager() {
        return null;
    }

    public PlayTimeRewardsManager getPlayTimeRewardManager() {
        return null;
    }

    public TeleportManager getTeleportManager() {
        return null;
    }

    public TeleportHandler getTeleportHandler() {
        return null;
    }

    public StatsManager getStatsManager() {
        return null;
    }

    public JailManager getJailManager() {
        return null;
    }

    public WorthManager getWorthManager() {
        return null;
    }

    public AliasManager getAliasManager() {
        return null;
    }

    public AfkManager getAfkManager() {
        return null;
    }

    public TabListHeaderFooterHandler getTabListHandler() {
        return null;
    }

    public TabListManager getTabListManager() {
        return null;
    }

    public CTextManager getCTextManager() {
        return null;
    }

    public CustomNBTManager getCustomNBTManager() {
        return null;
    }

    public EventActionManager getEventActionManager() {
        return null;
    }

    public HomeManager getHomeManager() {
        return null;
    }

    public SchedulerManager getSchedulerManager() {
        return null;
    }

    public AnvilManager getAnvilManager() {
        return null;
    }

    public TotemManager getTotemManager() {
        return null;
    }

    public AnimationManager getAnimationManager() {
        return null;
    }

    public FindBiomeManager getFindBiomeManager() {
        return null;
    }

    public ChatFilterManager getChatFilterManager() {
        return null;
    }

    public SavedInventoryManager getSavedInventoryManager() {
        return null;
    }

    public BungeeCordManager getBungeeCordManager() {
        return null;
    }

    public PatrolManager getPatrolManager() {
        return null;
    }

    public RankManager getRankManager() {
        return null;
    }

    public PlayerManager getPlayerManager() {
        return null;
    }

    public Sorting getSortingManager() {
        return null;
    }

    public TimeManager getTimeManager() {
        return null;
    }

    public VersionChecker getVersionCheckManager() {
        return null;
    }

    public CommandsHandler getCommandManager() {
        return null;
    }

    public ElytraManager getElytraManager() {
        return null;
    }

    public RepairManager getRepairManager() {
        return null;
    }

    public RandomTeleportationManager getRandomTeleportationManager() {
        return null;
    }

    public SavedItemManager getSavedItemManager() {
        return null;
    }

    public PlayTimeManager getPlayTimeManager() {
        return null;
    }

    public LightFix getLightFixManager() {
        return null;
    }

    public ChunkPreview getChunkPreviewManager() {
        return null;
    }

    public CMIWorldChunkManager getScanManager() {
        return null;
    }

    public ChunkFix getChunkFixManager() {
        return null;
    }

    public ReplaceBlock getReplaceBlockManager() {
        return null;
    }

    public UnloadChunks getUnloadChunksManager() {
        return null;
    }

    public Purge getPurgeManager() {
        return null;
    }

    public Util getUtilManager() {
        return null;
    }

    public Config getConfigManager() {
        return null;
    }

    public ScavengeManager getScavengeManager() {
        return null;
    }

    public DBManager getDbManager() {
        return null;
    }

    public DBManager_NEW getDbManager_NEW() {
        return null;
    }

    public Language getLM() {
        return null;
    }

    public void initLM() {
    }

    public static boolean isShuttingDown() {
        return false;
    }

    @Override
    public void onDisable() {
    }

    public Scoreboard getSB() {
        return null;
    }

    public boolean safeRenameFile(String file, String toFile) {
        return false;
    }

    public void renameDirectory(String fromDir, String toDir) {
    }

    public void Enabled(boolean state) {
    }

    @Override
    public void onEnable() {
    }

    public void consoleMessage(String message) {
    }

    public void loadMessage(Object amount, String type, Long took) {
    }

    @Deprecated
    public String getOffOn(Player player, Player whoGets) {
        return null;
    }

    @Deprecated
    public String getOffOn(Player player) {
        return null;
    }

    @Deprecated
    public String getOffOn(boolean state) {
        return null;
    }

    public void save(Player player) {
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther, boolean inform) {
        return null;
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd) {
        return null;
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther) {
        return null;
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd) {
        return null;
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther) {
        return null;
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther, boolean inform) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean inform, boolean checkOther) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean checkOther) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther) {
        return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther, boolean informOnPerm) {
        return null;
    }

    @Deprecated
    public Player getPlayer(String playerName) {
        return null;
    }

    public Placeholder getPlaceholderAPIManager() {
        return null;
    }

    public long getTimer() {
        return 0;
    }

    public void setTimer(long timer) {
    }

    public TabComplete getTab() {
        return null;
    }

    public int getViewRange(World world) {
        return 0;
    }

    @Deprecated
    public void performCommand(CommandSender sender, Object cls) {
    }

    public void performCommand(CommandSender sender, Class<?> clas) {
    }

    @Deprecated
    public void performCommand(CommandSender sender, Object cls, String cmd) {
    }

    public void performCommand(CommandSender sender, Class<?> clas, String cmd) {
    }

    public void performCommand(CommandSender sender, String cmd) {
    }

    public boolean isFullyLoaded() {
        return false;
    }

    public void setFullyLoaded(boolean fullyLoaded) {
    }

    public UUID getServerUUID() {
        return null;
    }

    public long getServerStartupTime() {
        return 0;
    }

    public Permission getVaultPerm() {
        return null;
    }

    public void setVaultPerm(Permission vaultPerm) {
    }

    public boolean isServerLoaded() {
        return false;
    }
}
