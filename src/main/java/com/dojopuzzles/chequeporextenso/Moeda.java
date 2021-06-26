package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        if (this.valor.equals(1)) {
            return new LinhaDoCheque("um real");
        }
        if (this.valor.equals(2)) {
            return new LinhaDoCheque("dois reais");
        }
        return new LinhaDoCheque("três reais");
    }
}
