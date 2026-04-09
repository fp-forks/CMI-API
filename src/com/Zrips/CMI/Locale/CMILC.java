package com.Zrips.CMI.Locale;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public enum CMILC {
    info_Same("{gcw}Can't open your own inventory for editing!"),
    info_cantLoginWithDifCap("{gcw}Can't login with different name capitalization! Old name: {gcs}[oldName]{gcw}. Current: {gcs}[currentName]"),
    info_NoCommandWhileSleeping("{gcw}Can't perform commands while sleeping!"),
    info_PurgeNotEnabled("{gcw}Purge function is not enabled in config file!"),
    info_TeamManagementDisabled("{gcp}This feature will have limited functionalaty while DisableTeamManagement is set to true!"),
    info_NoGameMode("{gcw}Please use 0/1/2/3 or Survival/Creative/Adventure/Spectator or s/c/a/sp!"),
    info_NameChange("{gcs}[playerDisplayName] {gcp}logged in, also known as: {gcs}[namelist]"),
    info_Cooldowns("{gcp}This command is on cooldown for another {gcs}[time]"),
    info_specializedCooldowns("{gcp}Cooldown in motion for this command, please wait {gcs}[time]"),
    info_specializedRunning("{gcp}Command still running, please wait {gcs}[time]"),
    info_CooldownOneTime("{gcp}This command can only be used once!"),
    info_WarmUp_canceled("{gcp}Command was cancelled due to your movement"),
    info_WarmUp_counter("!actionbar!{gcp}--> Wait {gcs}[time] {gcp}seconds <--"),
    info_WarmUp_DontMove("!title!{gcp}Teleporting!!subtitle!{gcp}Wait {gcw}[time] {gcp}seconds"),
    info_WarmUp_Boss_DontMove("{gcw}Don't move for {gcs}[autoTimeLeft] {gcw}seconds!"),
    info_WarmUp_Boss_WaitFor("{gcw}Wait for {gcs}[autoTimeLeft] {gcw}seconds!"),
    info_FailedSpawnerMine("!actionbar!{gcw}Failed to mine spawner. {gcs}[percent]% {gcw}drop chance"),
    info_ClickSpawner("!actionbar!{gcs}[percent]% {gcp}Drop chance"),
    info_Elevator_created("{gcp}Created elevator sign"),
    info_CantPlaceSpawner("{gcp}Can't place spawner so close to another spawner ({gcs}[range]{gcp})"),
    info_ChunksLoading("{gcp}World chunk data is still being loaded. Please wait a bit and try again."),
    info_CantUseNonEncrypted("!actionbar!{gcw}Commands on this item are not encrypted. Can't use them!"),
    info_CantUseTrident("!actionbar!{gcw}Can't use trident with riptide enchant at this moment!"),
    info_CantDecode("!actionbar!{gcw}Can't decode message/command. Key file contains wrong key for this task. Inform server administration about this"),
    info_CantTeleport("{gcp}You can't teleport because you have too many limited items. Scroll over this line to see the maximum amount of items allowed."),
    info_CantTeleportDistance("{gcp}Sorry you cant teleport over {gcs}[amount] {gcp}blocks away!"),
    info_BlackList("{gcp}[material] [amount] {gcs}Max: [max]"),
    info_wrongPortal("{gcw}You are in incorrect area of effect"),
    info_ItemWillBreak("!actionbar!{gcp}Your item ({gcs}[itemName]{gcp}) will break soon! {gcs}[current]{gcp}/{gcs}[max]"),
    info_ArmorWillBreak("!actionbar!{gcp}Your [itemName] will break soon! {gcs}[current]{gcp}/{gcs}[max]"),
    info_flyingToHigh("{gcw}You can't fly so high, max height is {gcs}[max]{gcw}!"),
    info_specializedItemFail("{gcw}Can't determine specialized item requirement by value: {gcs}[value]"),
    info_sunSpeeding("Sleeping [count] of [total] [hour] hour [speed]X speed"),
    info_sleepersRequired("!actionbar!{gcs}[sleeping] {gcp}of {gcs}[required] {gcp}sleeping from required for night time speedup"),
    info_sunSpeedingTitle("{gcs}[hour]"),
    info_skippingNight("!title!{gcsp}Skipping entire night"),
    info_sunSpeedingSubTitle("{gcs}[count]{gcp}/{gcs}[total] {gcp}({gcs}[speed]X{gcp})"),
    info_repairConfirm("{gcp}Click to confirm {gcs}[items] {gcp}item repair for {gcs}[cost]"),
    info_bookDate("{gcp}Written at {gcs}[date]"),
    info_maintenance("{gcp}Maintenance mode"),
    info_mapLimit("{gcw}Cant go beyond 30 000 000 blocks"),
    info_startedEditingPainting("{gcp}You started editing painting. Click any other block to cancel."),
    info_canceledEditingPainting("{gcp}You canceled painting editing mode"),
    info_changedPainting("!actionbar!{gcp}Changed painting to {gcs}[name] {gcp}with id of {gcs}[id]"),
    info_noSpam("!title!{gcw}No spamming!"),
    info_noCmdSpam("!title!{gcw}No command spamming!"),
    info_spamConsoleInform("{gcw}Player ({gcs}[playerName]{gcw}) triggered ({gcs}[rules]{gcw}) chat filter with:&r [message]"),
    info_FirstJoin("{gcp}Welcome {gcs}[playerDisplayName] {gcp}to our server!", "This line can have extra variables: [totalUsers] [onlinePlayers]"),
    info_LogoutCustom(" {gcs}[playerDisplayName] {gcp}left the game", "Don't forget to enable custom logout messages in config!"),
    info_LoginCustom(" {gcs}[playerDisplayName] {gcp}joined the game", "Don't forget to enable custom login messages in config!"),
    info_deathlocation("{gcp}You died at x:{gcs}[x]{gcp}, y:{gcs}[y]{gcp}, z:{gcs}[z]{gcp} in {gcs}[world]"),
    info_book_exploit("{gcw}You cant create book with more than [amount] pages"),
    info_move_CantUseShulkerBox("{gcw}Can't use shulker box while moving"),
    info_combat_CostToOpen("!actionbar!{gcp}Charged for opening: [amount]"),
    info_combat_CantUseShulkerBox("{gcw}Can't use shulker box while you are in combat with player. Wait: [time]"),
    info_combat_CantUseCommand("!actionbar!{gcw}Can't use command while in combat mode. Wait: [time]"),
    info_combat_bossBarPvp("{gcw}Combat mode [autoTimeLeft]"),
    info_combat_bossBarPve("{gcn}Combat mode [autoTimeLeft]"),
    info_noSchedule("{gcw}Schedule by this name is not found"),
    info_totem_cooldown("{gcp}Totem cooldown: [time]"),
    info_totem_warmup("{gcp}Totem effect: [time]"),
    info_totem_cantConsume("{gcp}Totem usage was denied due to its cooldown time"),
    info_InventorySave_info("{gcp}Info: {gcn}[playerDisplayName]"),
    info_InventorySave_saved("{gcs}[time] {gcp}Inventory saved with id: {gcs}[id]"),
    info_InventorySave_NoSavedInv("{gcp}This player doesn't have any saved inventories"),
    info_InventorySave_NoEntries("{gce}File exists, but no inventories were found!"),
    info_InventorySave_CantFind("{gcp}Can't find inventory with this id"),
    info_InventorySave_TopLine("{gcp}----------- {gcs}[playerDisplayName] saved inventory {gcp}-----------"),
    info_InventorySave_List("{gcp}id: {gcs}[id]{gcp}. {gcs}[time]"),
    info_InventorySave_KillerSymbol("{gcw} \u2620"),
    info_InventorySave_Click("{gcp}Click to check ([id]) saved inventory"),
    info_InventorySave_IdDontExist("{gcw}This save Id doesn't exist!"),
    info_InventorySave_Deleted("{gcp}Saved inventory was successfully deleted!"),
    info_InventorySave_Restored("{gcp}You have restored {gcs}[sourcename] {gcp}inventory for {gcs}[targetname] {gcp}user."),
    info_InventorySave_GotRestored("{gcp}Your inventory was restored from {gcs}[sourcename] {gcp}saved inventory on {gcs}[time]"),
    info_InventorySave_LoadForSelf("{gcp}Load this inventory for your self"),
    info_InventorySave_LoadForOwner("{gcp}Load this inventory for owner"),
    info_InventorySave_NextInventory("{gcp}Next inventory"),
    info_InventorySave_PreviousInventory("{gcp}Previous inventory"),
    info_InventorySave_Editable("{gcp}Edit mode enabled"),
    info_InventorySave_NonEditable("{gcp}Edit mode disabled"),
    info_vanishSymbolOn("{gcs}[{gcn}H{gcs}]&r"),
    info_vanishSymbolOff(""),
    info_afkSymbolOn("{gcs}[{gcn}Afk{gcs}]&r"),
    info_afkSymbolOff(""),
    info_beeinfo("!actionbar!{gcp}Honey level: {gcs}[level]{gcp}/{gcs}[maxlevel] {gcp}Bees inside: {gcs}[count]{gcp}/{gcs}[maxcount]"),
    info_decoratedpotinfo("!actionbar!{gcp}Contents: {gcs}[items]"),
    info_pvp_noGodDamage("!actionbar!{gcw}You can't damage players while being immortal"),
    info_pve_noGodDamage("!actionbar!{gcw}You can't damage mobs while being immortal"),
    info_InvEmpty_armor("{gcp}Your armor slots should be empty!"),
    info_InvEmpty_hand("{gcp}Your hand should be empty!"),
    info_InvEmpty_maininv("{gcp}Your main inventory should be empty!"),
    info_InvEmpty_maininvslots("{gcp}Your main inventory should have atleast {gcs}[count] {gcp}empty slots!"),
    info_InvEmpty_inv("{gcp}Your inventory should be empty!"),
    info_InvEmpty_offhand("{gcp}Your offhand should be empty!"),
    info_InvEmpty_quickbar("{gcp}Your quick bar should be empty!"),
    info_InvEmpty_quickbarslots("{gcp}Your quick bar should have atleast {gcs}[count] {gcp}empty slots!"),
    info_InvEmpty_subinv("{gcp}Your sub inventory should be empty!"),
    info_InvEmpty_subinvslots("{gcp}Your sub inventory should have atleast {gcs}[count] {gcp}empty slots!"),
    info_Relog("{gcp}Relog might be needed for change to take effect"),
    info_Any("Any"),
    info_Reset("{gcp}Press {gcs}Q {gcp}to reset"),
    info_outsideWorldBorder("{gcw}Location is outside world border"),
    info_noWorldAccess("{gcw}No world access"),
    info_IncorrectColor("{gcw}Color defined incorrectly!"),
    info_IncorrectFile("{gcw}File name defined incorrectly!"),
    info_time_days("{gcn}[d]{gcn}d:", "Mainly for placeholder playtime output", "Use + sign at the start of line to force include it even if specific and previous time values are 0",
            "Use - sign at the start of line if you want to include it only if its value isn't 0. If entire output results into empty line, then we will output seconds value"),
    info_time_hours("{gcn}[h]{gcn}h "),
    info_time_minutes("{gcn}[m]{gcn}m "),
    info_time_seconds("{gcn}[s]{gcn}s"),
    dialog_signEditor("Sign Editor"),
    dialog_update("Update"),
    dialog_save("Save"),
    dialog_close("Close"),
    dialog_line("Line [line]"),
    warp_list("{gcs}[pos]{gcp}. {gcs}[warpName] {gcn}- {gcs}[worldName] ([x]:[y]:[z])"),
    afk_off("{gcs}Playing"),
    afk_MayNotRespond("{gcp}Player is AFK and may not respond", "Placeholders can be used for MayNotRespond and MayNotRespondStaff"),
    afk_MayNotRespondStaff("{gcp}Staff member is AFK and may not respond. Try contacting us through discord"),
    BossBar_hpBar("{gcs}[victim] {gcs}[current]{gcs}/{gcs}[max] {gcs}({gcw}-[damage]{gcs})"),
    BossBar_playerhpBar("{gcs}%cmi_user_display_name% {gcs}[current]{gcs}/{gcs}[max] {gcs}({gcw}-[damage]{gcs})"),
    Potion_Effects("{gcp}Potion effects"),
    Potion_List("{gcs}[PotionName] [PotionAmplifier] {gcp}Duration: {gcs}[LeftDuration] {gcp}sec"),
    Potion_NoPotions("{gcp}None"),
    Information_Title("{gcp}Players information"),
    Information_Health("{gcp}Health: {gcs}[Health]/[maxHealth]"),
    Information_Hunger("{gcp}Hunger: {gcs}[Hunger]"),
    Information_Saturation("{gcp}Saturation: {gcs}[Saturation]"),
    Information_Exp("{gcp}Exp: {gcs}[Exp]"),
    Information_NotEnoughExp("{gcp}Not enough exp: {gcs}[Exp]"),
    Information_NotEnoughExpNeed("{gcp}Not enough exp: {gcs}[Exp]/[need]"),
    Information_tooMuchExp("{gcp}Too much exp: {gcs}[Exp]/[need]"),
    Information_NotEnoughVotes("{gcp}Not enough votes: {gcs}[votes]"),
    Information_TooMuchVotes("{gcp}Too many votes: {gcs}[votes]"),
    Information_BadGameMode("{gcw}You can't do this in your current game mode"),
    Information_BadArea("{gcw}You can't perform this action in this area"),
    Information_GameMode("{gcp}GameMode: {gcs}[GameMode]"),
    Information_Flying("{gcp}Flying: {gcs}[Flying]"),
    Information_Uuid("{gcs}[uuid]"),
    Information_FirstConnection("{gcp}First connection: {gcs}[time]"),
    Information_Lastseen("{gcp}Last seen: {gcs}[time]"),
    Information_Onlinesince("{gcp}Online since: {gcs}[time]"),
    Information_Money("{gcp}Balance: {gcs}[money]"),
    Information_Group("{gcp}Group: {gcs}[group]"),
    econ_commandCost("{gcp}This command cost is {gcs}[cost] {gcp}repeat it or click here to confirm"),
    econ_disabled("{gcw}Can't use this command while economy support is disabled"),
    Elytra_Speed("{gcp}Speed: {gcs}[speed]{gcp}km/h"),
    Elytra_SpeedBoost(" {gcs}+ "),
    Elytra_SpeedSuperBoost(" {gcn}+ "),
    Elytra_CanUse("{gcw}Can't equip elytra without permission!"),
    Elytra_CantGlide("{gcw}Can't use elytra here!"),
    Elytra_Charging("{gcp}Charging {gcs}[percentage]{gcp}%"),
    NetherPortal_ToHigh("{gcw}Portal is to big, max height is {gcs}[max]{gcw}!"),
    NetherPortal_ToWide("{gcw}Portal is to wide, max width is {gcs}[max]{gcw}!"),
    NetherPortal_Creation("!actionbar!{gcp}Created [height]x[width] nether portal!"),
    NetherPortal_Disabled("{gcw}Portal creation disabled!"),
    Ender_Title("{gcp}Open ender chest"),
    Chat_localPrefix(""),
    Chat_shoutPrefix("{gcn}[S]&r"),
    Chat_LocalNoOne("!actionbar!{gcw}Nobody hear you, write ! before message for global chat"),
    Chat_shoutDeduction("!actionbar!{gcw}Deducted {gcs}[amount] {gcw}for shout"),
    Chat_publicHover(Arrays.asList("{gcp}Sent time: {gcs}%server_time_hh:mm:ss%"), "Use \\n to add new line"),
    Chat_privateHover(Arrays.asList("{gcp}Sent time: {gcs}%server_time_hh:mm:ss%")),
    Chat_staffHover(Arrays.asList("{gcp}Sent time: {gcs}%server_time_hh:mm:ss%")),
    Chat_helpopHover(Arrays.asList("{gcp}Sent time: {gcs}%server_time_hh:mm:ss%")),
    Chat_link("&l{gcw}[{gcn}LINK{gcw}]"),
    Chat_item("{gcn}[%cmi_iteminhand_displayname%[amount]{gcn}]"),
    Chat_itemAmount(" x[amount]"),
    Chat_itemEmpty("{gcn}[Mighty fist]"),
    Spy_Chat_msg("{gcn}Spy{gcp}[{gcp}[senderDisplayName] {gcp}-> {gcp}[playerDisplayName]{gcp}]{gcs} [message]"),
    Spy_Chat_custom("{gcn}Spy{gcp}[senderDisplayName] {gcp}-> {gcw}|{gcp}[place]{gcw}|{gcs} [message]"),
    Spy_Command_msg("{gcs}C{gcn}Spy{gcp}[{gcp}[senderDisplayName]{gcp}]{gcp}: {gcs}[command]"),
    Spy_Sign_msg("{gcs}Sign{gcn}Spy{gcp}[{gcp}[senderDisplayName]{gcp}]{gcp}: {gcs}[text]"),
    info_CommandFormat("{gcw}Incorrect command format"),
    info_ServerSwitchOut(" {gcs}[playerDisplayName] {gcp}switched server to {gcs}[serverName]"),
    info_ServerSwitchIn(" {gcs}[playerDisplayName] {gcp}came from {gcs}[serverName] {gcp}server");

    private String text = null;
    private List<String> comments = null;

    private CMILC(String text) {
        this(text, "");
    }

    private CMILC(String text, String... comment) {
    }

    private CMILC(List<String> ls) {
        this(ls, "");
    }

    private CMILC(List<String> ls, String... comment) {
    }

    public String getText() {
        return null;
    }

    public String getPt() {
        return null;
    }

    public List<String> getComments() {
        return null;
    }

    public String getLocale(Object... values) {
        return null;
    }

    public void sendMessage(Object sender, Object... values) {
    }

    public static void info(Class<?> c, CMIUser user, String path, Object... variables) {
    }

    public static void info(Object c, CMIUser user, String path, Object... variables) {
    }

    public static void info(Class<?> c, CommandSender sender, String path, Object... variables) {
    }

    public static void info(Object thi, CommandSender sender, String path, Object... variables) {
    }

    public static void info(String c, CommandSender sender, String path, Object... variables) {
    }

    public static void info(String c, Player player, String path, Object... variables) {
    }

    public static String getIM(Class<?> c, String path, Object... variables) {
        return null;
    }

    public static String getIM(Object c, String path, Object... variables) {
        return null;
    }

    public static String getIM(String cmd, String path, Object... variables) {
        return null;
    }

    public static List<String> getIML(String cmd, String path, Object... variables) {
        return null;
    }

    public static List<String> getIML(Object c, String path, Object... variables) {
        return null;
    }

    public static List<String> getIML(Class<?> c, String path, Object... variables) {
        return null;
    }

    public static void sendMessageByPath(Object sender, String path, Object... variables) {
    }

    public static void sendMessageByPath(String locale, Object sender, String path, Object... variables) {
    }

    public static void sendMessage(Object sender, String msg) {
    }

    public static void sendMessage(Object sender, String msg, boolean updateSnd) {
    }

    public static void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors) {
    }

    public static void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors, boolean translatePlaceholders) {
    }

    public static void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors, boolean translatePlaceholders, boolean filterNewLine) {
    }

    public static int broadcastMessage(String msg) {
        return 0;
    }

    public static int broadcastMessage(CommandSender sender, String msg) {
        return 0;
    }

    public static int broadcastMessage(CommandSender sender, CMIPerm perm, String msg) {
        return 0;
    }

    public static int broadcastMessage(CommandSender sender, String msg, boolean showForsender) {
        return 0;
    }

    public static int broadcastMessage(CommandSender sender, String msg, boolean showForsender, Set<Player> ignorePlayers) {
        return 0;
    }

    public static int broadcastMessage(CommandSender sender, String msg, boolean showForsender, CMIPerm perm, Set<Player> ignorePlayers) {
        return 0;
    }

    public static List<String> updateSnd(List<String> msg, Snd snd) {
        return null;
    }

    public static String updateSnd(Snd snd, String msg) {
        return null;
    }

    public static String getOffOn(Player player, Player whoGets) {
        return null;
    }

    public static String getOffOn(Player player) {
        return null;
    }

    public static String getOffOn(boolean state) {
        return null;
    }
}
