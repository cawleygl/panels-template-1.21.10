package bluesteel42.panels.datagen;

import bluesteel42.combinedworldgen.block.building.ModBuildingBlocks;
import bluesteel42.combinedworldgen.wood.azalea.block.AzaleaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.baobab.block.BaobabWoodModBlocks;
import bluesteel42.combinedworldgen.wood.cholla.block.ChollaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.chorus.block.ChorusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.citrus.block.CitrusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.dogwood.block.DogwoodWoodModBlocks;
import bluesteel42.combinedworldgen.wood.kapok.block.KapokWoodModBlocks;
import bluesteel42.combinedworldgen.wood.maple.block.MapleWoodModBlocks;
import bluesteel42.combinedworldgen.wood.petrified.block.PetrifiedWoodModBlocks;
import bluesteel42.combinedworldgen.wood.pine.block.PineWoodModBlocks;
import bluesteel42.combinedworldgen.wood.willow.block.WillowWoodModBlocks;
import bluesteel42.overworldhyphae.item.ModItems;
import bluesteel42.panels.Panels;
import bluesteel42.panels.block.CombinedWorldgenModBlocks;
import bluesteel42.panels.block.ModBlocks;
import bluesteel42.panels.block.NetherHyphaeModBlocks;
import bluesteel42.panels.block.OverworldHyphaeModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            private void offerWoodenPanelRecipes(ItemConvertible input, ItemConvertible output) {
                offerPanelRecipe("wooden_panel", output, input);
            }
            private void offerStonePanelRecipes(ItemConvertible input, ItemConvertible output) {
                offerPanelRecipe("", output, input);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input, 2);
            }

            private void offerPanelRecipe(String group, ItemConvertible output, ItemConvertible input) {
                createPanelRecipe(group, output, Ingredient.ofItem(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            private CraftingRecipeJsonBuilder createPanelRecipe(String group, ItemConvertible output, Ingredient input) {
                return createShaped(RecipeCategory.BUILDING_BLOCKS, output, 6).group(group).input('#', input).pattern("#").pattern("#").pattern("#");
            }


            @Override
            public void generate() {
                offerWoodenPanelRecipes(Blocks.OAK_PLANKS, ModBlocks.OAK_PANEL);
                offerWoodenPanelRecipes(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PANEL);
                offerWoodenPanelRecipes(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PANEL);
                offerWoodenPanelRecipes(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PANEL);
                offerWoodenPanelRecipes(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PANEL);
                offerWoodenPanelRecipes(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PANEL);
                offerWoodenPanelRecipes(Blocks.PALE_OAK_PLANKS, ModBlocks.PALE_OAK_PANEL);
                offerWoodenPanelRecipes(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_PANEL);
                offerWoodenPanelRecipes(Blocks.WARPED_PLANKS, ModBlocks.WARPED_PANEL);
                offerWoodenPanelRecipes(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PANEL);
                offerWoodenPanelRecipes(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_PANEL);
                offerWoodenPanelRecipes(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PANEL);
                offerWoodenPanelRecipes(Blocks.BAMBOO_MOSAIC, ModBlocks.BAMBOO_MOSAIC_PANEL);

                offerStonePanelRecipes(Blocks.STONE, ModBlocks.STONE_PANEL);
                offerStonePanelRecipes(Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_PANEL);
                offerStonePanelRecipes(Blocks.SANDSTONE, ModBlocks.SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_PANEL);
                offerStonePanelRecipes(Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_PANEL);
                offerStonePanelRecipes(Blocks.RED_SANDSTONE, ModBlocks.RED_SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.BRICKS, ModBlocks.BRICK_PANEL);
                offerStonePanelRecipes(Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_PANEL);
                offerStonePanelRecipes(Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.OAK_PLANKS, ModBlocks.PETRIFIED_OAK_PANEL);
                offerStonePanelRecipes(Blocks.PRISMARINE, ModBlocks.PRISMARINE_PANEL);
                offerStonePanelRecipes(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_PANEL);
                offerStonePanelRecipes(Blocks.SMOOTH_RED_SANDSTONE, ModBlocks.SMOOTH_RED_SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_PANEL);
                offerStonePanelRecipes(Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_PANEL);
                offerStonePanelRecipes(Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.SMOOTH_SANDSTONE, ModBlocks.SMOOTH_SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_PANEL);
                offerStonePanelRecipes(Blocks.GRANITE, ModBlocks.GRANITE_PANEL);
                offerStonePanelRecipes(Blocks.ANDESITE, ModBlocks.ANDESITE_PANEL);
                offerStonePanelRecipes(Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_PANEL);
                offerStonePanelRecipes(Blocks.DIORITE, ModBlocks.DIORITE_PANEL);
                offerStonePanelRecipes(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_PANEL);
                offerStonePanelRecipes(Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PANEL);
                offerStonePanelRecipes(Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_PANEL);
                offerStonePanelRecipes(Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_PANEL);
                offerStonePanelRecipes(Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PANEL);
                offerStonePanelRecipes(Blocks.MUD_BRICKS, ModBlocks.MUD_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.TUFF, ModBlocks.TUFF_PANEL);
                offerStonePanelRecipes(Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_PANEL);
                offerStonePanelRecipes(Blocks.TUFF_BRICKS, ModBlocks.TUFF_BRICK_PANEL);
                offerStonePanelRecipes(Blocks.RESIN_BRICKS, ModBlocks.RESIN_BRICK_PANEL);

                offerStonePanelRecipes(ModBuildingBlocks.SMOOTH_DEEPSLATE, CombinedWorldgenModBlocks.SMOOTH_DEEPSLATE_PANEL);
                offerStonePanelRecipes(ModBuildingBlocks.MOSSY_BRICKS, CombinedWorldgenModBlocks.MOSSY_BRICK_PANEL);
                offerStonePanelRecipes(ModBuildingBlocks.MOSSY_TUFF_BRICKS, CombinedWorldgenModBlocks.MOSSY_TUFF_BRICK_PANEL);
                offerStonePanelRecipes(ModBuildingBlocks.MOSSY_DEEPSLATE_BRICKS, CombinedWorldgenModBlocks.MOSSY_DEEPSLATE_BRICK_PANEL);
                offerStonePanelRecipes(ModBuildingBlocks.MOSSY_COBBLED_DEEPSLATE, CombinedWorldgenModBlocks.MOSSY_COBBLED_DEEPSLATE_PANEL);
                offerStonePanelRecipes(ModBuildingBlocks.SNOW_BRICKS, CombinedWorldgenModBlocks.SNOW_BRICK_PANEL);

                offerWoodenPanelRecipes(AzaleaWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.AZALEA_PANEL);
                offerWoodenPanelRecipes(AzaleaWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.AZALEA_MOSAIC_PANEL);
                offerWoodenPanelRecipes(BaobabWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.BAOBAB_PANEL);
                offerWoodenPanelRecipes(ChollaWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CHOLLA_PANEL);
                offerWoodenPanelRecipes(ChollaWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.CHOLLA_MOSAIC_PANEL);
                offerWoodenPanelRecipes(ChorusWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CHORUS_PANEL);
                offerWoodenPanelRecipes(ChorusWoodModBlocks.MOD_MOSAIC, CombinedWorldgenModBlocks.CHORUS_MOSAIC_PANEL);
                offerWoodenPanelRecipes(CitrusWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.CITRUS_PANEL);
                offerWoodenPanelRecipes(DogwoodWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.DOGWOOD_PANEL);
                offerWoodenPanelRecipes(KapokWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.KAPOK_PANEL);
                offerWoodenPanelRecipes(MapleWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.MAPLE_PANEL);
                offerWoodenPanelRecipes(PineWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.PINE_PANEL);
                offerWoodenPanelRecipes(WillowWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.WILLOW_PANEL);
                offerStonePanelRecipes(PetrifiedWoodModBlocks.MOD_PLANKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL, PetrifiedWoodModBlocks.MOD_LOG, 8);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL, PetrifiedWoodModBlocks.MOD_WOOD, 8);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL, PetrifiedWoodModBlocks.STRIPPED_MOD_LOG, 8);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CombinedWorldgenModBlocks.PETRIFIED_PANEL, PetrifiedWoodModBlocks.STRIPPED_MOD_WOOD, 8);

                offerStonePanelRecipes(bluesteel42.netherhyphae.block.ModBlocks.BLUE_NETHER_BRICKS, NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL);
                offerStonePanelRecipes(bluesteel42.netherhyphae.block.ModBlocks.BLACK_NETHER_BRICKS, NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL);
                offerStonePanelRecipes(bluesteel42.netherhyphae.block.ModBlocks.GLOW_NETHER_BRICKS, NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL);

                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.MUSHROOM_PLANKS, OverworldHyphaeModBlocks.MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.WHITE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.GRAY_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.BLACK_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.BROWN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.RED_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.ORANGE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.YELLOW_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.LIME_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.GREEN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.CYAN_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.BLUE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.PURPLE_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.MAGENTA_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL);
                offerWoodenPanelRecipes(bluesteel42.overworldhyphae.block.ModBlocks.PINK_MUSHROOM_PLANKS, OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL);

                List<Item> dyes = Arrays.asList(Items.WHITE_DYE, Items.LIGHT_GRAY_DYE, Items.GRAY_DYE, Items.BLACK_DYE, Items.BROWN_DYE, Items.RED_DYE, Items.ORANGE_DYE, Items.YELLOW_DYE, Items.LIME_DYE, Items.GREEN_DYE, Items.CYAN_DYE, Items.LIGHT_BLUE_DYE, Items.BLUE_DYE, Items.PURPLE_DYE, Items.MAGENTA_DYE, Items.PINK_DYE);
                offerDyeablesRecipes(dyes, OverworldHyphaeModBlocks.DYED_PANELS, OverworldHyphaeModBlocks.MUSHROOM_PANEL.asItem(), "mushroom_panel", RecipeCategory.BUILDING_BLOCKS);

            }
        };
    }

    @Override
    public String getName() {
        return Panels.MOD_ID + " recipes";
    }
}
