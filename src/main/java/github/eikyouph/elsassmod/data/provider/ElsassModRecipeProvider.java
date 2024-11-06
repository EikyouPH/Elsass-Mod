package github.eikyouph.elsassmod.data.provider;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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
                .criterion(hasItem(ItemInit.RED_GRAPES), conditionsFromItem(ItemInit.RED_GRAPES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.WHITE_WINE)
                .input(Items.GLASS_BOTTLE)
                .input(ItemInit.WHITE_GRAPES)
                .criterion(hasItem(ItemInit.WHITE_GRAPES), conditionsFromItem(ItemInit.WHITE_GRAPES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.BREAD_PASTE)
                .input(Items.WATER_BUCKET)
                .input(ItemInit.FLOUR)
                .criterion(hasItem(ItemInit.FLOUR), conditionsFromItem(ItemInit.FLOUR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.CUTTING_BOARD)
                .input(ItemTags.WOODEN_SLABS)
                .criterion(hasItem(Items.OAK_SLAB), conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(Items.DARK_OAK_SLAB), conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(Items.SPRUCE_SLAB), conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(Items.BIRCH_SLAB), conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(Items.JUNGLE_SLAB), conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(Items.CHERRY_SLAB), conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(Items.MANGROVE_SLAB), conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(Items.ACACIA_SLAB), conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.KNIFE)
                .input('s',ConventionalItemTags.WOODEN_RODS)
                .input('i',Items.IRON_INGOT)
                .pattern(" i")
                .pattern("s ")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
    }
}
