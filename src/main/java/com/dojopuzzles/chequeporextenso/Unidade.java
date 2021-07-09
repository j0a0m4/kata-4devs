package com.dojopuzzles.chequeporextenso;

public enum Unidade {
    ZERO("zero"),
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

    Unidade(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public static Unidade from(Integer valor) {
        return Unidade.values()[valor];
    }

    @Override
    public String toString() {
        return this.valorPorExtenso;
    }
}
