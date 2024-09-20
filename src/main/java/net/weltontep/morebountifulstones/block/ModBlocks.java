package net.weltontep.morebountifulstones.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.weltontep.morebountifulstones.MoreBountifulStones;

public class ModBlocks {
    public static final Block ANDESITE_COBBLED = registerBlock("andesite_cobbled",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_COBBLED_STAIRS = registerBlock("andesite_cobbled_stairs",
            new StairsBlock(ModBlocks.ANDESITE_COBBLED.getDefaultState(), AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_COBBLED_SLAB = registerBlock("andesite_cobbled_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_COBBLED_WALL = registerBlock("andesite_cobbled_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_WALL = registerBlock("andesite_polished_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_BUTTON = registerBlock("andesite_polished_button",
            new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().noCollision().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_PRESSURE_PLATE = registerBlock("andesite_polished_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_SMOOTH = registerBlock("andesite_smooth",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_SMOOTH_STAIRS = registerBlock("andesite_smooth_stairs",
            new StairsBlock(ModBlocks.ANDESITE_SMOOTH.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_SMOOTH_SLAB = registerBlock("andesite_smooth_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_SMOOTH_WALL = registerBlock("andesite_smooth_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICKS = registerBlock("andesite_polished_large_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_STAIRS = registerBlock("andesite_polished_large_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_SLAB = registerBlock("andesite_polished_large_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_WALL = registerBlock("andesite_polished_large_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICKS_CRACKED = registerBlock("andesite_polished_large_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_CRACKED_STAIRS = registerBlock("andesite_polished_large_brick_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_CRACKED_SLAB = registerBlock("andesite_polished_large_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_LARGE_BRICK_CRACKED_WALL = registerBlock("andesite_polished_large_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICKS = registerBlock("andesite_polished_square_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_STAIRS = registerBlock("andesite_polished_square_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_SQUARE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_SLAB = registerBlock("andesite_polished_square_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_WALL = registerBlock("andesite_polished_square_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICKS_CRACKED = registerBlock("andesite_polished_square_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_CRACKED_STAIRS = registerBlock("andesite_polished_square_brick_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_SQUARE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_CRACKED_SLAB = registerBlock("andesite_polished_square_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SQUARE_BRICK_CRACKED_WALL = registerBlock("andesite_polished_square_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILES = registerBlock("andesite_polished_tiles",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_STAIRS = registerBlock("andesite_polished_tile_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_TILES.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_SLAB = registerBlock("andesite_polished_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_WALL = registerBlock("andesite_polished_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILES_CRACKED = registerBlock("andesite_polished_tiles_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_CRACKED_STAIRS = registerBlock("andesite_polished_tile_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_TILES_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_CRACKED_SLAB = registerBlock("andesite_polished_tile_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_TILE_CRACKED_WALL = registerBlock("andesite_polished_tile_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SHINGLES = registerBlock("andesite_polished_shingles",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SHINGLE_STAIRS = registerBlock("andesite_polished_shingle_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_SHINGLES.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SHINGLE_SLAB = registerBlock("andesite_polished_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_SHINGLE_WALL = registerBlock("andesite_polished_shingle_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR = registerBlock("andesite_polished_carved_circular",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_STAIRS = registerBlock("andesite_polished_carved_circular_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_CIRCULAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_SLAB = registerBlock("andesite_polished_carved_circular_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_WALL = registerBlock("andesite_polished_carved_circular_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_PILLAR = registerBlock("andesite_polished_carved_circular_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_PILLAR_STAIRS = registerBlock("andesite_polished_carved_circular_pillar_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_CIRCULAR_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_PILLAR_SLAB = registerBlock("andesite_polished_carved_circular_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_CIRCULAR_PILLAR_WALL = registerBlock("andesite_polished_carved_circular_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT = registerBlock("andesite_polished_carved_dent",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_STAIRS = registerBlock("andesite_polished_carved_dent_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_DENT.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_SLAB = registerBlock("andesite_polished_carved_dent_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_WALL = registerBlock("andesite_polished_carved_dent_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_PILLAR = registerBlock("andesite_polished_carved_dent_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_PILLAR_STAIRS = registerBlock("andesite_polished_carved_dent_pillar_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_DENT_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_PILLAR_SLAB = registerBlock("andesite_polished_carved_dent_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_DENT_PILLAR_WALL = registerBlock("andesite_polished_carved_dent_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC = registerBlock("andesite_polished_carved_mosaic",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_STAIRS = registerBlock("andesite_polished_carved_mosaic_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_MOSAIC.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_SLAB = registerBlock("andesite_polished_carved_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_WALL = registerBlock("andesite_polished_carved_mosaic_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_PILLAR = registerBlock("andesite_polished_carved_mosaic_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_PILLAR_STAIRS = registerBlock("andesite_polished_carved_mosaic_pillar_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CARVED_MOSAIC_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_PILLAR_SLAB = registerBlock("andesite_polished_carved_mosaic_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CARVED_MOSAIC_PILLAR_WALL = registerBlock("andesite_polished_carved_mosaic_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT = registerBlock("andesite_polished_cut",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_STAIRS = registerBlock("andesite_polished_cut_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_SLAB = registerBlock("andesite_polished_cut_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_WALL = registerBlock("andesite_polished_cut_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_CRACKED = registerBlock("andesite_polished_cut_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_CRACKED_STAIRS = registerBlock("andesite_polished_cut_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_CRACKED_SLAB = registerBlock("andesite_polished_cut_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_CRACKED_WALL = registerBlock("andesite_polished_cut_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICKS = registerBlock("andesite_polished_cut_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_STAIRS = registerBlock("andesite_polished_cut_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_SLAB = registerBlock("andesite_polished_cut_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_WALL = registerBlock("andesite_polished_cut_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICKS_CRACKED = registerBlock("andesite_polished_cut_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_CRACKED_STAIRS = registerBlock("andesite_polished_cut_brick_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_CRACKED_SLAB = registerBlock("andesite_polished_cut_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_CRACKED_WALL = registerBlock("andesite_polished_cut_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICKS_BRAIDED = registerBlock("andesite_polished_cut_bricks_braided",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_BRAIDED_STAIRS = registerBlock("andesite_polished_cut_brick_braided_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_BRAIDED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_BRAIDED_SLAB = registerBlock("andesite_polished_cut_brick_braided_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_BRAIDED_WALL = registerBlock("andesite_polished_cut_brick_braided_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL = registerBlock("andesite_polished_cut_bricks_pinwheel",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_PINWHEEL_STAIRS = registerBlock("andesite_polished_cut_brick_pinwheel_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_PINWHEEL.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_PINWHEEL_SLAB = registerBlock("andesite_polished_cut_brick_pinwheel_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_PINWHEEL_WALL = registerBlock("andesite_polished_cut_brick_pinwheel_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICKS_ROAD = registerBlock("andesite_polished_cut_bricks_road",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_ROAD_STAIRS = registerBlock("andesite_polished_cut_brick_road_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_BRICKS_ROAD.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_ROAD_SLAB = registerBlock("andesite_polished_cut_brick_road_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_BRICK_ROAD_WALL = registerBlock("andesite_polished_cut_brick_road_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANKS = registerBlock("andesite_polished_cut_planks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_STAIRS = registerBlock("andesite_polished_cut_plank_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_SLAB = registerBlock("andesite_polished_cut_plank_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_WALL = registerBlock("andesite_polished_cut_plank_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANKS_CRACKED = registerBlock("andesite_polished_cut_planks_cracked",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_CRACKED_STAIRS = registerBlock("andesite_polished_cut_plank_cracked_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_PLANKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_CRACKED_SLAB = registerBlock("andesite_polished_cut_plank_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_CRACKED_WALL = registerBlock("andesite_polished_cut_plank_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_PILLAR = registerBlock("andesite_polished_cut_plank_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_PILLAR_STAIRS = registerBlock("andesite_polished_cut_plank_pillar_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_PLANK_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_PILLAR_SLAB = registerBlock("andesite_polished_cut_plank_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_PLANK_PILLAR_WALL = registerBlock("andesite_polished_cut_plank_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILES = registerBlock("andesite_polished_cut_tiles",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_STAIRS = registerBlock("andesite_polished_cut_tile_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_TILES.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_SLAB = registerBlock("andesite_polished_cut_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_WALL = registerBlock("andesite_polished_cut_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILES_CHECKERED = registerBlock("andesite_polished_cut_tiles_checkered",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_CHECKERED_STAIRS = registerBlock("andesite_polished_cut_tile_checkered_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_TILES_CHECKERED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_CHECKERED_SLAB = registerBlock("andesite_polished_cut_tile_checkered_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_CHECKERED_WALL = registerBlock("andesite_polished_cut_tile_checkered_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_PILLAR = registerBlock("andesite_polished_cut_tile_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_PILLAR_STAIRS = registerBlock("andesite_polished_cut_tile_pillar_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CUT_TILE_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_PILLAR_SLAB = registerBlock("andesite_polished_cut_tile_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CUT_TILE_PILLAR_WALL = registerBlock("andesite_polished_cut_tile_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_TWISTED = registerBlock("andesite_polished_chiseled_twisted",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_TWISTED_STAIRS = registerBlock("andesite_polished_chiseled_twisted_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CHISELED_TWISTED.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_TWISTED_SLAB = registerBlock("andesite_polished_chiseled_twisted_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_TWISTED_WALL = registerBlock("andesite_polished_chiseled_twisted_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_GREEK = registerBlock("andesite_polished_chiseled_greek",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_GREEK_STAIRS = registerBlock("andesite_polished_chiseled_greek_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CHISELED_GREEK.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_GREEK_SLAB = registerBlock("andesite_polished_chiseled_greek_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_GREEK_WALL = registerBlock("andesite_polished_chiseled_greek_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_ORNATE = registerBlock("andesite_polished_chiseled_ornate",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_ORNATE_STAIRS = registerBlock("andesite_polished_chiseled_ornate_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CHISELED_ORNATE.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_ORNATE_SLAB = registerBlock("andesite_polished_chiseled_ornate_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_ORNATE_WALL = registerBlock("andesite_polished_chiseled_ornate_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_PYRAMID = registerBlock("andesite_polished_chiseled_pyramid",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_PYRAMID_STAIRS = registerBlock("andesite_polished_chiseled_pyramid_stairs",
            new StairsBlock(ModBlocks.ANDESITE_POLISHED_CHISELED_PYRAMID.getDefaultState(), AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_PYRAMID_SLAB = registerBlock("andesite_polished_chiseled_pyramid_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ANDESITE_POLISHED_CHISELED_PYRAMID_WALL = registerBlock("andesite_polished_chiseled_pyramid_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreBountifulStones.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreBountifulStones.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreBountifulStones.LOGGER.info("Registering Mod Blocks for " + MoreBountifulStones.MOD_ID);
    }
}
