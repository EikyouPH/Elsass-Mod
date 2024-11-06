package github.eikyouph.elsassmod.init;

import github.eikyouph.elsassmod.ElsassMod;
import github.eikyouph.elsassmod.list.FoodList;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item FLOUR = register("flour", new Item(new Item.Settings()));
    public static final Item RED_POTATO = register("red_potato", new Item(new Item.Settings()));
    public static final Item MSG_POWDER = register("msg_powder", new Item(new Item.Settings()));
    public static final Item BRIE_CHEESE = register("brie_cheese",
            new Item(new Item.Settings().food(FoodList.BRIE_CHEESE).maxCount(16)));
    public static final Item ONION_SEED = register("onion_seed", new Item(new Item.Settings()));
    public static final Item CABBAGE_SEED = register("cabbage_seed", new Item(new Item.Settings()));
    public static final Item GARLIC_SEED = register("garlic_seed", new Item(new Item.Settings()));
    public static final Item PEPPER_SEED = register("pepper_seed", new Item(new Item.Settings()));
    public static final Item TOMATO_SEED = register("tomato_seed", new Item(new Item.Settings()));
    public static final Item HORSERADISH_SEED = register("horseradish_seed", new Item(new Item.Settings()));
    public static final Item MUSTARD_SEED = register("mustard_seed", new Item(new Item.Settings()));
    public static final Item WHITE_RAISIN_SEED = register("white_raisin_seed", new Item(new Item.Settings()));
    public static final Item RED_RAISIN_SEED = register("red_raisin_seed", new Item(new Item.Settings()));
    public static final Item NUT = register("nut", new Item(new Item.Settings()));
    public static final Item HAZELNUT = register("hazelnut", new Item(new Item.Settings()));
    public static final Item ANISE_SEED = register("anise_seed", new Item(new Item.Settings()));
    public static final Item CINNAMON_SEED = register("cinnamon_seed", new Item(new Item.Settings()));
    public static final Item CHOCOLATE_POWDER = register("chocolate_powder", new Item(new Item.Settings()));
    public static final Item LEEK_SEED = register("leek_seed", new Item(new Item.Settings()));
    public static final Item RUTABAGA_SEED = register("rutabaga_seed", new Item(new Item.Settings()));
    public static final Item SMALL_PUMPKIN_SEED = register("small_pumpkin_seed", new Item(new Item.Settings()));
    public static final Item PARSLEY_SEED = register("parsley_seed", new Item(new Item.Settings()));
    public static final Item CHIVES_SEED = register("chives_seed", new Item(new Item.Settings()));
    public static final Item JUNIPER_SEED = register("juniper_seed", new Item(new Item.Settings()));
    public static final Item SHALLOT_SEED = register("shallot_seed", new Item(new Item.Settings()));
    public static final Item BARLEY_MALT = register("barley_malt", new Item(new Item.Settings()));
    public static final Item HOP_SEED = register("hop_seed", new Item(new Item.Settings()));
    public static final Item BARLEY_SEED = register("barley_seed", new Item(new Item.Settings()));
    public static final Item PLUM_SEED = register("plum_seed", new Item(new Item.Settings()));
    public static final Item RHUBARB_SEED = register("rhubarb_seed", new Item(new Item.Settings()));
    public static final Item ORANGE_SEED = register("orange_seed", new Item(new Item.Settings()));
    public static final Item LEMON_SEED = register("lemon_seed", new Item(new Item.Settings()));
    public static final Item CLOVE_SEED = register("clove_seed", new Item(new Item.Settings()));
    public static final Item CELERY_SEED = register("celery_seed", new Item(new Item.Settings()));
    public static final Item TURNIP_SEED = register("turnip_seed", new Item(new Item.Settings()));
    public static final Item LAUREL_SEED = register("laurel_seed", new Item(new Item.Settings()));
    public static final Item CREAM = register("cream", new Item(new Item.Settings()));
    public static final Item BUTTER = register("butter", new Item(new Item.Settings()));
    public static final Item PORK_CARCASS = register("pork_carcass", new Item(new Item.Settings()));
    public static final Item BEEF_CARCASS = register("beef_carcass", new Item(new Item.Settings()));
    public static final Item SHEEP_CARCASS = register("sheep_carcass", new Item(new Item.Settings()));
    public static final Item SUNFLOWER_OIL = register("sunflower_oil", new Item(new Item.Settings()));
    public static final Item WHITE_WINE = register("white_wine", new Item(new Item.Settings()
            .food(FoodList.WHITE_WINE).maxCount(1)));
    public static final Item RED_WINE = register("red_wine", new Item(new Item.Settings()
            .food(FoodList.RED_WINE).maxCount(1)));
    public static final Item VINEGAR = register("vinegar", new Item(new Item.Settings()));
    public static final Item SAUSAGE = register("sausage", new Item(new Item.Settings()));
    public static final Item MINCED_MEAT = register("minced_meat", new Item(new Item.Settings()));
    public static final Item BAGUETTE = register("baguette", new Item(new Item.Settings()
            .food(FoodList.BAGUETTE)));
    public static final Item BREAD_PASTE = register("bread_paste", new Item(new Item.Settings()));
    public static final Item BIBELESKASE = register("bibeleskase", new Item(new Item.Settings()));
    public static final Item LARDONS = register("lardons", new Item(new Item.Settings()));
    public static final Item KNIFE = register("knife", new Item(new Item.Settings()));
    public static final Item TARTE_FLAMBEE = register("tarte_flambee", new Item(new Item.Settings()
            .food(FoodList.TARTE_FLAMBEE)));
    public static final Item CUTTING_BOARD = register("cutting_board", new Item(new Item.Settings()));
    public static final Item JUNIPER_BERRIES = register("juniper_berries", new Item(new Item.Settings()
            .food(FoodList.JUNIPER_BERRIES)));
    public static final Item BAECKHOFEN_TERRINE = register("baeckhofen_terrine", new Item(new Item.Settings()));
    public static final Item BEER = register("beer", new Item(new Item.Settings()
            .food(FoodList.BEER).maxCount(1)));
    public static final Item CARP_FISH = register("carp_fish", new Item(new Item.Settings()));
    public static final Item TROUT_FISH = register("trout_fish", new Item(new Item.Settings()));
    public static final Item HERRING_FISH = register("herring_fish", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ElsassMod.id(name), item);
    }



    public static void load() {}
}
