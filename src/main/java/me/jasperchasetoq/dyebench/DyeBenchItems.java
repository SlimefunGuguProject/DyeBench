package me.jasperchasetoq.dyebench;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.jasperchasetoq.wolfylibrary.slimefun.items.api.MachineLevel;
import me.jasperchasetoq.wolfylibrary.slimefun.items.api.MachineType;
import me.jasperchasetoq.wolfylibrary.slimefun.utils.ItemLore;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DyeBenchItems {
    private DyeBenchItems() {}

    //groups
    public static final NestedItemGroup DyeBenchNestedGeneral = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_GENERAL"), new CustomItemStack(Material.LOOM, "&b染色工艺"));
    public static final SubItemGroup DyeBenchMachines = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_MACHINES"), DyeBenchNestedGeneral, new CustomItemStack(Material.LOOM, "&b机器"));
    public static final SubItemGroup DyeBenchPigments = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_PIGMENTS"), DyeBenchNestedGeneral, new CustomItemStack(Material.WHITE_DYE, "&b颜料"));

    //machines
    public static final SlimefunItemStack JC_DYEBENCH = new SlimefunItemStack("JC_DYEBENCH", Material.LOOM, "&e染色台", "&f可以在染色台中使用颜料给物品染色", ItemLore.machine(MachineLevel.BASIC, MachineType.MACHINE), ItemLore.EnergyPerSlimefunTick(25));
    //Pigments
    public static final SlimefunItemStack JC_WHITE_PIGMENT = new SlimefunItemStack("JC_WHITE_PIGMENT", Material.WHITE_DYE, "&f白色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_ORANGE_PIGMENT = new SlimefunItemStack("JC_ORANGE_PIGMENT", Material.ORANGE_DYE, "&6橙色颜料", "", "&6一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_MAGENTA_PIGMENT = new SlimefunItemStack("JC_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&f品红颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("JC_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&f淡蓝色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_YELLOW_PIGMENT = new SlimefunItemStack("JC_YELLOW_PIGMENT", Material.YELLOW_DYE, "&f黄色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_LIME_PIGMENT = new SlimefunItemStack("JC_LIME_PIGMENT", Material.LIME_DYE, "&f黄绿色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_PINK_PIGMENT = new SlimefunItemStack("JC_PINK_PIGMENT", Material.PINK_DYE, "&f粉色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_GRAY_PIGMENT = new SlimefunItemStack("JC_GRAY_PIGMENT", Material.GRAY_DYE, "&f灰色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("JC_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&fL淡灰色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_CYAN_PIGMENT = new SlimefunItemStack("JC_CYAN_PIGMENT", Material.CYAN_DYE, "&3青色颜料", "", "&3一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_PURPLE_PIGMENT = new SlimefunItemStack("JC_PURPLE_PIGMENT", Material.PURPLE_DYE, "&f紫色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_BLUE_PIGMENT = new SlimefunItemStack("JC_BLUE_PIGMENT", Material.BLUE_DYE, "&f蓝色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_BROWN_PIGMENT = new SlimefunItemStack("JC_BROWN_PIGMENT", Material.BROWN_DYE, "&f棕色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_GREEN_PIGMENT = new SlimefunItemStack("JC_GREEN_PIGMENT", Material.GREEN_DYE, "&f绿色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_RED_PIGMENT = new SlimefunItemStack("JC_RED_PIGMENT", Material.RED_DYE, "&f红色颜料", "", "&f一个可循环使用的颜料", "");
    public static final SlimefunItemStack JC_BLACK_PIGMENT = new SlimefunItemStack("JC_BLACK_PIGMENT", Material.BLACK_DYE, "&0黑色颜料", "", "&0一个可循环使用的颜料", "");

}

