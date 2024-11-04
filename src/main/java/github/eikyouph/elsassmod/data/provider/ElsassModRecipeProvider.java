package github.eikyouph.elsassmod.data.provider;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
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
                .input('E', ItemInit.POUDRE_MSG)
                .pattern("EE")
                .pattern("EE")
                .criterion(hasItem(ItemInit.POUDRE_MSG), conditionsFromItem(ItemInit.POUDRE_MSG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.FARINE, 3)
                .input(Items.WHEAT)
                .criterion(hasItem(ItemInit.FARINE), conditionsFromItem(ItemInit.FARINE))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);
    }
}
