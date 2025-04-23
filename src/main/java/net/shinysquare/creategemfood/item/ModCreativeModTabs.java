package net.shinysquare.creategemfood.item;

import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateGemFood.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOREBUILDING = CREATIVE_MODE_TABS.register("bd",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.bd"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PINE_CONE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> MOREMINING = CREATIVE_MODE_TABS.register("mo",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PERFECT_TOPAZ.get()))
                    .title(Component.translatable("creativetab.mo"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FLAWED_RUBY.get());
                        pOutput.accept(ModItems.ROUGH_RUBY.get());
                        pOutput.accept(ModItems.FINE_RUBY.get());
                        pOutput.accept(ModItems.FLAWLESS_RUBY.get());
                        pOutput.accept(ModItems.PERFECT_RUBY.get());

                        pOutput.accept(ModItems.FLAWED_SAPPHIRE.get());
                        pOutput.accept(ModItems.ROUGH_SAPPHIRE.get());
                        pOutput.accept(ModItems.FINE_SAPPHIRE.get());
                        pOutput.accept(ModItems.FLAWLESS_SAPPHIRE.get());
                        pOutput.accept(ModItems.PERFECT_SAPPHIRE.get());

                        pOutput.accept(ModItems.FLAWED_TOPAZ.get());
                        pOutput.accept(ModItems.ROUGH_TOPAZ.get());
                        pOutput.accept(ModItems.FINE_TOPAZ.get());
                        pOutput.accept(ModItems.FLAWLESS_TOPAZ.get());
                        pOutput.accept(ModItems.PERFECT_TOPAZ.get());

                        pOutput.accept(ModItems.FLAWED_JADE.get());
                        pOutput.accept(ModItems.ROUGH_JADE.get());
                        pOutput.accept(ModItems.FINE_JADE.get());
                        pOutput.accept(ModItems.FLAWLESS_JADE.get());
                        pOutput.accept(ModItems.PERFECT_JADE.get());

                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModItems.BIOFUEL.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> MOREFOODS = CREATIVE_MODE_TABS.register("mf",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANGO.get()))
                    .title(Component.translatable("creativetab.mf"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MANGO.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.TOMATO_SAUCE_NOT_KETCHUP.get());
                        pOutput.accept(ModItems.APPLE_JUICE_BOX.get());
                        pOutput.accept(ModItems.HALF_BREAD.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> MORETOOLS = CREATIVE_MODE_TABS.register("mt",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_SWORD.get()))
                    .title(Component.translatable("creativetab.mt"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.WOODEN_KNIFE.get());
                        pOutput.accept(ModItems.AMETHYST_SWORD.get());
                        pOutput.accept(ModItems.AMETHYST_AXE.get());
                        pOutput.accept(ModItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(ModItems.AMETHYST_HOE.get());
                        pOutput.accept(ModItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(ModItems.AMETHYST_KNIFE.get());
                        pOutput.accept(ModItems.AMETHYST_WHISK.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
