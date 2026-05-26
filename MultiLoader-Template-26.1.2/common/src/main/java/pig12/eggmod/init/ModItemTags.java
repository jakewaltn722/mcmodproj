package pig12.eggmod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import pig12.eggmod.Constants;

public final class ModItemTags {

    private ModItemTags(){

    }

    public static final TagKey<Item> EGG_TOOL_REPAIR = create("egg_tool_materials");

    public static TagKey<Item> create(String name){
        return TagKey.create(Registries.ITEM, Constants.id(name));
    }

}
