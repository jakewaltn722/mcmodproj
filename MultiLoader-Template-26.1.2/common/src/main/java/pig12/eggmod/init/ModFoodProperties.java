package pig12.eggmod.init;

import net.minecraft.world.food.FoodProperties;

public final class ModFoodProperties {

    private ModFoodProperties(){

    }

    public static final FoodProperties HARDBOILED_EGG_PROPERTIES = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();

}
