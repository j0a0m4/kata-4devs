package com.dojopuzzles.chequeporextenso;

import java.util.Objects;

public class LinhaDoCheque {
    private Unidade unidade;
    private String cifra;

    public LinhaDoCheque(String valor) {
        this.cifra = valor;
    }

    public LinhaDoCheque(Unidade unidade) {
        this.unidade = unidade;
    }

    public String toString() {
        if (unidade != null)
            return unidade.toString();
        return this.cifra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaDoCheque that = (LinhaDoCheque) o;
        return Objects.equals(cifra, that.cifra)
            && Objects.equals(unidade, that.unidade);
    }
}
