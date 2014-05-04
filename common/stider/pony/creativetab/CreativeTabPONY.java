package stider.pony.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class CreativeTabPONY extends CreativeTabs {

	public CreativeTabPONY(int Par1, String Label)
    {
        super(Label);
    }

    
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.appleGold);
    }
    
   // Setting Name
    
    public String getTranslatedTabLabel()
    {
        return "Utilities Blocks";
    }
}


