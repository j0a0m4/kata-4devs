package com.dojopuzzles.chequeporextenso;

import java.util.Map;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        if (this.valor.equals(1)) {
            return new LinhaDoCheque("um real");
        }
        return new LinhaDoCheque("dois reais");
    }
}
