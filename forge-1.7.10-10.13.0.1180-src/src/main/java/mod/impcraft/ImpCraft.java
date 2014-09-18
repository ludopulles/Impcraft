package mod.impcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import mod.impcraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=ImpCraft.MODID, name="ImpCraft", version=ImpCraft.VERSION)
public class ImpCraft {
	
	public static final String MODID = "impcraft", VERSION = "0.0.1";
	
	public static Block buildBlock;
	
	@Instance
	public static ImpCraft instance;
	
	@SidedProxy(clientSide="mod.impcraft.proxy.ClientProxy", serverSide="mod.impcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		buildBlock =  new BuildBlock(Material.wood);
		
		registerBlock(buildBlock, "buildBlock");
	
		NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
	}
	
	private void registerBlock(Block block, String name) {
		block.setBlockName(MODID + "_" + name);
		block.setBlockTextureName(MODID + ":" + name);
		GameRegistry.registerBlock(block, name);
	
	}
	
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
