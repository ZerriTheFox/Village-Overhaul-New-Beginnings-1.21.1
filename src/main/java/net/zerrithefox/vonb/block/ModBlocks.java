package net.zerrithefox.vonb.block;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zerrithefox.vonb.VillageOverhaulNewBeginnings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VillageOverhaulNewBeginnings.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VillageOverhaulNewBeginnings.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks {
        VillageOverhaulNewBeginnings.LOGGER.info("Registering Mod Block for " + VillageOverhaulNewBeginnings.MOD_ID);
    }

}
