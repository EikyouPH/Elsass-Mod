package github.eikyouph.elsassmod.data.provider;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ElsassModModelProvider extends FabricModelProvider {

    public ElsassModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MSG_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_MSG_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.BRIE_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MSG_POWDER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ONION_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CABBAGE_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.GARLIC_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.PEPPER_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.TOMATO_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.HORSERADISH_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MUSTARD_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.WHITE_GRAPES_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.WHITE_GRAPES, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RED_GRAPES_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RED_GRAPES, Models.GENERATED);
        itemModelGenerator.register(ItemInit.NUT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.HAZELNUT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANISE_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CINNAMON_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CHOCOLATE_POWDER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.LEEK_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUTABAGA_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SMALL_PUMPKIN_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.PARSLEY_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CHIVES_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.JUNIPER_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SHALLOT_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BARLEY_MALT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BARLEY_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.HOP_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.PLUM_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RHUBARB_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ORANGE_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.LEMON_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CLOVE_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CELERY_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.TURNIP_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.LAUREL_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CREAM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BUTTER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.PORK_CARCASS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BEEF_CARCASS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SHEEP_CARCASS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SUNFLOWER_OIL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.WHITE_WINE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RED_WINE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VINEGAR, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MINCED_MEAT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BAGUETTE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BIBELESKASE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.LARDONS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BREAD_PASTE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.TARTE_FLAMBEE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CUTTING_BOARD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.JUNIPER_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BAECKHOFEN_TERRINE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BEER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CARP_FISH, Models.GENERATED);
        itemModelGenerator.register(ItemInit.TROUT_FISH, Models.GENERATED);
        itemModelGenerator.register(ItemInit.HERRING_FISH, Models.GENERATED);
    }
}
