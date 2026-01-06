package bluesteel42.panels.util;

import bluesteel42.panels.Panels;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PANELS = createTag("panels");
        public static final TagKey<Block> WOODEN_PANELS = createTag("wooden_panels");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Panels.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PANELS = createTag("panels");
        public static final TagKey<Item> WOODEN_PANELS = createTag("wooden_panels");
        public static final TagKey<Item> MUSHROOM_PANELS = createTag("mushroom_panels");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Panels.MOD_ID, name));
        }
    }
}
