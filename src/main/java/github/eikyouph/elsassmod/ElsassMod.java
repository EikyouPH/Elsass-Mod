package github.eikyouph.elsassmod;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemGroupInit;
import github.eikyouph.elsassmod.init.ItemInit;
import github.eikyouph.elsassmod.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElsassMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Elsass Mod");
	public static final String MOD_ID = "elsassmod";


	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomeModificationInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.PUMPKIN_PIE, ItemInit.BRIE_CHEESE);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.SUGAR, ItemInit.MSG_POWDER);
			entries.addAfter(ItemInit.MSG_POWDER, ItemInit.CHOCOLATE_POWDER);
		});
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}