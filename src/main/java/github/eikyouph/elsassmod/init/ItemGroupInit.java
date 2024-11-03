package github.eikyouph.elsassmod.init;

import github.eikyouph.elsassmod.ElsassMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    private static final Text ELSASS_TITLE = Text.translatable("itemGroup." + ElsassMod.MOD_ID + ".elsass_group");
    public static final ItemGroup ELSASS_GROUP = register("elsass_group", FabricItemGroup.builder()
            .displayName(ELSASS_TITLE)
            .icon(ItemInit.FROMAGE_BRIE::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(ElsassMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, ElsassMod.id(name), itemGroup);
    }

    public static void load(){}
}
