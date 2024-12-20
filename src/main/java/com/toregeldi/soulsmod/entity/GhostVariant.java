package com.toregeldi.soulsmod.entity;

import java.util.Arrays;
import java.util.Comparator;

public enum GhostVariant {
    WHITE(0),
    BLUE(1);

    private static final GhostVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(GhostVariant::getId)).toArray(GhostVariant[]::new);
    private final int id;

    GhostVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static GhostVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
