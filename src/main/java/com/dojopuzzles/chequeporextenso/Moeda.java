package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        var from = Unidade.from(this.valor - 1);

        if (this.valor.equals(1)) {
            return new LinhaDoCheque(from);
        }
        if (this.valor.equals(2)) {
            return new LinhaDoCheque(from);
        }
        return new LinhaDoCheque("três reais");
    }
}
