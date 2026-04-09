package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Display.CMIBillboard;
import com.Zrips.CMI.Modules.Display.CMITextAlignment;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramAnimationSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramBoardSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramIconSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramPageSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramTextSettings;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIHologram {
    public static final double LINE_HEIGHT = 0.0;
    private static String left = null;
    private static String right = null;
    private static String shiftLeft = null;
    private static String shiftRight = null;
    protected CMILocation loc = null;
    protected String name = null;
    private boolean enabled = false;
    private Vector centerLocation = null;
    private CMIHologramType type = null;
    private Set<UUID> playersInHologramUpdateRange = null;
    private Set<UUID> playersInHologramVisibilityRange = null;
    ConcurrentHashMap<CMIHologramType, CMIHologramProcessor> processors = null;
    private CMIHologramSettings settings = null;
    private CMIHologramTextSettings textSettings = null;
    private CMIHologramIconSettings iconSettings = null;
    private CMIHologramInteraction interactionSettings = null;
    private CMIHologramAnimationSettings animationSettings = null;
    private CMIHologramBoardSettings boardSettings = null;
    private CMIHologramPageSettings pageSettings = null;
    private CMIHologramHoverModule hoverModule = null;
    private CMIHologramPages pages = null;
    private CMIHologramLine autoPageLine = null;
    protected ConcurrentHashMap<UUID, CMIHologramUserData> userData = null;
    private CMITask scheduler = null;
    private ConcurrentHashMap<CMIHologramSchedulerType, CMIHologramSchedulerData> schedulerUpdates = null;

    @Deprecated
    public CMIHologram(Location loc, Player player, List<String> lines) {
    }

    public CMIHologram(String name, Location loc) {
        this(name, new CMILocation(loc));
    }

    public CMIHologram(String name, CMILocation loc) {
    }

    public Location getCenterLocation(Player player) {
        return null;
    }

    protected CMIHologramLine getAutoPageLine() {
        return null;
    }

    public Vector getCenterVector() {
        return null;
    }

    public Location getCenterLocation() {
        return null;
    }

    public double getLineHeight() {
        return 0.0;
    }

    public CMIHologramTextSettings getTextSettings() {
        return null;
    }

    public CMIHologramInteraction getInteractionSettings() {
        return null;
    }

    public CMIHologramPages getPages() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public String getWorldName() {
        return null;
    }

    public CMILocation getLocation() {
        return null;
    }

    protected CMILocation getLocationWithPitchYaw() {
        return null;
    }

    public void relocateGroup(Location loc) {
    }

    public void setLocation(Location loc) {
    }

    public void setLocation(CMILocation loc) {
    }

    public CompletableFuture<Void> requestFullUpdate() {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(List<CMIHologramUpdateType> types) {
        return null;
    }

    public CompletableFuture<Void> requestTextUpdate() {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(CMIHologramUpdateType... types) {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(Player player) {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(UUID uuid, CMIHologramUpdateType... types) {
        return null;
    }

    public static void onShutdown() {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public synchronized CMIHologramUserData getData(Player player) {
        return null;
    }

    public synchronized CMIHologramUserData getData(UUID uuid) {
        return null;
    }

    public synchronized void resetCache() {
    }

    public synchronized void resetIconCache() {
    }

    protected synchronized CMIHologramUserData removeData(UUID uuid) {
        return null;
    }

    public synchronized Set<UUID> getPlayersFromUpdateRange() {
        return null;
    }

    public synchronized void addPlayerToUpdateRange(UUID uuid) {
    }

    public synchronized void removePlayerFromUpdateRange(UUID uuid) {
    }

    public synchronized Set<UUID> getPlayersFromVisibilityRange() {
        return null;
    }

    public synchronized void addPlayerToVisibilityRange(UUID uuid) {
    }

    public synchronized CompletableFuture<Void> removePlayerFromVisibilityRange(UUID uuid) {
        return null;
    }

    public void removeFromCache(UUID uuid) {
    }

    public void removeFromCache(UUID uuid, boolean deleteData) {
    }

    public CompletableFuture<Void> instantHide() {
        return null;
    }

    public CompletableFuture<Void> hide() {
        return null;
    }

    public CompletableFuture<Void> hide(UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> instantHide(UUID uuid) {
        return null;
    }

    @Nullable
    public CMIHologramPage getPlayerPage(Player player) {
        return null;
    }

    @Nullable
    public CMIHologramPage getPlayerPage(UUID uuid) {
        return null;
    }

    protected List<CMIHologramLine> getLinesByPlayerPage(UUID uuid) {
        return null;
    }

    public void goToNextPage(Player player) {
    }

    public void goToNextPage(UUID uuid) {
    }

    public void goToPrevPage(Player player) {
    }

    public void goToPrevPage(UUID uuid) {
    }

    public void goToPage(UUID uuid, int page) {
    }

    protected CompletableFuture<Void> updateCycle(UUID uuid, Set<CMIHologramUpdateType> typesList) {
        return null;
    }

    protected List<CMIHologramLine> getAllLines(CMIHologramPage page) {
        return null;
    }

    public void onInteraction(Player player, CMIInteractType type) {
    }

    protected void processClick(Player player, CMIInteractType action, CMIVector3D cmiVector3D, CMIHologramLinePortion cmiHologramLinePortion) {
    }

    protected CompletableFuture<Void> updateBillboard(UUID uuid, Set<CMIHologramUpdateType> typesList) {
        return null;
    }

    public void show(Player player) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public void disable() {
    }

    public void enable() {
    }

    public List<String> getCommands(Player player, CMIInteractType type) {
        return null;
    }

    public void recheckScheduler() {
    }

    public Set<CMIHologramUpdateType> getThingsToUpdate() {
        return null;
    }

    public Set<CMIHologramUpdateType> initializeAutoCycle() {
        return null;
    }

    public void remove() {
    }

    public void recheckPermissionAccess() {
    }

    protected synchronized void resetScheduler() {
    }

    public CMIHologramSettings getSettings() {
        return null;
    }

    public CMIHologramIconSettings getIconSettings() {
        return null;
    }

    public CMIHologramBoardSettings getBoardSettings() {
        return null;
    }

    public CMIHologramAnimationSettings getAnimationSettings() {
        return null;
    }

    public CMIHologramPageSettings getPageSettings() {
        return null;
    }

    public CMIHologramHoverModule getHoverModule() {
        return null;
    }

    @NotNull
    public CMIHologramType getHologramType(UUID uuid) {
        return null;
    }

    @NotNull
    public CMIHologramProcessor getProcessor(CMIHologramType type) {
        return null;
    }

    public CMIHologramType getType() {
        return null;
    }

    public CMIHologram setType(CMIHologramType type) {
        return null;
    }

    @Nullable
    public static CMIHologram deserialize(Map<String, Object> entry) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    public void updatePlayers() {
    }

    public CompletableFuture<Void> removePlayers() {
        return null;
    }

    public void updatePlayer(Player player) {
    }

    public CompletableFuture<Void> removePlayer(UUID uuid) {
        return null;
    }

    public void recalculateChunks() {
    }

    public List<UUID> detectPlayersInVisibilityRange() {
        return null;
    }

    public List<UUID> detectPlayersInUpdateRange() {
        return null;
    }

    public void show() {
    }

    public void update() {
    }

    public void saveToFile() {
    }

    public void delete() {
    }

    public void reset() {
    }

    public boolean isInUpdateRange(UUID uuid) {
        return false;
    }

    public boolean isInVisibilityRange(UUID uuid) {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void update(Player player) {
    }

    @Deprecated(forRemoval = true)
    public void moveTo(Location loc) {
    }

    @Deprecated(forRemoval = true)
    public void superficialMoveTo(Location loc) {
    }

    @Deprecated(forRemoval = true)
    public void setLoc(Location loc) {
    }

    @Deprecated(forRemoval = true)
    public double getHeight() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public CuboidArea getAreaExtra() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setAreaExtra(CuboidArea area) {
    }

    @Deprecated(forRemoval = true)
    public CMILocation getLoc() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public synchronized void setLines(List<String> l) {
    }

    @Deprecated(forRemoval = true)
    public void addLine(String line) {
    }

    @Deprecated(forRemoval = true)
    public void setLine(int place, String line) {
    }

    @Deprecated(forRemoval = true)
    public String getLine(int place) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void removeLine(int line) {
    }

    @Deprecated(forRemoval = true)
    public List<String> getLines() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void recheckLines() {
    }

    @Deprecated(forRemoval = true)
    public boolean isChangedLine() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void removeFromCache(UUID uuid, int size) {
    }

    @Deprecated(forRemoval = true)
    public void clearFakeEntities() {
    }

    @Deprecated(forRemoval = true)
    public void updatePages() {
    }

    @Deprecated(forRemoval = true)
    public void hide(Player player) {
    }

    @Deprecated(forRemoval = true)
    public void refresh() {
    }

    @Deprecated(forRemoval = true)
    public void processPrevNextPageClick(Player player) {
    }

    @Deprecated(forRemoval = true)
    public void checkHoverPosition(Player player) {
    }

    @Deprecated(forRemoval = true)
    void generalUpdate(Player player, boolean oneTime) {
    }

    @Deprecated(forRemoval = true)
    public void update(Player player, boolean oneTime) {
    }

    @Deprecated(forRemoval = true)
    public List<String> getCommands() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public List<String> getCommands(Player player) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setCommands(List<String> commands) {
    }

    @Deprecated(forRemoval = true)
    public double getUpdateIntervalSec() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setUpdateIntervalSec(double d) {
    }

    @Deprecated(forRemoval = true)
    public int getUpdateRange() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setUpdateRange(int activationRange) {
    }

    @Deprecated(forRemoval = true)
    public int getShowRange() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setShowRange(int showRange) {
    }

    @Deprecated(forRemoval = true)
    public Double getIconSpacing() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setIconSpacing(Double iconSpacing) {
    }

    @Deprecated(forRemoval = true)
    public Double getSpacing() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setSpacing(Double spacing) {
    }

    @Deprecated(forRemoval = true)
    public Boolean isDownOrder() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setDownOrder(Boolean downOrder) {
    }

    @Deprecated(forRemoval = true)
    public boolean isInteractable() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setInteractable(boolean interactable) {
    }

    @Deprecated(forRemoval = true)
    public boolean isShowParticle() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setShowParticle(boolean showParticle) {
    }

    @Deprecated(forRemoval = true)
    public boolean isBigButton() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setBigButton(boolean bigButton) {
    }

    @Deprecated(forRemoval = true)
    public synchronized CMITask getSched() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public synchronized void setSched(CMITask schedId) {
    }

    @Deprecated(forRemoval = true)
    public void stop() {
    }

    @Deprecated(forRemoval = true)
    public Set<UUID> getLastHoloInRange() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void clearLastHoloInRange() {
    }

    @Deprecated(forRemoval = true)
    public boolean isEmptyLastHoloInRange() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public boolean containsLastHoloInRange(UUID uuid) {
        return false;
    }

    @Deprecated(forRemoval = true)
    public synchronized void recheckTaskers() {
    }

    @Deprecated(forRemoval = true)
    public synchronized void addLastHoloInRange(UUID uuid) {
    }

    @Deprecated(forRemoval = true)
    public synchronized void removeLastHoloInRange(UUID uuid) {
    }

    @Deprecated(forRemoval = true)
    public boolean isEmptyLastHoloInRangeExtra() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void clearLastHoloInRangeExtra() {
    }

    @Deprecated(forRemoval = true)
    public boolean containsLastHoloInRangeExtra(UUID uuid) {
        return false;
    }

    @Deprecated(forRemoval = true)
    public Set<UUID> getLastHoloInRangeExtra() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void addLastHoloInRangeExtra(UUID uuid) {
    }

    @Deprecated(forRemoval = true)
    public void removeLastHoloInRangeExtra(UUID uuid) {
    }

    @Deprecated(forRemoval = true)
    public boolean isuSync() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setuSync(boolean uSync) {
    }

    @Deprecated(forRemoval = true)
    public boolean isSaveToFile() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setSaveToFile(boolean saveToFile) {
    }

    @Deprecated(forRemoval = true)
    public void makePersistent() {
    }

    @Deprecated(forRemoval = true)
    public int getPageCount() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public boolean isRequiresPermission() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setPermissionRequirement(boolean requestPermission) {
    }

    @Deprecated(forRemoval = true)
    public double getPageChangeIntervalSec() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setPageChangeIntervalSec(double pageChangeIntervalSec) {
    }

    @Deprecated(forRemoval = true)
    public boolean isSticky() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setSticky(boolean sticky) {
    }

    @Deprecated(forRemoval = true)
    public boolean isCheckLineOfSight() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setLOSInterval(double LOSupdateIntervalSec) {
    }

    @Deprecated(forRemoval = true)
    public double getLOSupdateIntervalSec() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public boolean isFollowPlayer() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setFollowPlayer(double followPlayer) {
    }

    @Deprecated(forRemoval = true)
    public double getFollowPlayer() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public int getHoveringLine(UUID uuid) {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public boolean isShowHoverParticle() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setShowHoverParticle(boolean showHoverParticle) {
    }

    @Deprecated(forRemoval = true)
    public boolean isNewIneractionMethod() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setNewIneractionMethod(boolean newIneractionMethod) {
    }

    @Deprecated(forRemoval = true)
    public int getParticleCount() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setParticleCount(int particleCount) {
    }

    @Deprecated(forRemoval = true)
    public double getParticleSpacing() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setParticleSpacing(double particleSpacing) {
    }

    @Deprecated(forRemoval = true)
    public double getExtraParticleHeight() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setExtraParticleHeight(double extraParticleHeight) {
    }

    @Deprecated(forRemoval = true)
    public double getExtraParticleWidth() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setExtraParticleWidth(double extraParticleWidth) {
    }

    @Deprecated(forRemoval = true)
    public double getExtraInteractionHeight() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setExtraInteractionHeight(double extraInteractionHeight) {
    }

    @Deprecated(forRemoval = true)
    public double getExtraInteractionWidth() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setExtraInteractionWidth(double extraInteractionWidth) {
    }

    @Deprecated(forRemoval = true)
    public CMIEffect getHoverEffect() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setHoverEffect(CMIParticle effect) {
    }

    @Deprecated(forRemoval = true)
    public double getParticleOffsetX() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setParticleOffsetX(double particleOffsetX) {
    }

    @Deprecated(forRemoval = true)
    public double getParticleOffsetY() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public void setParticleOffsetY(double particleOffsetY) {
    }

    @Deprecated(forRemoval = true)
    public boolean isStabilizedHoverParticles() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setStabilizedHoverParticles(boolean stabilizedHoverParticles) {
    }

    @Deprecated(forRemoval = true)
    public boolean isShowWhenNotPersistent() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setShowWhenNotPersistent(boolean showWhenNotPersistent) {
    }

    @Deprecated(forRemoval = true)
    public boolean isNewDisplayMethod() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setNewDisplayMethod(boolean newDisplayMethod) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIBillboard getBillboard() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setBillboard(CMIBillboard billboard) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIBillboard getIconBillboard() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setIconBillboard(CMIBillboard billboard) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getYaw() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setYaw(int angle) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getPitch() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setPitch(int angle) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMITextAlignment getTextAlignment() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setTextAlignment(CMITextAlignment textAlignment) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIChatColor getBackgroundColor() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setBackgroundColor(CMIChatColor backgroundColor) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getBackgroundAlpha() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setBackgroundAlpha(int alpha) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getTextAlpha() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setTextAlpha(int alpha) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public boolean isDoubleSided() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setDoubleSided(boolean doubleSided) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public boolean isShadowed() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setShadowed(boolean shadowed) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public double getScaleW() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setScaleW(double scale) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public double getScaleH() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setScaleH(double scale) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public double getIconScale() {
        return 0.0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setIconScale(double iconScale) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getIconPitch() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setIconPitch(int iconPitch) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getIconYaw() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setIconYaw(int iconYaw) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getSkyLevel() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setSkyLevel(int skyLevel) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getBlockLevel() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setBlockLevel(int blockLevel) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public Player getPlayerToShowFor() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setPlayerToShowFor(Player playerToShowFor) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public int getSelfDestructIn() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public CMIHologram setSelfDestructIn(int selfDestructIn) {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void showToPlayer() {
    }

    @Deprecated(forRemoval = true)
    public boolean isAutoPagination() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setAutoPagination(boolean autoPagination) {
    }

    @Deprecated(forRemoval = true)
    public boolean isSeeThrough() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setSeeThrough(boolean seeThrough) {
    }

    @Deprecated(forRemoval = true)
    public boolean isFadeInAnimation() {
        return false;
    }

    @Deprecated(forRemoval = true)
    public void setFadeInAnimation(boolean fadeInAnimation) {
    }

    @Deprecated(forRemoval = true)
    public int getAutoPaginationOffset() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setAutoPaginationOffset(int autoPaginationOffset) {
    }

    @Deprecated(forRemoval = true)
    public String getGroup() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setGroup(String group) {
    }

    @Deprecated(forRemoval = true)
    public float getIconOffsetX() {
        return 0.0f;
    }

    @Deprecated(forRemoval = true)
    public void setIconOffsetX(float iconOffsetX) {
    }

    @Deprecated(forRemoval = true)
    public int getLineWidth() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setLineWidth(int lineWidth) {
    }

    @Deprecated(forRemoval = true)
    public int getFillerAmount() {
        return 0;
    }

    @Deprecated(forRemoval = true)
    public void setFillerAmount(int fillerAmount) {
    }

    @Deprecated(forRemoval = true)
    public CuboidArea getArea() {
        return null;
    }

    @Deprecated(forRemoval = true)
    public void setArea(CuboidArea area) {
    }
}
