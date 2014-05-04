package stider.pony.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPony extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer frontlegleft;
    ModelRenderer backlegleft;
    ModelRenderer backlegright;
    ModelRenderer frontlegright;
    ModelRenderer muzzle;
    ModelRenderer neck;
    ModelRenderer earleft;
    ModelRenderer earright;
    ModelRenderer tail2;
    ModelRenderer tail1;
    ModelRenderer rightwing1;
    ModelRenderer rightwing2;
    ModelRenderer leftwing1;
    ModelRenderer leftwing2;
    ModelRenderer head;
    ModelRenderer hair;
  
  public ModelPony()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 8, 8, 16);
      body.setRotationPoint(-4F, 4F, -7F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);

      frontlegleft = new ModelRenderer(this, 0, 24);
      frontlegleft.addBox(0F, 0F, 0F, 4, 12, 4);
      frontlegleft.setRotationPoint(0F, 12F, -7F);
      frontlegleft.setTextureSize(128, 64);
      frontlegleft.mirror = true;
      setRotation(frontlegleft, 0F, 0F, 0F);
      frontlegleft.mirror = false;
      
      backlegleft = new ModelRenderer(this, 0, 24);
      backlegleft.addBox(0F, 0F, 0F, 4, 12, 4);
      backlegleft.setRotationPoint(0F, 12F, 5F);
      backlegleft.setTextureSize(128, 64);
      backlegleft.mirror = true;
      setRotation(backlegleft, 0F, 0F, 0F);
      backlegleft.mirror = false;
      
      backlegright = new ModelRenderer(this, 0, 24);
      backlegright.addBox(0F, 0F, 0F, 4, 12, 4);
      backlegright.setRotationPoint(-4F, 12F, 5F);
      backlegright.setTextureSize(128, 64);
      backlegright.mirror = true;
      setRotation(backlegright, 0F, 0F, 0F);
      
      frontlegright = new ModelRenderer(this, 0, 24);
      frontlegright.addBox(0F, 0F, 0F, 4, 12, 4);
      frontlegright.setRotationPoint(-4F, 12F, -7F);
      frontlegright.setTextureSize(128, 64);
      frontlegright.mirror = true;
      setRotation(frontlegright, 0F, 0F, 0F);
      
      muzzle = new ModelRenderer(this, 101, 11);
      muzzle.addBox(-2F, -3F, -8F, 4, 3, 2);
      muzzle.setRotationPoint(0F, 2F, -5F);
      muzzle.setTextureSize(128, 64);
      muzzle.mirror = true;
      setRotation(muzzle, 0F, 0F, 0F);
      
      neck = new ModelRenderer(this, 32, 0);
      neck.addBox(0F, 0F, 0F, 4, 5, 4);
      neck.setRotationPoint(-2F, 1F, -8F);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, 0.2792527F, 0F, 0F);
      
      earleft = new ModelRenderer(this, 101, 7);
      earleft.addBox(2F, -10F, -1F, 2, 2, 2);
      earleft.setRotationPoint(0F, 2F, -5F);
      earleft.setTextureSize(128, 64);
      earleft.mirror = true;
      setRotation(earleft, 0F, 0F, 0F)
      ;
      earright = new ModelRenderer(this, 101, 7);
      earright.addBox(-4F, -10F, -1F, 2, 2, 2);
      earright.setRotationPoint(0F, 2F, -5F);
      earright.setTextureSize(128, 64);
      earright.mirror = true;
      setRotation(earright, 0F, 0F, 0F);
      
      tail2 = new ModelRenderer(this, 48, 9);
      tail2.addBox(0F, 0F, 0F, 4, 12, 4);
      tail2.setRotationPoint(-2F, 0F, 11F);
      tail2.setTextureSize(128, 64);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
      
      tail1 = new ModelRenderer(this, 48, 0);
      tail1.addBox(0F, 0F, 0F, 2, 2, 7);
      tail1.setRotationPoint(-1F, 5F, 7F);
      tail1.setTextureSize(128, 64);
      tail1.mirror = true;
      setRotation(tail1, 0.7853982F, 0F, 0F);
      
      rightwing1 = new ModelRenderer(this, 16, 24);
      rightwing1.addBox(0F, 0F, 0F, 2, 6, 6);
      rightwing1.setRotationPoint(4F, 5F, -3F);
      rightwing1.setTextureSize(128, 64);
      rightwing1.mirror = true;
      setRotation(rightwing1, 0F, 0F, 0F);
      
      rightwing2 = new ModelRenderer(this, 26, 24);
      rightwing2.addBox(0F, 0F, 0F, 2, 2, 2);
      rightwing2.setRotationPoint(4F, 7F, 3F);
      rightwing2.setTextureSize(128, 64);
      rightwing2.mirror = true;
      setRotation(rightwing2, 0F, 0F, 0F);
      
      leftwing1 = new ModelRenderer(this, 16, 24);
      leftwing1.addBox(0F, 0F, 0F, 2, 6, 6);
      leftwing1.setRotationPoint(-6F, 5F, -3F);
      leftwing1.setTextureSize(128, 64);
      leftwing1.mirror = true;
      setRotation(leftwing1, 0F, 0F, 0F);
      
      leftwing2 = new ModelRenderer(this, 26, 24);
      leftwing2.addBox(0F, 0F, 0F, 2, 2, 2);
      leftwing2.setRotationPoint(-6F, 7F, 3F);
      leftwing2.setTextureSize(128, 64);
      leftwing2.mirror = true;
      setRotation(leftwing2, 0F, 0F, 0F);
      
      head = new ModelRenderer(this, 69, 0);
      head.addBox(-4F, -8F, -7F, 8, 8, 8);
      head.setRotationPoint(0F, 2F, -5F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      hair = new ModelRenderer(this, 69, 16);
      hair.addBox(-5F, -9F, -8F, 10, 10, 10);
      hair.setRotationPoint(0F, 2F, -5F);
      hair.setTextureSize(128, 64);
      hair.mirror = true;
      setRotation(hair, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    frontlegleft.render(f5);
    backlegleft.render(f5);
    backlegright.render(f5);
    frontlegright.render(f5);
    muzzle.render(f5);
    neck.render(f5);
    earleft.render(f5);
    earright.render(f5);
    tail2.render(f5);
    tail1.render(f5);
    rightwing1.render(f5);
    rightwing2.render(f5);
    leftwing1.render(f5);
    leftwing2.render(f5);
    head.render(f5);
    hair.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
		  
		  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		  this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
		  this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
		  this.hair.rotateAngleX = f4 / (180F / (float)Math.PI);
		  this.hair.rotateAngleY = f3 / (180F / (float)Math.PI);
		  this.earleft.rotateAngleX = f4 / (180F / (float)Math.PI);
		  this.earleft.rotateAngleY = f3 / (180F / (float)Math.PI);
		  this.earright.rotateAngleX = f4 / (180F / (float)Math.PI);
		  this.earright.rotateAngleY = f3 / (180F / (float)Math.PI);
		  this.muzzle.rotateAngleX = f4 / (180F / (float)Math.PI);
		  this.muzzle.rotateAngleY = f3 / (180F / (float)Math.PI);
		  this.backlegleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		  this.backlegright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		  this.frontlegleft.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		  this.frontlegright.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	    
   }
}
