package pig12.eggmod.services;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import pig12.eggmod.services.types.IRegistryHelper;
import pig12.eggmod.services.util.RegistryHandle;
import net.minecraft.core.Registry;
import java.util.function.Function;

public class FabricRegistryHelper implements IRegistryHelper {

    @Override
    public <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item){
        ResourceKey<Item> key = IRegistryHelper.itemKey(name);
        Identifier id = key.identifier();
        T registered = Registry.register(BuiltInRegistries.ITEM, id, item.apply(new Item.Properties().setId(key)));

        return new RegistryHandle<T>() {
            @Override
            public Identifier id() {
                return id;
            }

            @Override
            public T get() {
                return registered;
            }
        };
    }

}
