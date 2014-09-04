package mod.impcraft.common;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModImpCraft.MODID, version = ModImpCraft.VERSION)
public class ModImpCraft {
	public static final String MODID = "impcraft", VERSION = "0.1";

	@Instance(MODID)
	public static ModImpCraft instance;

	public ModImpCraft() {

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// TODO pre init stuff
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// TODO init stuff
	}
}
