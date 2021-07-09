package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        if (this.valor < 20) {
            Vintena unidade = Vintena.from(this.valor - 1);
            return new LinhaDoCheque(unidade);
        }

        Dezena dezena = Dezena.from(this.valor);
        return new LinhaDoCheque(dezena);
    }
}
