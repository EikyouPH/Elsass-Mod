package github.eikyouph.elsassmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public  static final FoodComponent BRIE_CHEESE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 30, 0), 0.2F)
            .build();

    public  static final FoodComponent BAGUETTE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();

    public  static final FoodComponent WHITE_WINE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30, 0), 0.25F)
            .build();

    public  static final FoodComponent RED_WINE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30, 0), 0.25F)
            .build();

    public  static final FoodComponent BEER = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30, 0), 0.1F)
            .build();

    public  static final FoodComponent TARTE_FLAMBEE = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 30, 1), 0.3F)
            .build();

    public  static final FoodComponent JUNIPER_BERRIES = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1F)
            .build();
}
