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
    public RenderPony(ModelPony modelPony, float par2)
    {
        super(modelPony, par2);
    }

    protected ResourceLocation getPonyTextures(EntityPony par1EntityPony)
    {
        return Textures.MODEL_PONY;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getPonyTextures((EntityPony)par1Entity);
    }
}
