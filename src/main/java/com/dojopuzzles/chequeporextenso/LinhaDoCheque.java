package com.dojopuzzles.chequeporextenso;

import java.util.Objects;

public class LinhaDoCheque {
    private Dezena dezena;
    private Vintena vintena;

    public LinhaDoCheque(Vintena vintena) {
        this.vintena = vintena;
    }

    public LinhaDoCheque(Dezena dezena) {
        this.dezena = dezena;
    }

    public LinhaDoCheque(Dezena dezena, Vintena vintena) {
        this.dezena = dezena;
        this.vintena = vintena;
    }

    public String toString() {
        if (this.dezena != null) {
            return String.format("%s reais", dezena);
        }

        if (this.vintena.equals(Vintena.UM)) {
            return String.format("%s real", vintena);
        }

        return String.format("%s reais", vintena);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaDoCheque that = (LinhaDoCheque) o;
        return Objects.equals(vintena, that.vintena);
    }
}
