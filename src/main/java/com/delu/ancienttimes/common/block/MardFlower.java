package com.delu.ancienttimes.common.block;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

public class MardFlower extends CropBlock {
    public MardFlower(Properties p_52247_) {
        super(p_52247_);
    }

    @NotNull
    @Override
    protected IntegerProperty getAgeProperty() {
        return BlockStateProperties.AGE_3;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @ParametersAreNonnullByDefault
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.AGE_3);
    }

    @ParametersAreNonnullByDefault
    @Override
    protected int getBonemealAgeIncrease(Level p_52262_) {
        return 1;
    }
}
