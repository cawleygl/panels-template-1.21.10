package bluesteel42.panels.datagen;

import bluesteel42.combinedworldgen.block.building.ModBuildingBlocks;
import bluesteel42.panels.block.CombinedWorldgenModBlocks;
import bluesteel42.panels.block.ModBlocks;
import bluesteel42.panels.block.NetherHyphaeModBlocks;
import bluesteel42.panels.block.OverworldHyphaeModBlocks;
import bluesteel42.panels.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.OAK_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.SPRUCE_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.BIRCH_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.JUNGLE_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.ACACIA_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.DARK_OAK_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.PALE_OAK_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.CRIMSON_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.WARPED_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.MANGROVE_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.BAMBOO_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(ModBlocks.CHERRY_PANEL);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).addTag(ModTags.Blocks.WOODEN_PANELS);

        valueLookupBuilder(ModTags.Blocks.PANELS).addTag(ModTags.Blocks.WOODEN_PANELS);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.BAMBOO_MOSAIC_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.STONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.SMOOTH_STONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.STONE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.PURPUR_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.QUARTZ_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.RED_SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.COBBLESTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.NETHER_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.PETRIFIED_OAK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.PRISMARINE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.PRISMARINE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.DARK_PRISMARINE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_GRANITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.SMOOTH_RED_SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.MOSSY_STONE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_DIORITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.MOSSY_COBBLESTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.END_STONE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.SMOOTH_SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.SMOOTH_QUARTZ_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.GRANITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.ANDESITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.RED_NETHER_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_ANDESITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.DIORITE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.CUT_SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.CUT_RED_SANDSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.BLACKSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_BLACKSTONE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.COBBLED_DEEPSLATE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_DEEPSLATE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.DEEPSLATE_TILE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.DEEPSLATE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.WAXED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.MUD_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.TUFF_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.POLISHED_TUFF_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.TUFF_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(ModBlocks.RESIN_BRICK_PANEL);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.PRISMARINE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.PRISMARINE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DARK_PRISMARINE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.STONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.SMOOTH_STONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.CUT_SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.PETRIFIED_OAK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.COBBLESTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.STONE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.NETHER_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.QUARTZ_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.RED_SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.CUT_RED_SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.PURPUR_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_GRANITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.SMOOTH_RED_SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.MOSSY_STONE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_DIORITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.MOSSY_COBBLESTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.END_STONE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.SMOOTH_SANDSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.SMOOTH_QUARTZ_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.GRANITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.ANDESITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.RED_NETHER_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_ANDESITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DIORITE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.BLACKSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_BLACKSTONE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.WAXED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.COBBLED_DEEPSLATE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_DEEPSLATE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DEEPSLATE_TILE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DEEPSLATE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.MUD_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.TUFF_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POLISHED_TUFF_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.TUFF_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.RESIN_BRICK_PANEL);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.WAXED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);

        valueLookupBuilder(BlockTags.ANCIENT_CITY_REPLACEABLE).add(ModBlocks.DEEPSLATE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.ANCIENT_CITY_REPLACEABLE).add(ModBlocks.DEEPSLATE_TILE_PANEL);

        valueLookupBuilder(BlockTags.AXE_MINEABLE).addTag(ModTags.Blocks.WOODEN_PANELS);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).add(ModBlocks.BAMBOO_MOSAIC_PANEL);

        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.SNOW_BRICK_PANEL);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.SNOW_BRICK_PANEL);

        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.AZALEA_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.BAOBAB_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CHOLLA_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CHORUS_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CITRUS_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.DOGWOOD_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.KAPOK_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.MAPLE_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.PINE_PANEL);
        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS).add(CombinedWorldgenModBlocks.WILLOW_PANEL);

        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).add(CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).add(CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).add(CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL);

        valueLookupBuilder(ModTags.Blocks.PANELS).add(CombinedWorldgenModBlocks.PETRIFIED_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(CombinedWorldgenModBlocks.PETRIFIED_PANEL);

        valueLookupBuilder(ModTags.Blocks.PANELS).add(NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL);
        valueLookupBuilder(ModTags.Blocks.PANELS).add(NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL);

        valueLookupBuilder(ModTags.Blocks.WOODEN_PANELS)
                .add(OverworldHyphaeModBlocks.MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL)
                .add(OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL);

    }
}
