package net.sanberdir.wizardry_delight.entity.sign;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.sanberdir.wizardry_delight.init.InitBlocks;
import net.sanberdir.wizardry_delight.init.customblock.ModEntitiesBlock;
import net.sanberdir.wizardry_delight.init.customblock.WDSpawnerEntity;

public class ModBlockEntities {
    public static BlockEntityType<ModSignBlockEntity> SIGN_ENTITY_TYPE = BlockEntityType.Builder.of(ModSignBlockEntity::new, ModEntitiesBlock.APPLE_SIGN, ModEntitiesBlock.APPLE_WALL_SIGN).build(null);
    public static BlockEntityType<WDSpawnerEntity> SPAWNER_MOD_TYPE = BlockEntityType.Builder.of(WDSpawnerEntity::new, InitBlocks.WD_SPAWNER.get()).build(null);

}
