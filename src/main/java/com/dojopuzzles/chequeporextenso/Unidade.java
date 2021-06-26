package com.dojopuzzles.chequeporextenso;

public enum Unidade {
    UM("um"),
    DOIS("dois"),
    TRES("três");

    private String valorPorExtenso;

    Unidade(String valorPorExtenso) {
        this.valorPorExtenso = valorPorExtenso;
    }

    public static Unidade from(Integer valor) {
        return Unidade.values()[valor];
    }
}
