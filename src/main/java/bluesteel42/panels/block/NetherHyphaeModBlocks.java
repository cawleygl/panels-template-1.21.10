package bluesteel42.panels.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;

import static bluesteel42.netherhyphae.block.ModBlocks.*;

public class NetherHyphaeModBlocks {
    public static final Block BLUE_NETHER_BRICK_PANEL = ModBlocks.register("blue_nether_brick_panel", PanelBlock::new, AbstractBlock.Settings.copy(BLUE_NETHER_BRICKS));
    public static final Block BLACK_NETHER_BRICK_PANEL = ModBlocks.register("black_nether_brick_panel", PanelBlock::new, AbstractBlock.Settings.copy(BLACK_NETHER_BRICKS));
    public static final Block GLOW_NETHER_BRICK_PANEL = ModBlocks.register("glow_nether_brick_panel", PanelBlock::new, AbstractBlock.Settings.copy(GLOW_NETHER_BRICKS));

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(BLUE_NETHER_BRICK_SLAB, NetherHyphaeModBlocks.BLUE_NETHER_BRICK_PANEL);
                    itemGroup.addAfter(BLACK_NETHER_BRICK_SLAB, NetherHyphaeModBlocks.BLACK_NETHER_BRICK_PANEL);
                    itemGroup.addAfter(GLOW_NETHER_BRICK_SLAB, NetherHyphaeModBlocks.GLOW_NETHER_BRICK_PANEL);
                });
    }
}
