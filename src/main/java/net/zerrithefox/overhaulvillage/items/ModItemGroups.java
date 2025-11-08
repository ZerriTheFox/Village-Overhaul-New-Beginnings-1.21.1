package net.zerrithefox.overhaulvillage.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulvillage.OverhaulVillage;
import net.zerrithefox.overhaulvillage.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup Village = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulVillage.MOD_ID, "village_overhaul_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.VILLAGE_SEED))
                    .displayName(Text.translatable("itemgroup.vonb.village_overhaul_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.VILLAGE_SEED);
                        entries.add(ModItems.WHEEL);
                        entries.add(ModBlocks.VILLAGE_HEART_BLOCK);
                    }).build());

    public static void  registerItemGroups() {
        OverhaulVillage.LOGGER.info("Registering Item Groups for " + OverhaulVillage.MOD_ID);
    }
}
