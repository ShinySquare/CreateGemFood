package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyRecipeBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.item.ModItems;

import java.util.function.UnaryOperator;

public class SequencedAssemblyRecipeProvider extends ModRecipeProvider {
    GeneratedRecipe
        ECHO_CORE = create("echo_core", b -> b.require(Items.ECHO_SHARD)
        .transitionTo(ModItems.INCOMPLETE_ECHO_CORE.get())
        .addOutput(ModItems.ECHO_CORE.get(), 100)
        .loops(3)
        .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ModItems.SHADOW_STEEL_SHEET.get()))
        .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.AMETHYST_SHARD))
        .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ModItems.SHADOW_STEEL_SHEET.get())));


    public SequencedAssemblyRecipeProvider(PackOutput p_i48262_1_) {
        super(p_i48262_1_);
    }

    protected GeneratedRecipe create(String name, UnaryOperator<SequencedAssemblyRecipeBuilder> transform) {
        GeneratedRecipe generatedRecipe =
                c -> transform.apply(new SequencedAssemblyRecipeBuilder(Create.asResource(name)))
                        .build(c);
        all.add(generatedRecipe);
        return generatedRecipe;
    }


}
