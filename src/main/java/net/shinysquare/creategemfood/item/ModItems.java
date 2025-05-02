package net.shinysquare.creategemfood.item;

import net.minecraft.world.item.*;
import net.shinysquare.creategemfood.CreateGemFood;
import net.shinysquare.creategemfood.item.custom.FuelItem;
import net.shinysquare.creategemfood.item.custom.MetalDetectorItem;
import net.shinysquare.creategemfood.item.custom.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateGemFood.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(ModFoods.MANGO)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> TOMATO_SAUCE_NOT_KETCHUP = ITEMS.register("tsnk",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO_SAUCE_NOT_KETCHUP)));
    public static final RegistryObject<Item> APPLE_JUICE_BOX = ITEMS.register("apple_juice_box" ,
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_JUICE_BOX).stacksTo(1)));
    public static final RegistryObject<Item> HALF_BREAD = ITEMS.register("half_bread" ,
            () -> new Item(new Item.Properties().food(ModFoods.HALF_BREAD).stacksTo(128)));
    public static final RegistryObject<Item> RAW_GROUND_BEEF = ITEMS.register("raw_ground_beef" ,
            () -> new Item(new Item.Properties().food(ModFoods.RAW_GROUND_BEEF).stacksTo(16)));
    public static final RegistryObject<Item> BEEF_PATTY = ITEMS.register("beef_patty" ,
            () -> new Item(new Item.Properties().food(ModFoods.BEEF_PATTY).stacksTo(16)));
    public static final RegistryObject<Item> WOODEN_KNIFE = ITEMS.register("wood_knife" ,
            WoodenKnifeItem::new);
    public static final RegistryObject<Item> BIOFUEL = ITEMS.register("biofuel",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> REFINED_RADIANCE_ROD = ITEMS.register("refined_radiance_rod",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> REFINED_RADIANCE_SHEET = ITEMS.register("refined_radiance_sheet",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SHADOW_STEEL_ROD = ITEMS.register("shadow_steel_rod",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(net.shinysquare.creategemfood.item.ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(net.shinysquare.creategemfood.item.ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(net.shinysquare.creategemfood.item.ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(net.shinysquare.creategemfood.item.ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(net.shinysquare.creategemfood.item.ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(net.shinysquare.creategemfood.item.ModToolTiers.AMETHYST, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(net.shinysquare.creategemfood.item.ModToolTiers.AMETHYST, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(net.shinysquare.creategemfood.item.ModToolTiers.AMETHYST, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(net.shinysquare.creategemfood.item.ModToolTiers.AMETHYST, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(net.shinysquare.creategemfood.item.ModToolTiers.AMETHYST, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_KNIFE = ITEMS.register("amethyst_knife",
            AmethystKnifeItem::new);
    public static final RegistryObject<Item> AMETHYST_WHISK = ITEMS.register("amethyst_whisk",
            AmethystKnifeItem::new);
    public static final RegistryObject<Item> STONE_WHISK = ITEMS.register("stone_whisk",
            StoneWhiskItem::new);
    public static final RegistryObject<Item> IRON_WHISK = ITEMS.register("iron_whisk",
            IronWhiskItem::new);
    public static final RegistryObject<Item> GOLD_WHISK = ITEMS.register("gold_whisk",
            GoldWhiskItem::new);
    public static final RegistryObject<Item> DIAMOND_WHISK = ITEMS.register("diamond_whisk",
            DiamondWhiskItem::new);
    public static final RegistryObject<Item> NETHERITE_WHISK = ITEMS.register("netherite_whisk",
            NetheriteWhiskItem::new);
    public static final RegistryObject<Item> STONE_WHISKP = ITEMS.register("stone_whiskp",
            StoneWhiskItem::new);
    public static final RegistryObject<Item> IRON_WHISKP = ITEMS.register("iron_whiskp",
            IronWhiskItem::new);
    public static final RegistryObject<Item> GOLD_WHISKP = ITEMS.register("gold_whiskp",
            GoldWhiskItem::new);
    public static final RegistryObject<Item> DIAMOND_WHISKP = ITEMS.register("diamond_whiskp",
            DiamondWhiskItem::new);
    public static final RegistryObject<Item> NETHERITE_WHISKP = ITEMS.register("netherite_whiskp",
            NetheriteWhiskItem::new);
    public static final RegistryObject<Item> SHADOW_STEEL_SHEET = ITEMS.register("shadow_steel_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABSTRUSE_MECHANISM = ITEMS.register("abstruse_mechanism",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECHO_CORE = ITEMS.register("echo_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ECHO_CORE = ITEMS.register("incomplete_echo_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAWED_RUBY = ITEMS.register("flawed_ruby",
            FLAWEDGEMSTONEItem::new);
    public static final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby",
            ROUGHGEMSTONEItem::new);
    public static final RegistryObject<Item> FINE_RUBY = ITEMS.register("fine_ruby",
            FINEGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWLESS_RUBY = ITEMS.register("flawless_ruby",
            FLAWLESSGEMSTONEItem::new);
    public static final RegistryObject<Item> PERFECT_RUBY = ITEMS.register("perfect_ruby",
            PERFECTGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWED_SAPPHIRE = ITEMS.register("flawed_sapphire",
            FLAWEDGEMSTONEItem::new);
    public static final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire",
            ROUGHGEMSTONEItem::new);
    public static final RegistryObject<Item> FINE_SAPPHIRE = ITEMS.register("fine_sapphire",
            FINEGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWLESS_SAPPHIRE = ITEMS.register("flawless_sapphire",
            FLAWLESSGEMSTONEItem::new);
    public static final RegistryObject<Item> PERFECT_SAPPHIRE = ITEMS.register("perfect_sapphire",
            PERFECTGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWED_TOPAZ = ITEMS.register("flawed_topaz",
            FLAWEDGEMSTONEItem::new);
    public static final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register("rough_topaz",
            ROUGHGEMSTONEItem::new);
    public static final RegistryObject<Item> FINE_TOPAZ = ITEMS.register("fine_topaz",
            FINEGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWLESS_TOPAZ = ITEMS.register("flawless_topaz",
            FLAWLESSGEMSTONEItem::new);
    public static final RegistryObject<Item> PERFECT_TOPAZ = ITEMS.register("perfect_topaz",
            PERFECTGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWED_JADE = ITEMS.register("flawed_jade",
            FLAWEDGEMSTONEItem::new);
    public static final RegistryObject<Item> ROUGH_JADE = ITEMS.register("rough_jade",
            ROUGHGEMSTONEItem::new);
    public static final RegistryObject<Item> FINE_JADE = ITEMS.register("fine_jade",
            FINEGEMSTONEItem::new);
    public static final RegistryObject<Item> FLAWLESS_JADE = ITEMS.register("flawless_jade",
            FLAWLESSGEMSTONEItem::new);
    public static final RegistryObject<Item> PERFECT_JADE = ITEMS.register("perfect_jade",
            PERFECTGEMSTONEItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
