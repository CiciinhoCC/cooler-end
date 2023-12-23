package com.ciciinho.coolerend.item.client;

import com.ciciinho.coolerend.item.custom.ArmoredElytraItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArmoredElytraRenderer extends GeoArmorRenderer<ArmoredElytraItem> {
    public ArmoredElytraRenderer() {
        super(new ArmoredElytraModel());
    }
}
