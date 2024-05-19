package net.awang.zompocalypse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties ZOMBFLESH = new FoodProperties.Builder().meat().nutrition(2).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200),1f).build();

    public static final FoodProperties COOKED_ZOMBMEAT = new FoodProperties.Builder().meat().nutrition(4).build();

    public static final FoodProperties ZOMBSTEW = stew(6).build();

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }

}
