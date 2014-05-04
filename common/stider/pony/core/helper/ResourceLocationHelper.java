package stider.pony.core.helper;

import net.minecraft.util.ResourceLocation;
import stider.pony.lib.Reference;

public class ResourceLocationHelper {
	
	    public static ResourceLocation getResourceLocation(String modId, String path) {

	        return new ResourceLocation(modId, path);
	    }

	    public static ResourceLocation getResourceLocation(String path) {

	        return getResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	    }
}



