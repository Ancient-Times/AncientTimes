package com.delu.ancienttimes.datagen;

import com.delu.ancienttimes.AncientTimes;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.block;

public class ModBlockSTatesProvider extends BlockStateProvider {

    public ModBlockSTatesProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, AncientTimes.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    protected void makeMardFlowerModel(Block block) {
        getVariantBuilder(block).forAllStates(state -> {
            String name = ForgeRegistries.BLOCKS.getKey(block).getPath();
            int age = state.getValue(BlockStateProperties.AGE_3);
            String modelName = ForgeRegistries.BLOCKS.getKey(block).getPath();
        });
    }

}
