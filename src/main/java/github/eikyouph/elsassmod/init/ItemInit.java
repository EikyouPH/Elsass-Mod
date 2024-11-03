package github.eikyouph.elsassmod.init;

import github.eikyouph.elsassmod.ElsassMod;
import github.eikyouph.elsassmod.list.FoodList;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item FARINE = register("farine", new Item(new Item.Settings()));
    public static final Item POMME_DE_TERRE_ROUGE = register("pomme_de_terre_rouge", new Item(new Item.Settings()));
    public static final Item FROMAGE_BRIE = register("fromage_brie",
            new Item(new Item.Settings().food(FoodList.FROMAGE_BRIE).maxCount(16)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ElsassMod.id(name), item);
    }

    public static void load() {}
}
