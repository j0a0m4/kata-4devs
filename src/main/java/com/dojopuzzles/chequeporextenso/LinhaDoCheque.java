package com.dojopuzzles.chequeporextenso;

import java.util.Objects;

public class LinhaDoCheque {
    private Dezena dezena;
    private Vintena unidade;

    public LinhaDoCheque(Vintena unidade) {
        this.unidade = unidade;
    }

    public LinhaDoCheque(Dezena dezena) {
        this.dezena = dezena;
    }

    public LinhaDoCheque(Dezena dezena, Vintena vintena) {
        this.dezena = dezena;
        this.unidade = vintena;
    }

    public String toString() {
        if (this.dezena != null) {
            return String.format("%s reais", dezena);
        }

        if (this.unidade.equals(Vintena.UM)) {
            return String.format("%s real", unidade);
        }

        return String.format("%s reais", unidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaDoCheque that = (LinhaDoCheque) o;
        return Objects.equals(unidade, that.unidade) &&
                Objects.equals(dezena, that.dezena);
    }
}
