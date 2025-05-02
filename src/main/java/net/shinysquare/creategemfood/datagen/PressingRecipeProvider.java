package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.PackOutput;
import net.shinysquare.creategemfood.item.ModItems;

import java.util.function.UnaryOperator;

public class PressingRecipeProvider extends ProcessingRecipeGen {
    <T extends ProcessingRecipe<?>> GeneratedRecipe create(String name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(Create.asResource(name), transform);
    }
    GeneratedRecipe
        SHADOW_STEEL_SHEET = create("shadow_steel_sheet", b -> b.require(AllItems.SHADOW_STEEL)
            .output(ModItems.SHADOW_STEEL_SHEET.get())),
        REFINED_RADIANCE_SHEET = create("refined_radiance_sheet", b -> b.require(AllItems.REFINED_RADIANCE)
                    .output(ModItems.REFINED_RADIANCE_SHEET.get()));
    public PressingRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.PRESSING;
    }
}
