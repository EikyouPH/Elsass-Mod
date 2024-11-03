package github.eikyouph.elsassmod.init;

import github.eikyouph.elsassmod.ElsassMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item FARINE = register("farine", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ElsassMod.id(name), item);
    }

    public static void load() {}
}
