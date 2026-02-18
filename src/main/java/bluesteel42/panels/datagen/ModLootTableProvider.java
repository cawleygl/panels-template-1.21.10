package bluesteel42.panels.datagen;

import bluesteel42.panels.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public LootTable.Builder panelDrops(Block drop) {
        return LootTable.builder()
                .pool(
                        LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(
                                        (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                                                drop,
                                                ItemEntry.builder(drop)
                                                        .apply(
                                                                SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                                                                        .conditionally(BlockStatePropertyLootCondition.builder(drop).properties(StatePredicate.Builder.create().exactMatch(PanelBlock.TYPE, PanelType.DOUBLE_X)))
                                                                        .conditionally(BlockStatePropertyLootCondition.builder(drop).properties(StatePredicate.Builder.create().exactMatch(PanelBlock.TYPE, PanelType.DOUBLE_Z)))
                                                        )
                                        )
                                )
                );
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_PANEL, this::panelDrops);
        addDrop(ModBlocks.SPRUCE_PANEL, this::panelDrops);
        addDrop(ModBlocks.BIRCH_PANEL, this::panelDrops);
//        addDrop(ModBlocks.JUNGLE_PANEL, this::panelDrops);
        addDrop(ModBlocks.ACACIA_PANEL, this::panelDrops);
        addDrop(ModBlocks.DARK_OAK_PANEL, this::panelDrops);
        addDrop(ModBlocks.PALE_OAK_PANEL, this::panelDrops);
        addDrop(ModBlocks.CRIMSON_PANEL, this::panelDrops);
        addDrop(ModBlocks.WARPED_PANEL, this::panelDrops);
        addDrop(ModBlocks.MANGROVE_PANEL, this::panelDrops);
        addDrop(ModBlocks.BAMBOO_PANEL, this::panelDrops);
        addDrop(ModBlocks.CHERRY_PANEL, this::panelDrops);
        addDrop(ModBlocks.BAMBOO_MOSAIC_PANEL, this::panelDrops);
        addDrop(ModBlocks.STONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.SMOOTH_STONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.STONE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.PURPUR_PANEL, this::panelDrops);
        addDrop(ModBlocks.QUARTZ_PANEL, this::panelDrops);
        addDrop(ModBlocks.RED_SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.COBBLESTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.NETHER_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.PETRIFIED_OAK_PANEL, this::panelDrops);
        addDrop(ModBlocks.PRISMARINE_PANEL, this::panelDrops);
        addDrop(ModBlocks.PRISMARINE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.DARK_PRISMARINE_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_GRANITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.MOSSY_STONE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_DIORITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.END_STONE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.SMOOTH_QUARTZ_PANEL, this::panelDrops);
        addDrop(ModBlocks.GRANITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.ANDESITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.RED_NETHER_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_ANDESITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.DIORITE_PANEL, this::panelDrops);
        addDrop(ModBlocks.CUT_SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.BLACKSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_PANEL, this::panelDrops);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PANEL, this::panelDrops);
        addDrop(ModBlocks.DEEPSLATE_TILE_PANEL, this::panelDrops);
        addDrop(ModBlocks.DEEPSLATE_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.WAXED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL, this::panelDrops);
        addDrop(ModBlocks.MUD_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.TUFF_PANEL, this::panelDrops);
        addDrop(ModBlocks.POLISHED_TUFF_PANEL, this::panelDrops);
        addDrop(ModBlocks.TUFF_BRICK_PANEL, this::panelDrops);
        addDrop(ModBlocks.RESIN_BRICK_PANEL, this::panelDrops);

        addDrop(CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.SNOW_BRICK_PANEL, this::panelDrops);

        addDrop(CombinedWorldgenModBlocks.AZALEA_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.BAOBAB_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CACAO_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CHOLLA_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CHORUS_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.CITRUS_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.DOGWOOD_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.KAPOK_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.MAPLE_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.PINE_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.WILLOW_PANEL, this::panelDrops);
        addDrop(CombinedWorldgenModBlocks.PETRIFIED_PANEL, this::panelDrops);

        addDrop(NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL, this::panelDrops);
        addDrop(NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL, this::panelDrops);
        addDrop(NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL, this::panelDrops);

        addDrop(OverworldHyphaeModBlocks.MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL, this::panelDrops);
        addDrop(OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL, this::panelDrops);

    }
}
