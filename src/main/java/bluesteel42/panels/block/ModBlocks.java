package bluesteel42.panels.block;

import bluesteel42.panels.Panels;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block RESIN_BRICK_PANEL = register(
            "resin_brick_panel",
            settings -> new PanelBlock(settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .sounds(BlockSoundGroup.RESIN_BRICKS)
                    .strength(1.5F, 6.0F)
    );
    public static final Block PRISMARINE_PANEL = register(
            "prismarine_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)
    );
    public static final Block PRISMARINE_BRICK_PANEL = register(
            "prismarine_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)
    );
    public static final Block DARK_PRISMARINE_PANEL = register(
            "dark_prismarine_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)
    );

    public static final Block OAK_PANEL = register(
            "oak_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
    );
    public static final Block SPRUCE_PANEL = register(
            "spruce_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
    );
    public static final Block BIRCH_PANEL = register(
            "birch_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
    );
//    public static final Block JUNGLE_PANEL = register(
//            "jungle_panel",
//            PanelBlock::new,
//            AbstractBlock.Settings.create()
//                    .mapColor(MapColor.DIRT_BROWN)
//                    .instrument(NoteBlockInstrument.BASS)
//                    .strength(2.0F, 3.0F)
//                    .sounds(BlockSoundGroup.WOOD)
//                    .burnable()
//    );
    public static final Block ACACIA_PANEL = register(
            "acacia_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
    );
    public static final Block CHERRY_PANEL = register(
            "cherry_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()
    );
    public static final Block DARK_OAK_PANEL = register(
            "dark_oak_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
    );
    public static final Block PALE_OAK_PANEL = register(
            "pale_oak_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(Blocks.PALE_OAK_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
    );
    public static final Block MANGROVE_PANEL = register(
            "mangrove_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
    );
    public static final Block BAMBOO_PANEL = register(
            "bamboo_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .burnable()
    );
    public static final Block BAMBOO_MOSAIC_PANEL = register(
            "bamboo_mosaic_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .burnable()
    );
    public static final Block STONE_PANEL = register(
            "stone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_STONE_PANEL = register(
            "smooth_stone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block SANDSTONE_PANEL = register(
            "sandstone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block CUT_SANDSTONE_PANEL = register(
            "cut_sandstone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block PETRIFIED_OAK_PANEL = register(
            "petrified_oak_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block COBBLESTONE_PANEL = register(
            "cobblestone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block BRICK_PANEL = register(
            "brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block STONE_BRICK_PANEL = register(
            "stone_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block MUD_BRICK_PANEL = register(
            "mud_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
    );
    public static final Block NETHER_BRICK_PANEL = register(
            "nether_brick_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
    );
    public static final Block QUARTZ_PANEL = register(
            "quartz_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block RED_SANDSTONE_PANEL = register(
            "red_sandstone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block CUT_RED_SANDSTONE_PANEL = register(
            "cut_red_sandstone_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block PURPUR_PANEL = register(
            "purpur_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)
    );
    public static final Block POLISHED_GRANITE_PANEL = register("polished_granite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_GRANITE));
    public static final Block SMOOTH_RED_SANDSTONE_PANEL = register(
            "smooth_red_sandstone_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.SMOOTH_RED_SANDSTONE)
    );
    public static final Block MOSSY_STONE_BRICK_PANEL = register("mossy_stone_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.MOSSY_STONE_BRICKS));
    public static final Block POLISHED_DIORITE_PANEL = register("polished_diorite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_DIORITE));
    public static final Block MOSSY_COBBLESTONE_PANEL = register("mossy_cobblestone_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.MOSSY_COBBLESTONE));
    public static final Block END_STONE_BRICK_PANEL = register("end_stone_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.END_STONE_BRICKS));
    public static final Block SMOOTH_SANDSTONE_PANEL = register("smooth_sandstone_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_QUARTZ_PANEL = register("smooth_quartz_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.SMOOTH_QUARTZ));
    public static final Block GRANITE_PANEL = register("granite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.GRANITE));
    public static final Block ANDESITE_PANEL = register("andesite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.ANDESITE));
    public static final Block RED_NETHER_BRICK_PANEL = register("red_nether_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.RED_NETHER_BRICKS));
    public static final Block POLISHED_ANDESITE_PANEL = register("polished_andesite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_ANDESITE));
    public static final Block DIORITE_PANEL = register("diorite_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.DIORITE));
    public static final Block CRIMSON_PANEL = register(
            "crimson_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
    );
    public static final Block WARPED_PANEL = register(
            "warped_panel",
            PanelBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
    );
    public static final Block BLACKSTONE_PANEL = register("blackstone_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.BLACKSTONE).strength(2.0F, 6.0F));
    public static final Block POLISHED_BLACKSTONE_BRICK_PANEL = register(
            "polished_blackstone_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_BLACKSTONE_BRICKS).strength(2.0F, 6.0F)
    );
    public static final Block POLISHED_BLACKSTONE_PANEL = register(
            "polished_blackstone_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_BLACKSTONE)
    );
    public static final Block TUFF_PANEL = register("tuff_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.TUFF));
    public static final Block POLISHED_TUFF_PANEL = register("polished_tuff_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_TUFF));
    public static final Block TUFF_BRICK_PANEL = register("tuff_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.TUFF_BRICKS));
    public static final Block OXIDIZED_CUT_COPPER_PANEL = register(
            "oxidized_cut_copper_panel",
            settings -> new OxidizablePanelBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)
    );
    public static final Block WEATHERED_CUT_COPPER_PANEL = register(
            "weathered_cut_copper_panel",
            settings -> new OxidizablePanelBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)
    );
    public static final Block EXPOSED_CUT_COPPER_PANEL = register(
            "exposed_cut_copper_panel", settings -> new OxidizablePanelBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)
    );
    public static final Block CUT_COPPER_PANEL = register(
            "cut_copper_panel", settings -> new OxidizablePanelBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER)
    );
    public static final Block WAXED_OXIDIZED_CUT_COPPER_PANEL = register(
            "waxed_oxidized_cut_copper_panel", PanelBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).requiresTool()
    );
    public static final Block WAXED_WEATHERED_CUT_COPPER_PANEL = register(
            "waxed_weathered_cut_copper_panel", PanelBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).requiresTool()
    );
    public static final Block WAXED_EXPOSED_CUT_COPPER_PANEL = register(
            "waxed_exposed_cut_copper_panel", PanelBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).requiresTool()
    );
    public static final Block WAXED_CUT_COPPER_PANEL = register(
            "waxed_cut_copper_panel", PanelBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER).requiresTool()
    );
    public static final Block COBBLED_DEEPSLATE_PANEL = register("cobbled_deepslate_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.COBBLED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_PANEL = register("polished_deepslate_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.POLISHED_DEEPSLATE));
    public static final Block DEEPSLATE_TILE_PANEL = register("deepslate_tile_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_BRICK_PANEL = register("deepslate_brick_panel", PanelBlock::new, AbstractBlock.Settings.copyShallow(Blocks.DEEPSLATE_BRICKS));


    public static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(id, factory, settings, true, false);
    }

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean registerItem, boolean nonOpaqueBlock) {
        final Identifier identifier = Identifier.of(Panels.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);

        if (registerItem) {
            Items.register(block);
        }

        if (nonOpaqueBlock) {
            BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        }

        return block;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.RESIN_BRICK_SLAB, ModBlocks.RESIN_BRICK_PANEL);
                    itemGroup.addAfter(Items.PRISMARINE_SLAB, ModBlocks.PRISMARINE_PANEL);
                    itemGroup.addAfter(Items.PRISMARINE_BRICK_SLAB, ModBlocks.PRISMARINE_BRICK_PANEL);
                    itemGroup.addAfter(Items.DARK_PRISMARINE_SLAB, ModBlocks.DARK_PRISMARINE_PANEL);
                    itemGroup.addAfter(Items.OAK_SLAB, ModBlocks.OAK_PANEL);
                    itemGroup.addAfter(Items.SPRUCE_SLAB, ModBlocks.SPRUCE_PANEL);
                    itemGroup.addAfter(Items.BIRCH_SLAB, ModBlocks.BIRCH_PANEL);
//                    itemGroup.addAfter(Items.JUNGLE_SLAB, ModBlocks.JUNGLE_PANEL);
                    itemGroup.addAfter(Items.ACACIA_SLAB, ModBlocks.ACACIA_PANEL);
                    itemGroup.addAfter(Items.CHERRY_SLAB, ModBlocks.CHERRY_PANEL);
                    itemGroup.addAfter(Items.DARK_OAK_SLAB, ModBlocks.DARK_OAK_PANEL);
                    itemGroup.addAfter(Items.PALE_OAK_SLAB, ModBlocks.PALE_OAK_PANEL);
                    itemGroup.addAfter(Items.MANGROVE_SLAB, ModBlocks.MANGROVE_PANEL);
                    itemGroup.addAfter(Items.BAMBOO_SLAB, ModBlocks.BAMBOO_PANEL);
                    itemGroup.addAfter(Items.BAMBOO_MOSAIC_SLAB, ModBlocks.BAMBOO_MOSAIC_PANEL);
                    itemGroup.addAfter(Items.STONE_SLAB, ModBlocks.STONE_PANEL);
                    itemGroup.addAfter(Items.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_PANEL);
                    itemGroup.addAfter(Items.SANDSTONE_SLAB, ModBlocks.SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.CUT_SANDSTONE_SLAB, ModBlocks.CUT_SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.COBBLESTONE_SLAB, ModBlocks.COBBLESTONE_PANEL);
                    itemGroup.addAfter(Items.BRICK_SLAB, ModBlocks.BRICK_PANEL);
                    itemGroup.addAfter(Items.STONE_BRICK_SLAB, ModBlocks.STONE_BRICK_PANEL);
                    itemGroup.addAfter(Items.MUD_BRICK_SLAB, ModBlocks.MUD_BRICK_PANEL);
                    itemGroup.addAfter(Items.NETHER_BRICK_SLAB, ModBlocks.NETHER_BRICK_PANEL);
                    itemGroup.addAfter(Items.QUARTZ_SLAB, ModBlocks.QUARTZ_PANEL);
                    itemGroup.addAfter(Items.RED_SANDSTONE_SLAB, ModBlocks.RED_SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.CUT_RED_SANDSTONE_SLAB, ModBlocks.CUT_RED_SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.PURPUR_SLAB, ModBlocks.PURPUR_PANEL);
                    itemGroup.addAfter(Items.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_PANEL);
                    itemGroup.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ModBlocks.SMOOTH_RED_SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.MOSSY_STONE_BRICK_SLAB, ModBlocks.MOSSY_STONE_BRICK_PANEL);
                    itemGroup.addAfter(Items.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_PANEL);
                    itemGroup.addAfter(Items.MOSSY_COBBLESTONE_SLAB, ModBlocks.MOSSY_COBBLESTONE_PANEL);
                    itemGroup.addAfter(Items.END_STONE_BRICK_SLAB, ModBlocks.END_STONE_BRICK_PANEL);
                    itemGroup.addAfter(Items.SMOOTH_SANDSTONE_SLAB, ModBlocks.SMOOTH_SANDSTONE_PANEL);
                    itemGroup.addAfter(Items.SMOOTH_QUARTZ_SLAB, ModBlocks.SMOOTH_QUARTZ_PANEL);
                    itemGroup.addAfter(Items.GRANITE_SLAB, ModBlocks.GRANITE_PANEL);
                    itemGroup.addAfter(Items.ANDESITE_SLAB, ModBlocks.ANDESITE_PANEL);
                    itemGroup.addAfter(Items.RED_NETHER_BRICK_SLAB, ModBlocks.RED_NETHER_BRICK_PANEL);
                    itemGroup.addAfter(Items.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_PANEL);
                    itemGroup.addAfter(Items.DIORITE_SLAB, ModBlocks.DIORITE_PANEL);
                    itemGroup.addAfter(Items.CRIMSON_SLAB, ModBlocks.CRIMSON_PANEL);
                    itemGroup.addAfter(Items.WARPED_SLAB, ModBlocks.WARPED_PANEL);
                    itemGroup.addAfter(Items.BLACKSTONE_SLAB, ModBlocks.BLACKSTONE_PANEL);
                    itemGroup.addAfter(Items.POLISHED_BLACKSTONE_BRICK_SLAB, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL);
                    itemGroup.addAfter(Items.POLISHED_BLACKSTONE_SLAB, ModBlocks.POLISHED_BLACKSTONE_PANEL);
                    itemGroup.addAfter(Items.TUFF_SLAB, ModBlocks.TUFF_PANEL);
                    itemGroup.addAfter(Items.POLISHED_TUFF_SLAB, ModBlocks.POLISHED_TUFF_PANEL);
                    itemGroup.addAfter(Items.TUFF_BRICK_SLAB, ModBlocks.TUFF_BRICK_PANEL);
                    itemGroup.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.CUT_COPPER_SLAB, ModBlocks.CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_CUT_COPPER_PANEL);
                    itemGroup.addAfter(Items.COBBLED_DEEPSLATE_SLAB, ModBlocks.COBBLED_DEEPSLATE_PANEL);
                    itemGroup.addAfter(Items.POLISHED_DEEPSLATE_SLAB, ModBlocks.POLISHED_DEEPSLATE_PANEL);
                    itemGroup.addAfter(Items.DEEPSLATE_TILE_SLAB, ModBlocks.DEEPSLATE_TILE_PANEL);
                    itemGroup.addAfter(Items.DEEPSLATE_BRICK_SLAB, ModBlocks.DEEPSLATE_BRICK_PANEL);
                });
    }
}
