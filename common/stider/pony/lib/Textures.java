package stider.pony.lib;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import stider.pony.core.helper.ResourceLocationHelper;

public class Textures {
	
	 // Base file paths
    public static final String MODEL_SHEET_LOCATION = "textures/models/";
    public static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String EFFECTS_LOCATION = "textures/effects/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    
    // Model textures
    public static final ResourceLocation MODEL_PONY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "pony.png");
 

}
