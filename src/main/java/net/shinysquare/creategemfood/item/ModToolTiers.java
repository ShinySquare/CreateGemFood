package net.shinysquare.creategemfood.item;

import com.simibubi.create.Create;
import net.minecraft.world.item.Items;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(CreateGemFood.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier RUBY_DRILL = TierSortingRegistry.registerTier(
            new ForgeTier(7, 3000, 7f, 5f, 25,
                    ModTags.Blocks.BKPWR_7, () -> Ingredient.of(ModItems.FINE_RUBY.get())),
            new ResourceLocation(CreateGemFood.MOD_ID, "biofuel"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(7, 2048, 6f, 5f, 30,
                    ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD)),
            new ResourceLocation(CreateGemFood.MOD_ID, "amethyst"), List.of(Tiers.NETHERITE), List.of());

}
