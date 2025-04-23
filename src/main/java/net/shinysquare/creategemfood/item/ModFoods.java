package net.shinysquare.creategemfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f).build();
    public static final FoodProperties MANGO = new FoodProperties.Builder().nutrition(10).fast().alwaysEat()
            .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200,255), 1f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER,1200,255), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE,1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,1200,255), 1f).effect(() -> new MobEffectInstance (MobEffects.HEAL,1200,255),0.1f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200), 1f).build();
    public static final FoodProperties TOMATO_SAUCE_NOT_KETCHUP = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200), 1f).build();
    public static final FoodProperties APPLE_JUICE_BOX = new FoodProperties.Builder().nutrition(100).fast()
            .saturationMod(0.8f).build();
    public static final FoodProperties HALF_BREAD = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.8f).build();
    public static final FoodProperties RAW_GROUND_BEEF = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1200, 255), 1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200,255), 1f).build();


}

