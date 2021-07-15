package com.dojopuzzles.chequeporextenso;

public enum Centena {
    ZERO,
    CEM,
    DUZENTOS,
    TREZENTOS,
    QUATROCENTOS,
    QUINHENTOS,
    SEISCENTOS,
    SETECENTOS,
    OITOCENTOS,
    NOVECENTOS;

    public static Centena from(int resto) {
        return Centena.values()[resto];
    }
}
