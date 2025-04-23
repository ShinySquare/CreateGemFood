package net.shinysquare.creategemfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f).build();
    public static final FoodProperties MANGO = new FoodProperties.Builder().nutrition(10).fast()
            .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200,10), 1f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER,200,10), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE,200, 10), 1f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,200,30), 1f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1f).build();
    public static final FoodProperties TOMATO_SAUCE_NOT_KETCHUP = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 10), 1f).build();
    public static final FoodProperties APPLE_JUICE_BOX = new FoodProperties.Builder().nutrition(100).fast()
            .saturationMod(0.8f).build();
    public static final FoodProperties HALF_BREAD = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.8f).build();
    public static final FoodProperties RAW_GROUND_BEEF = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 255, 60), 1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 255,60), 1f).build();


}

