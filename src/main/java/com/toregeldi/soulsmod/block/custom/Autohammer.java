//package com.toregeldi.soulsmod.block.custom;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Mirror;
//import net.minecraft.world.level.block.Rotation;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.properties.DirectionProperty;
//import net.minecraft.world.phys.shapes.CollisionContext;
//import net.minecraft.world.phys.shapes.VoxelShape;
//
//public class Autohammer extends Block {
//    private static final DirectionProperty FACING = DirectionProperty.create("facing");
//    private static final VoxelShape SHAPE = box(0, 0, 0, 16, 6, 23);
//
//    public Autohammer(Properties properties) {
//        super(properties);
//    }
//
//
//    @Override
//    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
//        return SHAPE;
//    }
//
//    @Override
//    protected BlockState mirror(BlockState state, Mirror mirror) {
//        return super.mirror(state, mirror);
//    }
//
//    @Override
//    protected BlockState rotate(BlockState state, Rotation rotation) {
//        return super.rotate(state, rotation);
//    }
//}
