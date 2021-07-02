package com.dojopuzzles.chequeporextenso;

public enum Dezena {
    DEZ("dez"); // 0

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
