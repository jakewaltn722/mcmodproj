package pig12.eggmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public final class ModToolMaterials {

    private ModToolMaterials(){

    }
    public static final ToolMaterial EGG_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_COPPER_TOOL,
            512,
            7.0F,
            2.5F,
            32,
            ModItemTags.EGG_TOOL_REPAIR
    );

}
