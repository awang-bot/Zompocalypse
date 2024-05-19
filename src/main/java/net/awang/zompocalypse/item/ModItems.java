package net.awang.zompocalypse.item;

import net.awang.zompocalypse.Zompocalypse;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Zompocalypse.MOD_ID);

    //raw zombie flesh
    public static final RegistryObject<Item> ZOMBFLESH = ITEMS.register("zombie_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.ZOMBFLESH)));

    //cooked zombie meat
    public static final RegistryObject<Item> COOKED_ZOMBMEAT = ITEMS.register("cooked_zombie_meat",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_ZOMBMEAT)));

    //zombie stew
    public static final RegistryObject<Item> ZOMBSTEW = ITEMS.register("zombie_stew",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.ZOMBSTEW)));

    //flamethrower
    public static final RegistryObject<Item> FLAMETHROWER = ITEMS.register("flamethrower",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
