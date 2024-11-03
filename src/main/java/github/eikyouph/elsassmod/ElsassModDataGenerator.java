package github.eikyouph.elsassmod;

import github.eikyouph.elsassmod.data.provider.ElsassModBlockLootTableProvider;
import github.eikyouph.elsassmod.data.provider.ElsassModBlockTagProvider;
import github.eikyouph.elsassmod.data.provider.ElsassModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;

public class ElsassModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ElsassModModelProvider::new);
		pack.addProvider(ElsassModBlockLootTableProvider::new);
		pack.addProvider(ElsassModBlockTagProvider::new);
	}
}
