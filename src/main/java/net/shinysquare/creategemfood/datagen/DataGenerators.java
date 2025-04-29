package net.shinysquare.creategemfood.datagen;

import com.simibubi.create.Create;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IGenericEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;
import net.shinysquare.creategemfood.CreateGemFood;

@Mod.EventBusSubscriber(modid = CreateGemFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        if (event.includeServer()) {
            generator.addProvider(true, new ModRecipeProvider(packOutput));
            generator.addProvider(true, new MixingRecipeProvider(packOutput));
            generator.addProvider(true, new PressingRecipeProvider(packOutput));
//            generator.addProvider(true, new SequencedAssemblyRecipeProvider(packOutput));
            generator.addProvider(true, ModLootTableProvider.create(packOutput));
            generator.addProvider(true, new net.shinysquare.creategemfood.datagen.ModBlockStateProvider(packOutput, existingFileHelper));
            generator.addProvider(true, new net.shinysquare.creategemfood.datagen.ModItemModelProvider(packOutput, existingFileHelper));
        }

        net.shinysquare.creategemfood.datagen.ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new net.shinysquare.creategemfood.datagen.ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new net.shinysquare.creategemfood.datagen.ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
