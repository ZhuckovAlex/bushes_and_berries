package net.sanberdir.wizardry_delight.init.customblock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.InitBlocks;

public class WDBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WizardryDelight.MOD_ID);
    public static final RegistryObject<BlockEntityType<?>> ROSE_OF_THE_MURDERER2 = register("rose_of_the_murderer2", InitBlocks.ROSE_OF_THE_MURDERER2, StombleRose2Entity::new);
    public static final RegistryObject<BlockEntityType<?>> WD_SPAWNER = register("wd_spawner", InitBlocks.WD_SPAWNER, WDSpawnerEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return BLOCK_ENTITY_TYPES.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
