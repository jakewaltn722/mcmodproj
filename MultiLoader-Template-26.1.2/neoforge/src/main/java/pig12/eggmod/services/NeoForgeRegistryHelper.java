package pig12.eggmod.services;

import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import pig12.eggmod.Constants;
import pig12.eggmod.services.types.IRegistryHelper;
import pig12.eggmod.services.util.RegistryHandle;

import java.util.function.Function;

public class NeoForgeRegistryHelper implements IRegistryHelper {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    @Override
    public <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item){
        Identifier id = Constants.id(name);
        DeferredItem<T> deferredItem = ITEMS.registerItem(name, item);

        return new RegistryHandle<T>() {
            @Override
            public Identifier id() {
                return id;
            }

            @Override
            public T get() {
                return deferredItem.get();
            }
        };

    }

}
