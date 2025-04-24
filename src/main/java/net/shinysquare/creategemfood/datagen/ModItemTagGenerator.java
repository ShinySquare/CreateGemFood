package net.shinysquare.creategemfood.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.item.ModItems;
import net.shinysquare.creategemfood.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CreateGemFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.CUTTING_TOOL)
                .add(ModItems.SAPPHIRE_SWORD.get()
                        , Items.NETHERITE_SWORD
                        , Items.DIAMOND_SWORD
                        , Items.GOLDEN_SWORD
                        , Items.IRON_SWORD
                        , Items.STONE_SWORD
                        , Items.WOODEN_SWORD
                        , ModItems.WOODEN_KNIFE.get()
                        , ModItems.AMETHYST_KNIFE.get());
    }
}