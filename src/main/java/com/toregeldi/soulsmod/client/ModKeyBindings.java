package com.toregeldi.soulsmod.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.common.util.Lazy;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {
    public static final Lazy<KeyMapping> RAGE_KEY = Lazy.of(() -> new KeyMapping(
            "key." + SoulsMod.MOD_ID + ".rage",
            KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_V,
            "key.categories.gameplay"
    ));
    public static final Lazy<KeyMapping> ADRENALINE_KEY = Lazy.of(() -> new KeyMapping(
            "key." + SoulsMod.MOD_ID + ".adrenaline",
            KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_N,
            "key.categories.gameplay"
    ));
}
