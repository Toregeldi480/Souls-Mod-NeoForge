//package com.toregeldi.soulsmod.block.custom;
//
//import com.mojang.serialization.MapCodec;
//import com.toregeldi.soulsmod.block.entity.AutohammerBlockEntity;
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.BaseEntityBlock;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.RenderShape;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.phys.shapes.CollisionContext;
//import net.minecraft.world.phys.shapes.VoxelShape;
//import org.jetbrains.annotations.Nullable;
//
//public class AutohammerBlock extends BaseEntityBlock {
//    public static final VoxelShape SHAPE = Block.box(0,0,0,26,16, 16);
//
//    public AutohammerBlock(Properties properties) {
//        super(properties);
//    }
//
//    @Nullable
//    @Override
//    protected MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
//        BlockEntity blockentity = level.getBlockEntity(pos);
//        return blockentity instanceof MenuProvider ? (MenuProvider)blockentity : null;
//    }
//
//    @Override
//    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos position, CollisionContext collisionContext) {
//        return SHAPE;
//    }
//
//    @Override
//    public RenderShape getRenderShape(BlockState state) {
//        return RenderShape.MODEL;
//    }
//
//    @Override
//    protected MapCodec<? extends BaseEntityBlock> codec() {
//        return null;
//    }
//
//    @Override
//    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//        return new AutohammerBlockEntity(pos, state);
//    }
//}
