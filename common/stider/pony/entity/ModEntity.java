package stider.pony.entity;

import stider.pony.core.helper.EntityHelper;

public class ModEntity {
	
	public static void init(){
		EntityHelper.registerEntity(EntityPony.class, "Pony", 0xFF0000, 0xFFCC00);	
	}
}