package net.zerrithefox.overhaulvillage;

import net.fabricmc.api.ModInitializer;

import net.zerrithefox.overhaulvillage.block.ModBlocks;
import net.zerrithefox.overhaulvillage.items.ModItemGroups;
import net.zerrithefox.overhaulvillage.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverhaulVillage implements ModInitializer {
	public static final String MOD_ID = "overhaul-village";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}