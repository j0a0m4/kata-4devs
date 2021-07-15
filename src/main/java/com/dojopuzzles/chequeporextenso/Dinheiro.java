package com.dojopuzzles.chequeporextenso;

public class Dinheiro {
    private Integer valor;

    public Dinheiro(int valor) {
        this.valor = valor;
    }

    public DinheiroPorExtenso porExtenso() {
        if (this.valor >= 100) {
            int centenas = this.valor / 100;
            int resto = this.valor % 100;

            int dezenas = resto / 10;
            int unidades = resto % 10;

            return new DinheiroPorExtenso(Centena.CEM, Dezena.from(dezenas), Unidade.from(unidades));
        }

        int dezenas = this.valor / 10;
        int modUnidade = this.valor % 10;

        if (this.valor >= 10) {
            return new DinheiroPorExtenso(Dezena.from(dezenas), Unidade.from(modUnidade));
        }

        Unidade unidade = Unidade.from(this.valor);
        return new DinheiroPorExtenso(unidade);
    }
}
