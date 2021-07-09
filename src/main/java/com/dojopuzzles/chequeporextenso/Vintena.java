package com.dojopuzzles.chequeporextenso;

public enum Vintena {
    UM("um"),
    DOIS("dois"),
    TRES("três"),
    QUATRO("quatro"),
    CINCO("cinco"),
    SEIS("seis"),
    SETE("sete"),
    OITO("oito"),
    NOVE("nove");

    private String valorPorExtenso;

    Vintena(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public static Vintena from(Integer valor) {
        return Vintena.values()[valor];
    }

    @Override
    public String toString() {
        return this.valorPorExtenso;
    }
}
