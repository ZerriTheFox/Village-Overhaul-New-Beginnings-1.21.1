package net.zerrithefox.vonb.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zerrithefox.vonb.Vonb;
import net.zerrithefox.vonb.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup VONB_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Vonb.MOD_ID, "village_overhaul_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VILLAGE_HEART_BLOCK))
                    .displayName(Text.translatable("itemgroup.vonb.village_overhaul_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VILLAGE_HEART_BLOCK);
                    }).build());

    public static final ItemGroup VONB_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Vonb.MOD_ID, "village_overhaul_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.VILLAGE_SEED))
                    .displayName(Text.translatable("itemgroup.vonb.village_overhaul_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.VILLAGE_SEED);
                    }).build());

    public static void  registerItemGroups() {
        Vonb.LOGGER.info("Registering Item Groups for " + Vonb.MOD_ID);
    }
}
