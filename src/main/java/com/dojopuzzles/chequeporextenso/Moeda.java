package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        if (this.valor > 29) {
            
            return new LinhaDoCheque(Dezena.TRINTA);
        }
        if (this.valor > 20) {
            var mod = this.valor % 20;
            Vintena vintena = Vintena.from(mod);
            return new LinhaDoCheque(Dezena.VINTE, vintena);
        }

        if (this.valor < 20) {
            Vintena unidade = Vintena.from(this.valor);
            return new LinhaDoCheque(unidade);
        }

        Dezena dezena = Dezena.from(this.valor);
        return new LinhaDoCheque(dezena);
    }
}
