package net.pumpkin.pristineworlds.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.entity.custom.EeperEntity;

public class EeperRenderer extends MobRenderer<EeperEntity, EeperModel<EeperEntity>> {
    public EeperRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new EeperModel<>(pContext.bakeLayer(ModModelLayers.EEPER_LAYER)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(EeperEntity pEntity) {
        return new ResourceLocation(PristineWorlds.MOD_ID, "textures/entity/eeper.png");
    }

    @Override
    public void render(EeperEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
