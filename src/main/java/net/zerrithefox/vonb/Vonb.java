package net.zerrithefox.vonb;

import net.fabricmc.api.ModInitializer;

import net.zerrithefox.vonb.block.ModBlocks;
import net.zerrithefox.vonb.items.ModItemGroups;
import net.zerrithefox.vonb.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vonb implements ModInitializer {
	public static final String MOD_ID = "vonb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}