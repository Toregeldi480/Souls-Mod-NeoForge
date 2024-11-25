package com.toregeldi.soulsmod.block.inventory;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(BuiltInRegistries.MENU, SoulsMod.MOD_ID);

    public static final Supplier<MenuType<AutohammerMenu>> AUTOHAMMER_MENU = MENUS.register("autohammer",
            () -> new MenuType<>(AutohammerMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
