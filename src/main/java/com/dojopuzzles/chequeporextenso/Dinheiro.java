package com.dojopuzzles.chequeporextenso;

public class Dinheiro {
    private Integer valor;

    public Dinheiro(int valor) {
        this.valor = valor;
    }

    public DinheiroPorExtenso porExtenso() {
        int modUnidade = this.valor % 10;
        int dezenas = this.valor / 10;

        if (this.valor >= 20) {
            Unidade unidade = Unidade.from(modUnidade);
            return new DinheiroPorExtenso(Dezena.from(dezenas), unidade);
        }

        Unidade unidade = Unidade.from(this.valor);
        return new DinheiroPorExtenso(unidade);
    }
}
