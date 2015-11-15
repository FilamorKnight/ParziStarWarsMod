// Date: 5/31/2015 5:12:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.parzi.starwarsmod.rendering.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWookiee extends ModelBase
{
	private static float animScale = 1;
	// fields
	ModelRenderer BandolierBaseF;
	ModelRenderer BandolierF1;
	ModelRenderer BandolierF2;
	ModelRenderer BandolierF3;
	ModelRenderer BandolierF4;
	ModelRenderer BandolierBaseB;
	ModelRenderer BandolierB1;
	ModelRenderer BandolierB2;
	ModelRenderer BandolierB3;
	ModelRenderer BandolierB4;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public ModelWookiee()
	{
		textureWidth = 64;
		textureHeight = 64;

		BandolierBaseF = new ModelRenderer(this, 0, 61);
		BandolierBaseF.addBox(0F, 0F, 0F, 13, 1, 1);
		BandolierBaseF.setRotationPoint(-5F, 6.2F, -3.7F);
		BandolierBaseF.setTextureSize(64, 64);
		BandolierBaseF.mirror = true;
		setRotation(BandolierBaseF, 0F, 0F, -0.7853982F);
		BandolierF1 = new ModelRenderer(this, 42, 38);
		BandolierF1.addBox(-0.5F, 1.5F, 0F, 2, 2, 1);
		BandolierF1.setRotationPoint(4.6F, -3.4F, -4F);
		BandolierF1.setTextureSize(64, 64);
		BandolierF1.mirror = true;
		setRotation(BandolierF1, 0F, 0F, 0.7853982F);
		BandolierF2 = new ModelRenderer(this, 42, 42);
		BandolierF2.addBox(-0.5F, 0.5F, 0F, 2, 2, 1);
		BandolierF2.setRotationPoint(-0.4F, 1.6F, -4F);
		BandolierF2.setTextureSize(64, 64);
		BandolierF2.mirror = true;
		setRotation(BandolierF2, 0F, 0F, 0.7853982F);
		BandolierF3 = new ModelRenderer(this, 42, 46);
		BandolierF3.addBox(-0.5F, 0.5F, 0F, 2, 2, 1);
		BandolierF3.setRotationPoint(1.6F, -0.4F, -4F);
		BandolierF3.setTextureSize(64, 64);
		BandolierF3.mirror = true;
		setRotation(BandolierF3, 0F, 0F, 0.7853982F);
		BandolierF4 = new ModelRenderer(this, 42, 50);
		BandolierF4.addBox(-0.5F, 0.5F, 0F, 2, 2, 1);
		BandolierF4.setRotationPoint(-2.6F, 3.7F, -4F);
		BandolierF4.setTextureSize(64, 64);
		BandolierF4.mirror = true;
		setRotation(BandolierF4, 0F, 0F, 0.7853982F);
		BandolierBaseB = new ModelRenderer(this, 29, 61);
		BandolierBaseB.addBox(0F, 0F, 0F, 13, 1, 1);
		BandolierBaseB.setRotationPoint(-5F, 6.2F, 2.7F);
		BandolierBaseB.setTextureSize(64, 64);
		BandolierBaseB.mirror = true;
		setRotation(BandolierBaseB, 0F, 0F, -0.7853982F);
		BandolierB1 = new ModelRenderer(this, 42, 54);
		BandolierB1.addBox(-0.5F, 0.5F, 0F, 2, 2, 1);
		BandolierB1.setRotationPoint(3.8F, -2.5F, 3F);
		BandolierB1.setTextureSize(64, 64);
		BandolierB1.mirror = true;
		setRotation(BandolierB1, 0F, 0F, 0.7853982F);
		BandolierB2 = new ModelRenderer(this, 49, 38);
		BandolierB2.addBox(1.5F, 1.5F, 0F, 2, 2, 1);
		BandolierB2.setRotationPoint(-1.1F, -0.5F, 3F);
		BandolierB2.setTextureSize(64, 64);
		BandolierB2.mirror = true;
		setRotation(BandolierB2, 0F, 0F, 0.7853982F);
		BandolierB3 = new ModelRenderer(this, 49, 42);
		BandolierB3.addBox(-1.5F, -1.4F, 0F, 2, 2, 1);
		BandolierB3.setRotationPoint(1.1F, 1.6F, 3F);
		BandolierB3.setTextureSize(64, 64);
		BandolierB3.mirror = true;
		setRotation(BandolierB3, 0F, 0F, 0.7853982F);
		BandolierB4 = new ModelRenderer(this, 49, 46);
		BandolierB4.addBox(-4.5F, 4.5F, 0F, 2, 2, 1);
		BandolierB4.setRotationPoint(3.2F, 3.7F, 3F);
		BandolierB4.setTextureSize(64, 64);
		BandolierB4.mirror = true;
		setRotation(BandolierB4, 0F, 0F, 0.7853982F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 9, 8);
		head.setRotationPoint(0F, -4F, 0F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 0, 19);
		body.addBox(-5F, 0F, -2F, 10, 14, 6);
		body.setRotationPoint(0F, -3F, -1F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 0, 40);
		rightarm.addBox(-3F, -2F, -2F, 4, 14, 6);
		rightarm.setRotationPoint(-6F, -1F, -1F);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 21, 40);
		leftarm.addBox(-1F, -2F, -2F, 4, 14, 6);
		leftarm.setRotationPoint(6F, -1F, -1F);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 33, 0);
		rightleg.addBox(-2F, 0F, -2F, 5, 13, 5);
		rightleg.setRotationPoint(-3F, 11F, -0.5F);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 33, 19);
		leftleg.addBox(-2F, 0F, -2F, 5, 13, 5);
		leftleg.setRotationPoint(2F, 11F, -0.5F);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BandolierBaseF.render(f5);
		BandolierF1.render(f5);
		BandolierF2.render(f5);
		BandolierF3.render(f5);
		BandolierF4.render(f5);
		BandolierBaseB.render(f5);
		BandolierB1.render(f5);
		BandolierB2.render(f5);
		BandolierB3.render(f5);
		BandolierB4.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
		head.rotateAngleY = f3 / (180F / (float)Math.PI);
		head.rotateAngleX = f4 / (180F / (float)Math.PI);

		rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * animScale * f1 * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * animScale * f1 * 0.5F;
		rightarm.rotateAngleZ = 0.0F;
		leftarm.rotateAngleZ = 0.0F;

		rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * animScale * f1;
		leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * animScale * f1;
		rightleg.rotateAngleY = 0.0F;
		leftleg.rotateAngleY = 0.0F;
	}

}