package github.eikyouph.elsassmod;

import github.eikyouph.elsassmod.data.generator.ElsassWorldGenerator;
import github.eikyouph.elsassmod.data.provider.ElsassModBlockLootTableProvider;
import github.eikyouph.elsassmod.data.provider.ElsassModBlockTagProvider;
import github.eikyouph.elsassmod.data.provider.ElsassModModelProvider;
import github.eikyouph.elsassmod.init.worldgen.ConfiguredFeatureInit;
import github.eikyouph.elsassmod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class ElsassModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ElsassModModelProvider::new);
		pack.addProvider(ElsassModBlockLootTableProvider::new);
		pack.addProvider(ElsassModBlockTagProvider::new);
		pack.addProvider(ElsassWorldGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
