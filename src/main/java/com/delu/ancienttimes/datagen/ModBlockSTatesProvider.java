package com.delu.ancienttimes.datagen;

import com.delu.ancienttimes.AncientTimes;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockSTatesProvider extends BlockStateProvider {

    public ModBlockSTatesProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, AncientTimes.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        
    }
}
