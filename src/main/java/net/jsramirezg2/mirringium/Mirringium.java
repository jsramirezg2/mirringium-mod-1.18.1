package net.jsramirezg2.mirringium;

import net.fabricmc.api.ModInitializer;
import net.jsramirezg2.mirringium.block.ModBlocks;
import net.jsramirezg2.mirringium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mirringium implements ModInitializer {

	public static final String MOD_ID = "mirringium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
