package net.shinysquare.creategemfood.util;

import net.shinysquare.creategemfood.CreateGemFood;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");
        public static final TagKey<Block> BKPWR_7 = tag("bkpwr_7");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CreateGemFood.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CUTTING_TOOL = ItemTags.create(new ResourceLocation(CreateGemFood.MOD_ID, "cut_tool"));

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CreateGemFood.MOD_ID, name));
        }
    }
}
