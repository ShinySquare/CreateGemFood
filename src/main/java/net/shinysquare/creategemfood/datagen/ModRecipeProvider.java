package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.block.ModBlocks;
import net.shinysquare.creategemfood.item.ModItems;
import net.shinysquare.creategemfood.util.ModTags;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
    protected final List<ModRecipeProvider.GeneratedRecipe> all = new ArrayList<>();



    @FunctionalInterface
    public interface GeneratedRecipe {
        void register(Consumer<FinishedRecipe> consumer);
    }
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD.get())
                .pattern(" A ")
                .pattern(" D ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.DIAMOND)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_AXE.get())
                .pattern("AD ")
                .pattern("AR ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_PICKAXE.get())
                .pattern("ADA")
                .pattern(" R ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_SHOVEL.get())
                .pattern(" A ")
                .pattern(" D ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_HOE.get())
                .pattern("AD ")
                .pattern(" R ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_KNIFE.get())
                .pattern("A  ")
                .pattern(" D ")
                .pattern("  R")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.AMETHYST_WHISK.get())
                .pattern("AWA")
                .pattern(" D ")
                .pattern(" R ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('R', ModItems.IRON_ROD.get())
                .define('W', AllItems.WHISK)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HALF_BREAD.get(), 2)
                .requires(ModTags.Items.CUTTING_TOOL)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.RAW_GROUND_BEEF.get())
                .requires(ModTags.Items.WHISK)
                .requires(ModTags.Items.CUTTING_TOOL)
                .requires(Items.BEEF)
                .unlockedBy(getHasName(Items.BEEF), has(Items.BEEF))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.WOODEN_KNIFE.get(), 1)
                .requires(Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_ROD.get(), 1)
                .pattern(" A ")
                .pattern(" I ")
                .pattern(" D ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.ECHO_SHARD)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_WHISKP.get(), 1)
                .pattern(" C ")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', Items.COBBLESTONE)
                .define('S', Items.COBBLESTONE_SLAB)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_WHISKP.get())
                .pattern(" C ")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', Items.IRON_INGOT)
                .define('S', AllItems.IRON_SHEET)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_WHISKP.get())
                .pattern(" C ")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', Items.GOLD_INGOT)
                .define('S', AllItems.GOLDEN_SHEET)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_WHISKP.get())
                .pattern(" C ")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', Items.DIAMOND)
                .define('S', AllItems.POLISHED_ROSE_QUARTZ)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_WHISKP.get())
                .pattern(" C ")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', Items.NETHERITE_INGOT)
                .define('S', AllItems.SHADOW_STEEL)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_WHISK.get())
                .pattern(" W ")
                .pattern(" S ")
                .pattern(" S ")
                .define('W', ModItems.STONE_WHISKP.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_WHISK.get())
                .pattern(" W ")
                .pattern(" S ")
                .pattern(" S ")
                .define('W', ModItems.IRON_WHISKP.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_WHISK.get())
                .pattern(" W ")
                .pattern(" S ")
                .pattern(" S ")
                .define('W', ModItems.GOLD_WHISKP.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_WHISK.get())
                .pattern(" W ")
                .pattern(" S ")
                .pattern(" S ")
                .define('W', ModItems.DIAMOND_WHISKP.get())
                .define('S', ModItems.REFINED_RADIANCE_ROD.get())
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_WHISK.get())
                .pattern(" W ")
                .pattern(" S ")
                .pattern(" S ")
                .define('W', ModItems.NETHERITE_WHISKP.get())
                .define('S', ModItems.SHADOW_STEEL_ROD.get())
                .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,   CreateGemFood.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
