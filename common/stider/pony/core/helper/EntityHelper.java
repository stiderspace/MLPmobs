package stider.pony.core.helper;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper {
	 public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
	        int id = EntityRegistry.findGlobalUniqueEntityId();

	        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
	        EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
	     }
}
