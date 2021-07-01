package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        Unidade unidade = Unidade.from(this.valor - 1);

        return new LinhaDoCheque(unidade);
    }
}
