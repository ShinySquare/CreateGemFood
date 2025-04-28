package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.Tags;

import java.util.function.UnaryOperator;

public class MixingRecipeProvider extends ProcessingRecipeGen {
    <T extends ProcessingRecipe<?>> GeneratedRecipe create(String name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(Create.asResource(name), transform);
    }
    GeneratedRecipe
            CHROMATIC_COMPOUND = create("chromatic_compound", b -> b.require(Tags.Items.DUSTS_GLOWSTONE)
            .require(Tags.Items.DUSTS_GLOWSTONE)
            .require(Tags.Items.DUSTS_GLOWSTONE)
            .require(AllItems.POWDERED_OBSIDIAN.get())
            .require(AllItems.POWDERED_OBSIDIAN.get())
            .require(AllItems.POWDERED_OBSIDIAN.get())
            .require(AllItems.POLISHED_ROSE_QUARTZ.get())
            .output(AllItems.CHROMATIC_COMPOUND.get(), 1)
            .requiresHeat(HeatCondition.SUPERHEATED));



    public MixingRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.MIXING;
    }
}
