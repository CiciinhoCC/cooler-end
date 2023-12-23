package com.ciciinho.coolerend.item.client;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.item.custom.ArmoredElytraItem;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.io.LineIterator;
import software.bernie.geckolib.model.GeoModel;

public class ArmoredElytraModel extends GeoModel<ArmoredElytraItem> {




    @Override
    public ResourceLocation getModelResource(ArmoredElytraItem animatable) {
        return new ResourceLocation(CoolerEnd.MOD_ID, "geo/armored_elytra.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArmoredElytraItem animatable) {
        return new ResourceLocation(CoolerEnd.MOD_ID, "textures/armor/armored_elytra.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArmoredElytraItem animatable) {
        return new ResourceLocation(CoolerEnd.MOD_ID, "animations/armored_elytra.animation.json");
    }
}
