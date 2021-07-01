package com.dojopuzzles.chequeporextenso;

import java.util.Objects;

public class LinhaDoCheque {
    private Unidade unidade;

    public LinhaDoCheque(Unidade unidade) {
        this.unidade = unidade;
    }

    public String toString() {
        if (this.unidade.equals(Unidade.UM)) {
            return String.format("%s real", unidade);
        }
        return String.format("%s reais", unidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaDoCheque that = (LinhaDoCheque) o;
        return Objects.equals(unidade, that.unidade);
    }
}
