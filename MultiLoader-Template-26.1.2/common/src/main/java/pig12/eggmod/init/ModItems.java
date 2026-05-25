package pig12.eggmod.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import pig12.eggmod.services.Services;
import pig12.eggmod.services.util.RegistryHandle;

public final class ModItems {

    private ModItems(){

    }

    public static void load(){

    }

    public static final RegistryHandle<Item> HARDBOILED_EGG = Services.REGISTRY.registerItem("hardboiled_egg",
            properties -> new Item(properties.stacksTo(16).food(new FoodProperties(5, 0.6F, false))));

    public static final RegistryHandle<Item> HARDBOILED_SWORD = Services.REGISTRY.registerItem("hardboiled_sword",
            properties -> new Item(properties.stacksTo(1)));

    // next up is pickaxe, figure out smelting recipes and sword properties first


}
