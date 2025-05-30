package net.casper.vitacarnis;

import net.casper.vitacarnis.block.ModBlocks;
import net.casper.vitacarnis.item.ModItemGroups;
import net.casper.vitacarnis.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VitaCarnis implements ModInitializer {

	public static final String MOD_ID = "vitacarnis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}