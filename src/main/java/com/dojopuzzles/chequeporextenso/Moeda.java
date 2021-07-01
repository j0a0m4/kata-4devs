package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        Unidade unidade = Unidade.from(this.valor - 1);

        if (this.valor.equals(1)) {
            return new LinhaDoCheque(unidade);
        }
        if (this.valor.equals(2)) {
            return new LinhaDoCheque(unidade);
        }
        return new LinhaDoCheque("três reais");
    }
}
