package net.zerrithefox.vonb.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zerrithefox.vonb.Vonb;

public class ModItems {

    public static final Item VILLAGE_HEART = registerItem("village_heart", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Vonb.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Vonb.LOGGER.info("Registering Mod Items for " + Vonb.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(VILLAGE_HEART);
        });
    }
}
