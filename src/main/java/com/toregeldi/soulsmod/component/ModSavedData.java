package com.toregeldi.soulsmod.component;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

public class ModSavedData extends SavedData {
    public ModSavedData create() {
        return new ModSavedData();
    }

    public ModSavedData load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        ModSavedData data = this.create();

        return data;
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider registries) {
        return tag;
    }

    public void change() {
        this.setDirty();
    }

    MinecraftServer.overworld().ModSavedData
}
