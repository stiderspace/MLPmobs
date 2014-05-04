package stider.pony.entity;

import stider.pony.pony;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntity {
	
	
	public static void init()
	{
		createEntity(EntityPony.class, "Pony", 0xFF0000, 0xFFCC00);		
	}
	

	
    public static void createEntity(Class<EntityPony> entityClass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, pony.instance, 32, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityEggInfo(randomId, solidColor, spotColor));
        
        
    }
    
}