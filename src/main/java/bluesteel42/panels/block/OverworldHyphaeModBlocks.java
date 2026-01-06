package bluesteel42.panels.block;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import java.util.Arrays;
import java.util.List;

import static bluesteel42.overworldhyphae.block.ModBlocks.*;

public class OverworldHyphaeModBlocks {
    public static final Block MUSHROOM_PANEL = registerPanel(OverworldHyphae.plainDyeColor, MUSHROOM_PLANKS);
    public static final Block WHITE_MUSHROOM_PANEL = registerPanel(OverworldHyphae.whiteDyeColor, WHITE_MUSHROOM_PLANKS);
    public static final Block LIGHT_GRAY_MUSHROOM_PANEL = registerPanel(OverworldHyphae.lightGrayDyeColor, LIGHT_GRAY_MUSHROOM_PLANKS);
    public static final Block GRAY_MUSHROOM_PANEL = registerPanel(OverworldHyphae.grayDyeColor, GRAY_MUSHROOM_PLANKS);
    public static final Block BLACK_MUSHROOM_PANEL = registerPanel(OverworldHyphae.blackDyeColor, BLACK_MUSHROOM_PLANKS);
    public static final Block BROWN_MUSHROOM_PANEL = registerPanel(OverworldHyphae.brownDyeColor, BROWN_MUSHROOM_PLANKS);
    public static final Block RED_MUSHROOM_PANEL = registerPanel(OverworldHyphae.redDyeColor, RED_MUSHROOM_PLANKS);
    public static final Block ORANGE_MUSHROOM_PANEL = registerPanel(OverworldHyphae.orangeDyeColor, ORANGE_MUSHROOM_PLANKS);
    public static final Block YELLOW_MUSHROOM_PANEL = registerPanel(OverworldHyphae.yellowDyeColor, YELLOW_MUSHROOM_PLANKS);
    public static final Block LIME_MUSHROOM_PANEL = registerPanel(OverworldHyphae.limeDyeColor, LIME_MUSHROOM_PLANKS);
    public static final Block GREEN_MUSHROOM_PANEL = registerPanel(OverworldHyphae.greenDyeColor, GREEN_MUSHROOM_PLANKS);
    public static final Block CYAN_MUSHROOM_PANEL = registerPanel(OverworldHyphae.cyanDyeColor, CYAN_MUSHROOM_PLANKS);
    public static final Block LIGHT_BLUE_MUSHROOM_PANEL = registerPanel(OverworldHyphae.lightBlueDyeColor, LIGHT_BLUE_MUSHROOM_PLANKS);
    public static final Block BLUE_MUSHROOM_PANEL = registerPanel(OverworldHyphae.blueDyeColor, BLUE_MUSHROOM_PLANKS);
    public static final Block PURPLE_MUSHROOM_PANEL = registerPanel(OverworldHyphae.purpleDyeColor, PURPLE_MUSHROOM_PLANKS);
    public static final Block MAGENTA_MUSHROOM_PANEL = registerPanel(OverworldHyphae.magentaDyeColor, MAGENTA_MUSHROOM_PLANKS);
    public static final Block PINK_MUSHROOM_PANEL = registerPanel(OverworldHyphae.pinkDyeColor, PINK_MUSHROOM_PLANKS);

    public static final List<Item> DYED_PANELS = Arrays.asList(OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL.asItem(), OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL.asItem());

    private static Block registerPanel(String dyeColor, Block plankBlock) {
        return ModBlocks.register(dyeColor + "mushroom_panel",
                PanelBlock::new,
                AbstractBlock.Settings.copy(plankBlock)
        );
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(MUSHROOM_SLAB, OverworldHyphaeModBlocks.MUSHROOM_PANEL);
                    itemGroup.addAfter(WHITE_MUSHROOM_SLAB, OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL);
                    itemGroup.addAfter(LIGHT_GRAY_MUSHROOM_SLAB, OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL);
                    itemGroup.addAfter(GRAY_MUSHROOM_SLAB, OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL);
                    itemGroup.addAfter(BLACK_MUSHROOM_SLAB, OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL);
                    itemGroup.addAfter(BROWN_MUSHROOM_SLAB, OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL);
                    itemGroup.addAfter(RED_MUSHROOM_SLAB, OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL);
                    itemGroup.addAfter(ORANGE_MUSHROOM_SLAB, OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL);
                    itemGroup.addAfter(YELLOW_MUSHROOM_SLAB, OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL);
                    itemGroup.addAfter(LIME_MUSHROOM_SLAB, OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL);
                    itemGroup.addAfter(GREEN_MUSHROOM_SLAB, OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL);
                    itemGroup.addAfter(CYAN_MUSHROOM_SLAB, OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL);
                    itemGroup.addAfter(LIGHT_BLUE_MUSHROOM_SLAB, OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL);
                    itemGroup.addAfter(BLUE_MUSHROOM_SLAB, OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL);
                    itemGroup.addAfter(PURPLE_MUSHROOM_SLAB, OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL);
                    itemGroup.addAfter(MAGENTA_MUSHROOM_SLAB, OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL);
                    itemGroup.addAfter(PINK_MUSHROOM_SLAB, OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL);
                });
    }
}
