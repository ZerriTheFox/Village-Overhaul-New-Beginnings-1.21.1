package net.zerrithefox.overhaulvillage.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulvillage.OverhaulVillage;

import java.util.List;

public class ModItems {

    public static final Item VILLAGE_SEED = registerItem("village_seed", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.vonb.village_seed"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WHEEL = registerItem("wheel", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OverhaulVillage.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OverhaulVillage.LOGGER.info("Registering Mod Items for " + OverhaulVillage.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(VILLAGE_SEED));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(WHEEL));
    }
}
