package github.eikyouph.elsassmod.init;

import github.eikyouph.elsassmod.ElsassMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockInit {
    public static final Block SALT_BLOCK = registerWithItem("salt_block", new Block(AbstractBlock.Settings.create()
            .strength(0.4F)
            .requiresTool()));

    public static final Block MSG_ORE = registerWithItem("msg_ore", new Block(AbstractBlock.Settings.create()
            .strength(0.5F)
            .requiresTool()));

    public static final Block DEEPSLATE_MSG_ORE = registerWithItem("deepslate_msg_ore", new Block(AbstractBlock.Settings.create()
            .strength(0.6F)
            .requiresTool()));

    public static <T extends Block> T register(String name, T block){
        return Registry.register(Registries.BLOCK, ElsassMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
