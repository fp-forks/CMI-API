package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class spawnmob implements Cmd {
    private static final Pattern pattern = null;
    int spawned = 0;
    int spawnedPassangers = 0;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 190, info = "Spawns entity at your location", args = "[EntityType]", tab = { "EntityType" }, explanation = { "Example: /cmi spawnmob sheep:adult:rainbow 3 sp:5",
            "<T>More information at www.zrips.net/cmi/commands/spawnmob/</T><URL>https://www.zrips.net/cmi/commands/spawnmob/</URL>" }, regVar = { -100 }, consoleVar = { -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static void proccessMob(CommandSender sender, Entity ent, String subValues) {
    }

    enum spawnmobValues {
        glow,
        n_$1("name-$1"),
        hidename,
        s_$1("speed-$1"),
        sc_$1("scale-$1"),
        effect_$1("effects-$1"),
        hp_$1,
        pickup("pickitems"),
        nopickup,
        immortal,
        invisible,
        nograv("nogravity"),
        baby,
        adult,
        derp,
        dumb("noai"),
        expire_$1("ex-$1"),
        notpersistent,
        t_$1("target-$1"),
        leash_$1("leash-$1"),
        tamed,
        saddle,
        chest,
        angry,
        upwards("dinnerbone"),
        rainbow("jeb"),
        charge("charged"),
        bounce,
        screaming,
        brown,
        none,
        onfire,
        skull_$1("head-$1"),
        helmet_$1,
        chestplate_$1("breastplate-$1"),
        legs_$1,
        boots_$1,
        mhand_$1("mainhand-$1"),
        ohand_$1("offhand-$1"),
        potion_$1,
        particle_$1,
        color_$1,
        radius_$1,
        duration_$1,
        radiustick_$1,
        noplate,
        arms,
        noarms,
        small,
        warm,
        cold,
        temperate,
        incendiary;

        private String[] alternatives = null;
        private boolean variable = false;
        static HashMap<String, spawnmobValues> cache = null;

        spawnmobValues() {
        }

        spawnmobValues(String... alternatives) {
        }

        public String[] getAlternatives() {
            return null;
        }

        public boolean isVariable() {
            return false;
        }

        public static spawnmobValues getByVariable(String variable) {
            return null;
        }
    }
}
