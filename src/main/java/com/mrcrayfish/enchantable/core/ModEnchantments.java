package com.mrcrayfish.enchantable.core;

import com.mrcrayfish.enchantable.Reference;
import com.mrcrayfish.enchantable.enchantment.CultivatorEnchantment;
import com.mrcrayfish.enchantable.enchantment.IronSkullEnchantment;
import com.mrcrayfish.enchantable.enchantment.ReplantingEnchantment;
import com.mrcrayfish.enchantable.enchantment.StompingEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.item.HoeItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Author: MrCrayfish
 */
@ObjectHolder(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEnchantments
{
    public static final Enchantment STOMPING = null;
    public static final Enchantment IRON_SKULL = null;
    public static final Enchantment REPLANTING = null;
    public static final Enchantment CULTIVATOR = null;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Enchantment> event)
    {
        event.getRegistry().register(new StompingEnchantment());
        event.getRegistry().register(new IronSkullEnchantment());
        event.getRegistry().register(new ReplantingEnchantment());
        event.getRegistry().register(new CultivatorEnchantment());
    }
}
