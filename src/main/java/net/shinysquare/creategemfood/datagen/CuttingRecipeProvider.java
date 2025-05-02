package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;
import net.shinysquare.creategemfood.item.ModItems;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CuttingRecipeProvider extends ProcessingRecipeGen {
    <T extends ProcessingRecipe<?>> GeneratedRecipe create(Supplier<ItemLike> singleIngredient,
                                                           UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(Create.ID, singleIngredient, transform);
    }
    <T extends ProcessingRecipe<?>> GeneratedRecipe create(String name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(Create.asResource(name), transform);
    }
    GeneratedRecipe
        REFINED_RADIANCE_ROD = create(ModItems.REFINED_RADIANCE_SHEET::get, b -> b.duration(200)
            .output(ModItems.REFINED_RADIANCE_ROD.get())),
        SHADOW_STEEL_ROD = create(ModItems.SHADOW_STEEL_SHEET::get, b -> b.duration(200)
                    .output(ModItems.SHADOW_STEEL_ROD.get()));
    public CuttingRecipeProvider(PackOutput output) {
        super(output);
    }


    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.CUTTING;
    }
}
