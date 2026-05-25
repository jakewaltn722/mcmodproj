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


}
