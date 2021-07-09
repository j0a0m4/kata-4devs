package com.dojopuzzles.chequeporextenso;

public class Moeda {
    private Integer valor;

    public Moeda(int valor) {
        this.valor = valor;
    }

    public LinhaDoCheque porExtenso() {
       /* int unidades = this.valor % 10;
        int dezenas = this.valor / 10;

        if (unidades > 0 && dezenas > 0) {
            Vintena vintena = Vintena.from(unidades);
            return new LinhaDoCheque(Dezena.VINTE, vintena);
        }   */

        if (this.valor > 29) {
            int unidades = this.valor % 30;
            int dezenas = this.valor / 30;
            Vintena vintena = Vintena.from(unidades);
            return new LinhaDoCheque(Dezena.TRINTA, vintena);
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
