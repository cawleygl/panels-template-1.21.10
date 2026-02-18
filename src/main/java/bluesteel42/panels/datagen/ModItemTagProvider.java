package bluesteel42.panels.datagen;

import bluesteel42.panels.block.CombinedWorldgenModBlocks;
import bluesteel42.panels.block.ModBlocks;
import bluesteel42.panels.block.NetherHyphaeModBlocks;
import bluesteel42.panels.block.OverworldHyphaeModBlocks;
import bluesteel42.panels.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.OAK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.SPRUCE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.BIRCH_PANEL.asItem());
//        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.JUNGLE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.ACACIA_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.DARK_OAK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.PALE_OAK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.CRIMSON_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.WARPED_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.MANGROVE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.BAMBOO_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(ModBlocks.CHERRY_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.PANELS).addTag(ModTags.Items.WOODEN_PANELS);
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.BAMBOO_MOSAIC_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.STONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.SMOOTH_STONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.STONE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.PURPUR_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.QUARTZ_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.RED_SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.COBBLESTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.NETHER_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.PETRIFIED_OAK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.PRISMARINE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.PRISMARINE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.DARK_PRISMARINE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_GRANITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.SMOOTH_RED_SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.MOSSY_STONE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_DIORITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.MOSSY_COBBLESTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.END_STONE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.SMOOTH_SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.SMOOTH_QUARTZ_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.GRANITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.ANDESITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.RED_NETHER_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_ANDESITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.DIORITE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.CUT_SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.CUT_RED_SANDSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.BLACKSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_BLACKSTONE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.COBBLED_DEEPSLATE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_DEEPSLATE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.DEEPSLATE_TILE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.DEEPSLATE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.WAXED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.OXIDIZED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.WEATHERED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.EXPOSED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.MUD_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.TUFF_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.POLISHED_TUFF_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.TUFF_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(ModBlocks.RESIN_BRICK_PANEL.asItem());

        valueLookupBuilder(ItemTags.NON_FLAMMABLE_WOOD).add(ModBlocks.CRIMSON_PANEL.asItem());
        valueLookupBuilder(ItemTags.NON_FLAMMABLE_WOOD).add(ModBlocks.WARPED_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.SNOW_BRICK_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.AZALEA_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.BAOBAB_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CACAO_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CHOLLA_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CHORUS_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.CITRUS_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.DOGWOOD_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.KAPOK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.MAPLE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.PINE_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).add(CombinedWorldgenModBlocks.WILLOW_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.PANELS).add(CombinedWorldgenModBlocks.PETRIFIED_PANEL.asItem());
        valueLookupBuilder(ItemTags.NON_FLAMMABLE_WOOD).add(CombinedWorldgenModBlocks.PETRIFIED_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.PANELS).add(NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.PANELS).add(NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL.asItem());

        valueLookupBuilder(ModTags.Items.MUSHROOM_PANELS)
                .add(OverworldHyphaeModBlocks.MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL.asItem())
                .add(OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL.asItem());
        valueLookupBuilder(ModTags.Items.WOODEN_PANELS).addTag(ModTags.Items.MUSHROOM_PANELS);
        valueLookupBuilder(ItemTags.NON_FLAMMABLE_WOOD).addTag(ModTags.Items.MUSHROOM_PANELS);

    }
}
