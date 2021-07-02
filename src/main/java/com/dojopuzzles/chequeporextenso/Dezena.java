package com.dojopuzzles.chequeporextenso;

public enum Dezena {
    DEZ("dez"),
//    ONZE("onze"),
//    DOZE("doze"),
//    TREZE("treze"),
//    QUATORZE("quatorze"),
//    QUINZE("quinze"),
//    DEZESSEIS("dezesseis"),
//    DEZESSETE("dezessete"),
//    DEZOITO("dezoito"),
//    DEZENOVE("dezenove"),
    VINTE("vinte"),
    TRINTA("trinta"),
    QUARENTA("quarenta"),
    CINQUENTA("cinquenta"),
    SESSENTA("sessenta"),
    SETENTA("setenta"),
    OITENTA("oitenta"),
    NOVENTA("noventa");

    private final String valorPorExtenso;

    Dezena(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public static Dezena from(Integer valor) {
        return Dezena.values()[valor - 10];
    }

    @Override
    public String toString() {
        return this.valorPorExtenso;
    }

}
