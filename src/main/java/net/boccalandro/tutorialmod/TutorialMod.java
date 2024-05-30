package net.boccalandro.tutorialmod;

import net.boccalandro.tutorialmod.block.ModBlocks;
import net.boccalandro.tutorialmod.item.ModItemGroups;
import net.boccalandro.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();
	}
}