package github.eikyouph.elsassmod.data.provider;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ElsassModRecipeProvider extends FabricRecipeProvider {
    public ElsassModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.SALT_BLOCK)
                .input('E', ItemInit.MSG_POWDER)
                .pattern("EE")
                .pattern("EE")
                .criterion(hasItem(ItemInit.MSG_POWDER), conditionsFromItem(ItemInit.MSG_POWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.FLOUR, 3)
                .input(Items.WHEAT)
                .criterion(hasItem(ItemInit.FLOUR), conditionsFromItem(ItemInit.FLOUR))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.RED_WINE)
                .input(Items.GLASS_BOTTLE)
                .input(ItemInit.RED_GRAPES)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ItemInit.RED_GRAPES))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ItemInit.RED_GRAPES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.WHITE_WINE)
                .input(Items.GLASS_BOTTLE)
                .input(ItemInit.WHITE_GRAPES)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ItemInit.WHITE_GRAPES))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ItemInit.WHITE_GRAPES))
                .offerTo(exporter);
    }
}
