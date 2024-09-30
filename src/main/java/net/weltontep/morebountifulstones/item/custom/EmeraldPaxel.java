package net.weltontep.morebountifulstones.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.weltontep.morebountifulstones.block.ModBlocks;

import java.util.Map;

import static org.apache.logging.log4j.ThreadContext.containsKey;

public class EmeraldPaxel extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    ModBlocks.ANDESITE_POLISHED_CHISELED_ORNATE, ModBlocks.ANDESITE_POLISHED_CHISELED_ORNATE2,
                    ModBlocks.ANDESITE_POLISHED_CHISELED_ORNATE2, ModBlocks.ANDESITE_POLISHED_CHISELED_ORNATE,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_BRAIDED, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_BRAIDED2,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_BRAIDED2, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_BRAIDED,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL2,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL2, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_ROAD, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_ROAD2,
                    ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_ROAD2, ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_ROAD,
                    ModBlocks.ANDESITE_POLISHED_PILLAR, ModBlocks.ANDESITE_POLISHED_PILLAR2,
                    ModBlocks.ANDESITE_POLISHED_PILLAR2, ModBlocks.ANDESITE_POLISHED_PILLAR
            );

    public EmeraldPaxel(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS);

            }
        }

        return ActionResult.SUCCESS;
    }
}
