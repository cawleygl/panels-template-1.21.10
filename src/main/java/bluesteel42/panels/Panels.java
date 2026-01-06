package bluesteel42.panels;

import bluesteel42.panels.block.CombinedWorldgenModBlocks;
import bluesteel42.panels.block.ModBlocks;
import bluesteel42.panels.block.NetherHyphaeModBlocks;
import bluesteel42.panels.block.OverworldHyphaeModBlocks;
import bluesteel42.panels.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Panels implements ModInitializer {
	public static final String MOD_ID = "panels";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.initialize();
		CombinedWorldgenModBlocks.initialize();
		NetherHyphaeModBlocks.initialize();
		OverworldHyphaeModBlocks.initialize();
		ModRegistries.registerFlammables();
		ModRegistries.registerFuels();
		ModRegistries.registerCompostables();
		ModRegistries.registerCauldronBehavior();
		LOGGER.info("Hello Fabric world!");
	}
}