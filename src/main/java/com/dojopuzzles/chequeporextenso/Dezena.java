package com.dojopuzzles.chequeporextenso;

public enum Dezena {
    ZERO("zero"),
    DEZ("dez"),
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
        return Dezena.values()[valor];
    }

    @Override
    public String toString() {
        return this.valorPorExtenso;
    }

}
