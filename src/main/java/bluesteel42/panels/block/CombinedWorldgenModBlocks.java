package bluesteel42.panels.block;

import bluesteel42.combinedworldgen.block.building.ModBuildingBlocks;
import bluesteel42.combinedworldgen.wood.azalea.AzaleaWoodInitializer;
import bluesteel42.combinedworldgen.wood.azalea.block.AzaleaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.baobab.BaobabWoodInitializer;
import bluesteel42.combinedworldgen.wood.baobab.block.BaobabWoodModBlocks;
import bluesteel42.combinedworldgen.wood.cholla.ChollaWoodInitializer;
import bluesteel42.combinedworldgen.wood.cholla.block.ChollaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.chorus.ChorusWoodInitializer;
import bluesteel42.combinedworldgen.wood.chorus.block.ChorusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.citrus.CitrusWoodInitializer;
import bluesteel42.combinedworldgen.wood.citrus.block.CitrusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.dogwood.DogwoodWoodInitializer;
import bluesteel42.combinedworldgen.wood.dogwood.block.DogwoodWoodModBlocks;
import bluesteel42.combinedworldgen.wood.kapok.KapokWoodInitializer;
import bluesteel42.combinedworldgen.wood.kapok.block.KapokWoodModBlocks;
import bluesteel42.combinedworldgen.wood.maple.MapleWoodInitializer;
import bluesteel42.combinedworldgen.wood.maple.block.MapleWoodModBlocks;
import bluesteel42.combinedworldgen.wood.petrified.PetrifiedWoodInitializer;
import bluesteel42.combinedworldgen.wood.petrified.block.PetrifiedWoodModBlocks;
import bluesteel42.combinedworldgen.wood.pine.PineWoodInitializer;
import bluesteel42.combinedworldgen.wood.pine.block.PineWoodModBlocks;
import bluesteel42.combinedworldgen.wood.willow.WillowWoodInitializer;
import bluesteel42.combinedworldgen.wood.willow.block.WillowWoodModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

public class CombinedWorldgenModBlocks {
    public static final Block SMOOTH_DEEPSLATE_PANEL = ModBlocks.register("smooth_deepslate_panel", PanelBlock::new,AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(3.5F, 6.0F));
    public static final Block MOSSY_BRICK_PANEL = ModBlocks.register(
            "mossy_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.copy(Blocks.BRICKS)
    );
    public static final Block MOSSY_TUFF_BRICK_PANEL = ModBlocks.register(
            "mossy_tuff_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)
    );
    public static final Block MOSSY_DEEPSLATE_BRICK_PANEL = ModBlocks.register(
            "mossy_deepslate_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)
    );
    public static final Block MOSSY_COBBLED_DEEPSLATE_PANEL = ModBlocks.register(
            "mossy_cobbled_deepslate_panel",
            PanelBlock::new,
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)
    );
    public static final Block SNOW_BRICK_PANEL = ModBlocks.register("snow_brick_panel", PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.SNOW)
    );
    public static final Block AZALEA_PANEL = registerPanel(AzaleaWoodInitializer.MOD_WOOD_NAME, AzaleaWoodInitializer.MOD_STRIPPED_COLOR, AzaleaWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block AZALEA_MOSAIC_PANEL = registerMosaicPanel(AzaleaWoodInitializer.MOD_WOOD_NAME, AzaleaWoodInitializer.MOD_STRIPPED_COLOR, AzaleaWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block BAOBAB_PANEL = registerPanel(BaobabWoodInitializer.MOD_WOOD_NAME, BaobabWoodInitializer.MOD_FIBER_COLOR, BaobabWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block CHOLLA_PANEL = registerPanel(ChollaWoodInitializer.MOD_WOOD_NAME, ChollaWoodInitializer.MOD_STRIPPED_COLOR, ChollaWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block CHOLLA_MOSAIC_PANEL = registerMosaicPanel(ChollaWoodInitializer.MOD_WOOD_NAME, ChollaWoodInitializer.MOD_STRIPPED_COLOR, ChollaWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block CHORUS_PANEL = registerPanel(ChorusWoodInitializer.MOD_WOOD_NAME, ChorusWoodInitializer.MOD_STRIPPED_COLOR, ChorusWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block CHORUS_MOSAIC_PANEL = registerMosaicPanel(ChorusWoodInitializer.MOD_WOOD_NAME, ChorusWoodInitializer.MOD_STRIPPED_COLOR, ChorusWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block CITRUS_PANEL = registerPanel(CitrusWoodInitializer.MOD_WOOD_NAME, CitrusWoodInitializer.MOD_FIBER_COLOR, CitrusWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block DOGWOOD_PANEL = registerPanel(DogwoodWoodInitializer.MOD_WOOD_NAME, DogwoodWoodInitializer.MOD_FIBER_COLOR, DogwoodWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block KAPOK_PANEL = registerPanel(KapokWoodInitializer.MOD_WOOD_NAME, KapokWoodInitializer.MOD_FIBER_COLOR, KapokWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block MAPLE_PANEL = registerPanel(MapleWoodInitializer.MOD_WOOD_NAME, MapleWoodInitializer.MOD_FIBER_COLOR, MapleWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block PINE_PANEL = registerPanel(PineWoodInitializer.MOD_WOOD_NAME, PineWoodInitializer.MOD_FIBER_COLOR, PineWoodInitializer.MOD_BLOCK_SOUND);
    public static final Block WILLOW_PANEL = registerPanel(WillowWoodInitializer.MOD_WOOD_NAME, WillowWoodInitializer.MOD_FIBER_COLOR, WillowWoodInitializer.MOD_BLOCK_SOUND);

    public static final Block PETRIFIED_PANEL = ModBlocks.register("petrified_panel", PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(PetrifiedWoodInitializer.MOD_FIBER_COLOR)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(PetrifiedWoodInitializer.MOD_BLOCK_SOUND)
    );

    public static Block registerPanel(String woodName, MapColor fiberColor, BlockSoundGroup blockSounds) {
        return ModBlocks.register(woodName + "_panel", PanelBlock::new, AbstractBlock.Settings.create().mapColor(fiberColor).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(blockSounds).burnable());
    }
    public static Block registerMosaicPanel(String woodName, MapColor fiberColor, BlockSoundGroup blockSounds) {
        return registerPanel(woodName + "_mosaic", fiberColor, blockSounds);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(ModBuildingBlocks.SMOOTH_DEEPSLATE_SLAB, CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL);
                    itemGroup.addAfter(ModBuildingBlocks.MOSSY_BRICK_SLAB, CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL);
                    itemGroup.addAfter(ModBuildingBlocks.MOSSY_TUFF_BRICK_SLAB, CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL);
                    itemGroup.addAfter(ModBuildingBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL);
                    itemGroup.addAfter(ModBuildingBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL);
                    itemGroup.addAfter(ModBuildingBlocks.SNOW_BRICK_SLAB, CombinedWorldgenModBlocks.SNOW_BRICK_PANEL);

                    itemGroup.addAfter(AzaleaWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.AZALEA_PANEL);
                    itemGroup.addAfter(AzaleaWoodModBlocks.MOD_MOSAIC_SLAB, CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL);
                    itemGroup.addAfter(BaobabWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.BAOBAB_PANEL);
                    itemGroup.addAfter(ChollaWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.CHOLLA_PANEL);
                    itemGroup.addAfter(ChollaWoodModBlocks.MOD_MOSAIC_SLAB, CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL);
                    itemGroup.addAfter(ChorusWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.CHORUS_PANEL);
                    itemGroup.addAfter(ChorusWoodModBlocks.MOD_MOSAIC_SLAB, CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL);
                    itemGroup.addAfter(CitrusWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.CITRUS_PANEL);
                    itemGroup.addAfter(DogwoodWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.DOGWOOD_PANEL);
                    itemGroup.addAfter(KapokWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.KAPOK_PANEL);
                    itemGroup.addAfter(MapleWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.MAPLE_PANEL);
                    itemGroup.addAfter(PineWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.PINE_PANEL);
                    itemGroup.addAfter(WillowWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.WILLOW_PANEL);
                    itemGroup.addAfter(PetrifiedWoodModBlocks.MOD_SLAB, CombinedWorldgenModBlocks.PETRIFIED_PANEL);
                });
    }
}
