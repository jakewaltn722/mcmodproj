package pig12.eggmod.init;

import net.minecraft.world.item.Item;
import pig12.eggmod.services.Services;
import pig12.eggmod.services.util.RegistryHandle;

public final class ModItems {

    private ModItems(){

    }

    public static void load(){

    }

    public static final RegistryHandle<Item> HARDBOILED_EGG = Services.REGISTRY.registerItem("hardboiled_egg",
            properties -> new Item(properties.food(ModFoodProperties.HARDBOILED_EGG_PROPERTIES).stacksTo(16)));

    public static final RegistryHandle<Item> HARDBOILED_SWORD = Services.REGISTRY.registerItem("hardboiled_sword",
            properties -> new Item(properties.sword(ModToolMaterials.EGG_MATERIAL, 3.0F, -2.4F).stacksTo(1)));




}
