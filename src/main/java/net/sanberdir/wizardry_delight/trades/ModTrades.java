package net.sanberdir.wizardry_delight.trades;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.sanberdir.wizardry_delight.init.InitItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModTrades {
    @SubscribeEvent
    public static void registerWanderingTrades(WandererTradesEvent event) {
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),
                new ItemStack(InitItems.SILVERAN.get()), 20, 10, 0f));

        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(InitItems.SILVERAN.get(), 1),
                new ItemStack(Items.EMERALD, 8), 10, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 30),
                        new ItemStack(InitItems.HAT_HELMET_CLEAR.get()), 5, 30, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 30),
                        new ItemStack(InitItems.SILVERAN.get()), 20, 10, 0f));

        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(InitItems.SILVERAN.get(), 1),
                        new ItemStack(Items.EMERALD, 12), 10, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 45),
                        new ItemStack(InitItems.HAT_HELMET_CLEAR.get()), 5, 30, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 35),
                        new ItemStack(InitItems.SILVERAN.get()), 20, 10, 0f));

        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(InitItems.SILVERAN.get(), 1),
                        new ItemStack(Items.EMERALD, 9), 10, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 40),
                        new ItemStack(InitItems.HAT_HELMET_CLEAR.get()), 5, 30, 0f));
    }
}