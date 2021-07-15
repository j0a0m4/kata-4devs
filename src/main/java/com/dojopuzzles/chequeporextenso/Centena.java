package com.dojopuzzles.chequeporextenso;

public enum Centena {
    ZERO,
    CEM,
    DUZENTOS;

    public static Centena from(int resto) {
        return Centena.values()[resto];
    }
}
