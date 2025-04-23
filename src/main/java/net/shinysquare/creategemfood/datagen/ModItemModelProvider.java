package net.shinysquare.creategemfood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.block.ModBlocks;
import net.shinysquare.creategemfood.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateGemFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.TOMATO_SAUCE_NOT_KETCHUP);
        simpleItem(ModItems.MANGO);
        simpleItem(ModItems.BIOFUEL);
        simpleItem(ModItems.ROUGH_SAPPHIRE);
        simpleItem(ModItems.FLAWED_SAPPHIRE);
        simpleItem(ModItems.FINE_SAPPHIRE);
        simpleItem(ModItems.FLAWLESS_SAPPHIRE);
        simpleItem(ModItems.PERFECT_SAPPHIRE);
        simpleItem(ModItems.HALF_BREAD);
        simpleItem(ModItems.WOODEN_KNIFE);

        simpleItem(ModItems.ROUGH_RUBY);
        simpleItem(ModItems.FLAWED_RUBY);
        simpleItem(ModItems.FINE_RUBY);
        simpleItem(ModItems.FLAWLESS_RUBY);
        simpleItem(ModItems.PERFECT_RUBY);

        simpleItem(ModItems.ROUGH_JADE);
        simpleItem(ModItems.FLAWED_JADE);
        simpleItem(ModItems.FINE_JADE);
        simpleItem(ModItems.FLAWLESS_JADE);
        simpleItem(ModItems.PERFECT_JADE);

        simpleItem(ModItems.ROUGH_TOPAZ);
        simpleItem(ModItems.FLAWED_TOPAZ);
        simpleItem(ModItems.FINE_TOPAZ);
        simpleItem(ModItems.FLAWLESS_TOPAZ);
        simpleItem(ModItems.PERFECT_TOPAZ);

        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);

        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.TOMATO_SAUCE_NOT_KETCHUP);

        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);

        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_HOE);
        handheldItem(ModItems.AMETHYST_SWORD);
        handheldItem(ModItems.AMETHYST_PICKAXE);
        handheldItem(ModItems.AMETHYST_AXE);
        handheldItem(ModItems.AMETHYST_SHOVEL);
        handheldItem(ModItems.AMETHYST_HOE);
        handheldItem(ModItems.AMETHYST_KNIFE);
        handheldItem(ModItems.AMETHYST_WHISK);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateGemFood.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(CreateGemFood.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(CreateGemFood.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(CreateGemFood.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(CreateGemFood.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(CreateGemFood.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateGemFood.MOD_ID,"item/" + item.getId().getPath()));
    }
}
