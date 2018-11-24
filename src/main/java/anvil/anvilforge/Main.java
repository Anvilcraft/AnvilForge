package anvil.anvilforge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptedMinecraftVersions="[1.12.2]")
public class Main {
	public static final String MODID = "anvilforge";
	public static final String VERSION = "1.0";
	public static final String MODNAME = "AnvilForge";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
