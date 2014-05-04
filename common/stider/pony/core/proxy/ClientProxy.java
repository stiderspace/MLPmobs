package stider.pony.core.proxy;

import stider.pony.client.model.ModelPony;
import stider.pony.client.render.entity.RenderPony;
import stider.pony.entity.EntityPony;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerRenderThings() {
    	
    	RenderingRegistry.registerEntityRenderingHandler(EntityPony.class, new RenderPony(new ModelPony(), 1.5F));
    	
    	
        
    }
   
}
