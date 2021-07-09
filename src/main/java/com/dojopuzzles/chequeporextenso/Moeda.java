package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
        if (this.valor > 29) {
            int unidades = this.valor % 30;
            Unidade unidade = Unidade.from(unidades);
            return new LinhaDoCheque(Dezena.TRINTA, unidade);
        }

        if (this.valor > 20) {
            var mod = this.valor % 20;
            Unidade unidade = Unidade.from(mod);
            return new LinhaDoCheque(Dezena.VINTE, unidade);
        }

        if (this.valor < 20) {
            Unidade unidade = Unidade.from(this.valor);
            return new LinhaDoCheque(unidade);
        }

        Dezena dezena = Dezena.from(this.valor);
        return new LinhaDoCheque(dezena);
    }
}
