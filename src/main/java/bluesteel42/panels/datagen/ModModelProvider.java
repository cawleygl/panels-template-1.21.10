package bluesteel42.panels.datagen;

import bluesteel42.combinedworldgen.CombinedWorldgen;
import bluesteel42.combinedworldgen.block.building.ModBuildingBlocks;
import bluesteel42.combinedworldgen.wood.azalea.block.AzaleaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.baobab.block.BaobabWoodModBlocks;
import bluesteel42.combinedworldgen.wood.cacao.block.CacaoWoodModBlocks;
import bluesteel42.combinedworldgen.wood.cholla.block.ChollaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.chorus.block.ChorusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.citrus.block.CitrusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.dogwood.block.DogwoodWoodModBlocks;
import bluesteel42.combinedworldgen.wood.kapok.block.KapokWoodModBlocks;
import bluesteel42.combinedworldgen.wood.maple.block.MapleWoodModBlocks;
import bluesteel42.combinedworldgen.wood.petrified.block.PetrifiedWoodModBlocks;
import bluesteel42.combinedworldgen.wood.pine.block.PineWoodModBlocks;
import bluesteel42.combinedworldgen.wood.willow.block.WillowWoodModBlocks;
import bluesteel42.panels.Panels;
import bluesteel42.panels.block.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.minecraft.client.data.TextureMap.getId;
import static net.minecraft.client.data.TextureMap.getSubId;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static BlockModelDefinitionCreator createPanelBlockState(
            Block slabBlock, WeightedVariant northModel, WeightedVariant southModel, WeightedVariant eastModel, WeightedVariant westModel, WeightedVariant doubleModelX,  WeightedVariant doubleModelZ
    ) {
        return VariantsBlockModelDefinitionCreator.of(slabBlock)
                .with(
                        BlockStateVariantMap.models(ModProperties.PANEL_TYPE)
                                .register(PanelType.SINGLE_NORTH, northModel)
                                .register(PanelType.SINGLE_SOUTH, southModel)
                                .register(PanelType.SINGLE_EAST, eastModel)
                                .register(PanelType.SINGLE_WEST, westModel)
                                .register(PanelType.DOUBLE_X, doubleModelX)
                                .register(PanelType.DOUBLE_Z, doubleModelZ)
                );
    }

    private static final Model CONSISTENT_PANEL_NORTH = panelsBlock("template_consistent_panel_north", "_north", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model CONSISTENT_PANEL_SOUTH = panelsBlock("template_consistent_panel_south", "_south", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model CONSISTENT_PANEL_EAST = panelsBlock("template_consistent_panel_east", "_east", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model CONSISTENT_PANEL_WEST = panelsBlock("template_consistent_panel_west", "_west", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model CONSISTENT_PANEL_INVENTORY = panelsBlock("template_consistent_panel_inventory", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);

    private void registerConsistentPanel(BlockStateModelGenerator blockStateModelGenerator, Block originBlock, Block panelBlock) {
        WeightedVariant weightedVariantDouble = BlockStateModelGenerator.createWeightedVariant(ModelIds.getBlockModelId(originBlock));
        TextureMap textureMap = TextureMap.all(originBlock);
        WeightedVariant weightedVariantNorth = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_NORTH.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantSouth = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_SOUTH.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantEast = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_EAST.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantWest = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_WEST.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.blockStateCollector.accept(createPanelBlockState(panelBlock, weightedVariantNorth, weightedVariantSouth, weightedVariantEast, weightedVariantWest, weightedVariantDouble, weightedVariantDouble));
        Identifier identifier = CONSISTENT_PANEL_INVENTORY.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(panelBlock, identifier);
    }

    private void registerCustomConsistentPanel(BlockStateModelGenerator blockStateModelGenerator, Block originBlock, Block panelBlock, TextureMap textureMap) {
        WeightedVariant weightedVariantDouble = BlockStateModelGenerator.createWeightedVariant(ModelIds.getBlockModelId(originBlock));
        WeightedVariant weightedVariantNorth = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_NORTH.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantSouth = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_SOUTH.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantEast = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_EAST.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantWest = BlockStateModelGenerator.createWeightedVariant(CONSISTENT_PANEL_WEST.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.blockStateCollector.accept(createPanelBlockState(panelBlock, weightedVariantNorth, weightedVariantSouth, weightedVariantEast, weightedVariantWest, weightedVariantDouble, weightedVariantDouble));
        Identifier identifier = CONSISTENT_PANEL_INVENTORY.upload(panelBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(panelBlock, identifier);
    }

    private static final Model UNIQUE_PANEL_NORTH = panelsBlock("template_unique_panel_north", "_north", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model UNIQUE_PANEL_SOUTH = panelsBlock("template_unique_panel_south", "_south", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model UNIQUE_PANEL_EAST = panelsBlock("template_unique_panel_east", "_east", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model UNIQUE_PANEL_WEST = panelsBlock("template_unique_panel_west", "_west", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);
    private static final Model UNIQUE_PANEL_DOUBLE = vanillaBlock("cube_column_horizontal", TextureKey.END, TextureKey.SIDE);
    private static final Model UNIQUE_PANEL_INVENTORY = panelsBlock("template_unique_panel_inventory", TextureKey.FRONT, TextureKey.BACK, TextureKey.SIDE);

    private void registerUniquePanel(BlockStateModelGenerator blockStateModelGenerator, Block originBlock, Block slabBlock, Block panelBlock) {
        TextureMap textureMap = TextureMap.all(originBlock);
        TextureMap textureMapDouble = TextureMap.sideEnd(getSubId(slabBlock, "_side"), textureMap.getTexture(TextureKey.TOP));
        TextureMap textureMapPanel = new TextureMap()
                .put(TextureKey.SIDE, getSubId(slabBlock, "_side"))
                .put(TextureKey.FRONT, getId(originBlock))
                .put(TextureKey.BACK, getId(originBlock));
        WeightedVariant weightedVariantDouble = BlockStateModelGenerator.createWeightedVariant(UNIQUE_PANEL_DOUBLE.upload(panelBlock, "_double", textureMapDouble, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantNorth = BlockStateModelGenerator.createWeightedVariant(UNIQUE_PANEL_NORTH.upload(panelBlock, textureMapPanel, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantSouth = BlockStateModelGenerator.createWeightedVariant(UNIQUE_PANEL_SOUTH.upload(panelBlock, textureMapPanel, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantEast = BlockStateModelGenerator.createWeightedVariant(UNIQUE_PANEL_EAST.upload(panelBlock, textureMapPanel, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariantWest = BlockStateModelGenerator.createWeightedVariant(UNIQUE_PANEL_WEST.upload(panelBlock, textureMapPanel, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.blockStateCollector.accept(createPanelBlockState(panelBlock, weightedVariantNorth, weightedVariantSouth, weightedVariantEast, weightedVariantWest, weightedVariantDouble.apply(BlockStateModelGenerator.ROTATE_X_90).apply(BlockStateModelGenerator.ROTATE_Y_90), weightedVariantDouble.apply(BlockStateModelGenerator.ROTATE_X_90)));
        Identifier identifier = UNIQUE_PANEL_INVENTORY.upload(panelBlock, textureMapPanel, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(panelBlock, identifier);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerConsistentPanel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.OAK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PANEL);
//        registerConsistentPanel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.PALE_OAK_PLANKS, ModBlocks.PALE_OAK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.WARPED_PLANKS, ModBlocks.WARPED_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.BAMBOO_MOSAIC, ModBlocks.BAMBOO_MOSAIC_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.STONE, ModBlocks.STONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.SANDSTONE, ModBlocks.SANDSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.RED_SANDSTONE, ModBlocks.RED_SANDSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.BRICKS, ModBlocks.BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.PETRIFIED_OAK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.PRISMARINE, ModBlocks.PRISMARINE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.GRANITE, ModBlocks.GRANITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.ANDESITE, ModBlocks.ANDESITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.DIORITE, ModBlocks.DIORITE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.MUD_BRICKS, ModBlocks.MUD_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.TUFF, ModBlocks.TUFF_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.TUFF_BRICKS, ModBlocks.TUFF_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, Blocks.RESIN_BRICKS, ModBlocks.RESIN_BRICK_PANEL);

        registerUniquePanel(blockStateModelGenerator, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_PANEL);

        registerCustomConsistentPanel(blockStateModelGenerator, Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_PANEL, new TextureMap().put(TextureKey.BACK, TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_side")).put(TextureKey.FRONT, TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_top")));
        registerCustomConsistentPanel(blockStateModelGenerator, Blocks.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_PANEL, TextureMap.all(getSubId(Blocks.QUARTZ_BLOCK, "_bottom")));
        registerCustomConsistentPanel(blockStateModelGenerator, Blocks.SMOOTH_SANDSTONE, ModBlocks.SMOOTH_SANDSTONE_PANEL, TextureMap.all(getSubId(Blocks.SANDSTONE, "_top")));
        registerCustomConsistentPanel(blockStateModelGenerator, Blocks.SMOOTH_RED_SANDSTONE, ModBlocks.SMOOTH_RED_SANDSTONE_PANEL, TextureMap.all(getSubId(Blocks.RED_SANDSTONE, "_top")));

        registerUniquePanel(blockStateModelGenerator, ModBuildingBlocks.SMOOTH_DEEPSLATE, ModBuildingBlocks.SMOOTH_DEEPSLATE_SLAB, CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ModBuildingBlocks.MOSSY_BRICKS, CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ModBuildingBlocks.MOSSY_TUFF_BRICKS, CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ModBuildingBlocks.MOSSY_DEEPSLATE_BRICKS, CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ModBuildingBlocks.MOSSY_COBBLED_DEEPSLATE, CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ModBuildingBlocks.SNOW_BRICKS, CombinedWorldgenModBlocks.SNOW_BRICK_PANEL);

        registerConsistentPanel(blockStateModelGenerator, AzaleaWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.AZALEA_PANEL);
        registerConsistentPanel(blockStateModelGenerator, AzaleaWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL);
        registerConsistentPanel(blockStateModelGenerator, BaobabWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.BAOBAB_PANEL);
        registerConsistentPanel(blockStateModelGenerator, CacaoWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CACAO_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ChollaWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CHOLLA_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ChollaWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ChorusWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CHORUS_PANEL);
        registerConsistentPanel(blockStateModelGenerator, ChorusWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL);
        registerConsistentPanel(blockStateModelGenerator, CitrusWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CITRUS_PANEL);
        registerConsistentPanel(blockStateModelGenerator, DogwoodWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.DOGWOOD_PANEL);
        registerConsistentPanel(blockStateModelGenerator, KapokWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.KAPOK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, MapleWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.MAPLE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, PineWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.PINE_PANEL);
        registerConsistentPanel(blockStateModelGenerator, WillowWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.WILLOW_PANEL);
        registerConsistentPanel(blockStateModelGenerator, PetrifiedWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL);

        registerConsistentPanel(blockStateModelGenerator, bluesteel42.netherhyphae.block.ModBlocks.BLUE_NETHER_BRICKS, NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.netherhyphae.block.ModBlocks.BLACK_NETHER_BRICKS, NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.netherhyphae.block.ModBlocks.GLOW_NETHER_BRICKS, NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL);

        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.MUSHROOM_PLANKS, OverworldHyphaeModBlocks.MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.WHITE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.GRAY_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.BLACK_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.BROWN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.RED_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.ORANGE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.YELLOW_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.LIME_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.GREEN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.CYAN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.BLUE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.PURPLE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.MAGENTA_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL);
        registerConsistentPanel(blockStateModelGenerator, bluesteel42.overworldhyphae.block.ModBlocks.PINK_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}

    private static Model panelsBlock(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Panels.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
    private static Model panelsBlock(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Panels.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
    private static Model vanillaBlock(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.ofVanilla("block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
