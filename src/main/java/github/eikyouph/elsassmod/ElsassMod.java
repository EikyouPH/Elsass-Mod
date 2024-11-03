package github.eikyouph.elsassmod;

import github.eikyouph.elsassmod.init.BlockInit;
import github.eikyouph.elsassmod.init.ItemInit;
import net.fabricmc.api.ModInitializer;

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
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}