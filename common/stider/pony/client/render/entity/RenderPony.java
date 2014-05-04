package stider.pony.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import stider.pony.client.model.ModelPony;
import stider.pony.entity.EntityPony;
import stider.pony.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPony extends RenderLiving
{
    private static final ResourceLocation PonyTextures = new ResourceLocation(Textures.MODEL_SHEET_LOCATION + "pony.png");

    public RenderPony(ModelPony par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getPonyTextures(EntityPony par1EntityPony)
    {
        return PonyTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getPonyTextures((EntityPony)par1Entity);
    }
}
