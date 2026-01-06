package bluesteel42.panels.registries;

import bluesteel42.overworldhyphae.OverworldHyphae;
import bluesteel42.overworldhyphae.item.ModItems;
import bluesteel42.overworldhyphae.util.ModStats;
import bluesteel42.panels.block.ModBlocks;
import bluesteel42.panels.block.OverworldHyphaeModBlocks;
import bluesteel42.panels.util.ModTags;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeveledCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ModRegistries {
    public static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModTags.Blocks.WOODEN_PANELS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_MOSAIC_PANEL, 20, 5);
    }
    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModTags.Items.WOODEN_PANELS, 150);
            builder.add(ModBlocks.BAMBOO_MOSAIC_PANEL, 150);
        });
    }
    private static final float compostChance = 0.65F;
    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.WHITE_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.LIGHT_GRAY_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.GRAY_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.BLACK_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.BROWN_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.RED_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.ORANGE_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.YELLOW_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.LIME_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.GREEN_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.CYAN_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.LIGHT_BLUE_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.BLUE_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.PURPLE_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.MAGENTA_MUSHROOM_PANEL, compostChance);
        CompostingChanceRegistry.INSTANCE.add(OverworldHyphaeModBlocks.PINK_MUSHROOM_PANEL, compostChance);
    }

    private static ActionResult cleanMushroomBlock(ItemConvertible cleanState, TagKey<Item> blockTag, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, ItemStack stack) {
        if (!stack.isIn(blockTag)) {
            return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
        } else {
            if (!world.isClient()) {
                ItemStack itemStack = stack.copyComponentsToNewStack(cleanState, 1);
                player.setStackInHand(hand, ItemUsage.exchangeStack(stack, player, itemStack, false));
                player.incrementStat(ModStats.CLEAN_DYED_MUSHROOM_BLOCK);
                LeveledCauldronBlock.decrementFluidLevel(state, world, pos);
            }

            return ActionResult.SUCCESS;
        }
    }

    private static void registerMushroomBlockWash(List<Item> blockList, ItemConvertible washedBlock, TagKey<Item> blockTag) {
        for (Item item : blockList) {
            CauldronBehavior.WATER_CAULDRON_BEHAVIOR.map().put(item, (state, world, pos, player, hand, stack) -> cleanMushroomBlock(washedBlock, blockTag, state, world, pos, player, hand, stack));
        }
    }

    public static void registerCauldronBehavior() {
        registerMushroomBlockWash(OverworldHyphaeModBlocks.DYED_PANELS, OverworldHyphaeModBlocks.MUSHROOM_PANEL, ModTags.Items.MUSHROOM_PANELS);
    }

}
