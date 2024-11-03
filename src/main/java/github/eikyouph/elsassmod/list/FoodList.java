package github.eikyouph.elsassmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public  static final FoodComponent FROMAGE_BRIE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.4F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 30, 1), 0)
            .build();
}
