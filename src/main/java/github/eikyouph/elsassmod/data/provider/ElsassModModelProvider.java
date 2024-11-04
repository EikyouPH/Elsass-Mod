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
        itemModelGenerator.register(ItemInit.WHITE_RAISIN_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RED_RAISIN_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.NUT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.HAZELNUT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANISE_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CINNAMON_SEED, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CHOCOLATE_POWDER, Models.GENERATED);
    }
}
