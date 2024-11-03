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
        itemModelGenerator.register(ItemInit.FROMAGE_BRIE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FARINE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.POMME_DE_TERRE_ROUGE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.POUDRE_MSG, Models.GENERATED);

    }
}
