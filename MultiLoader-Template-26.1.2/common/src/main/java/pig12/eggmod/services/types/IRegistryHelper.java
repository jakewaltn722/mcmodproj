package pig12.eggmod.services.types;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import pig12.eggmod.Constants;
import pig12.eggmod.services.util.RegistryHandle;

import java.util.function.Function;


public interface IRegistryHelper {

    <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item);

    static ResourceKey<Item> itemKey(String name){
        return ResourceKey.create(Registries.ITEM, Constants.id(name));
    }
}
