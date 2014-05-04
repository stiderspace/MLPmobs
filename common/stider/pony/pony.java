package stider.pony;

import net.minecraft.creativetab.CreativeTabs;
import stider.pony.core.proxy.CommonProxy;
import stider.pony.creativetab.CreativeTabPONY;
import stider.pony.entity.ModEntity;
import stider.pony.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class pony {
	
	@Instance(Reference.MOD_ID)
	public static pony instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsPony= new CreativeTabPONY(CreativeTabs.getNextID(), Reference.MOD_ID);


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ModEntity.init();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
  
    	proxy.registerRenderThings();
    	
    }
    

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }

}

