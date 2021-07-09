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
    NOVE("nove"),
    DEZ("dez"),
    ONZE("onze"),
    DOZE("doze"),
    TREZE("treze"),
    QUATORZE("quatorze"),
    QUINZE("quinze"),
    DEZESSEIS("dezesseis"),
    DEZESSETE("dezessete"),
    DEZOITO("dezoito"),
    DEZENOVE("dezenove");

    private String valorPorExtenso;

    Vintena(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public static Vintena from(Integer valor) {
        return Vintena.values()[valor - 1];
    }

    @Override
    public String toString() {
        return this.valorPorExtenso;
    }
}
