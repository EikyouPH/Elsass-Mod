package github.eikyouph.elsassmod.init.worldgen;

import github.eikyouph.elsassmod.ElsassMod;
import github.eikyouph.elsassmod.init.BlockInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_MSG_KEY = registerKey("overworld_msg_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreRepleacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreRepleacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldExampleTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreRepleacables, BlockInit.MSG_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreRepleacables, BlockInit.DEEPSLATE_MSG_ORE.getDefaultState())
        );

        register(context, OVERWORLD_MSG_KEY, Feature.ORE, new OreFeatureConfig(overworldExampleTargets, 9));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, ElsassMod.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                  F feature,
                                                                                  FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }

}
