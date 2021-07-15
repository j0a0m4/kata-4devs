package com.dojopuzzles.chequeporextenso;

import java.util.Objects;

public class DinheiroPorExtenso {
    private Milhar milhar;
    private Dezena dezena;
    private Unidade unidade;
    private Centena centena;

    public DinheiroPorExtenso(Unidade unidade) {
        this.unidade = unidade;
    }

    public DinheiroPorExtenso(Dezena dezena) {
        this.dezena = dezena;
    }

    public DinheiroPorExtenso(Dezena dezena, Unidade unidade) {
        this.dezena = dezena;
        this.unidade = unidade;
    }

    public DinheiroPorExtenso(Centena centena, Dezena dezena, Unidade unidade) {
        this.centena = centena;
        this.dezena = dezena;
        this.unidade = unidade;
    }

    public DinheiroPorExtenso(Milhar milhar, Centena centena, Dezena dezena, Unidade unidade) {
        this.centena = centena;
        this.dezena = dezena;
        this.milhar = milhar;
        this.unidade = unidade;
    }

    public String toString() {
        if (this.dezena != null) {
            return String.format("%s reais", dezena);
        }

        if (this.unidade.equals(Unidade.UM)) {
            return String.format("%s real", unidade);
        }

        return String.format("%s reais", unidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DinheiroPorExtenso that = (DinheiroPorExtenso) o;
        return Objects.equals(unidade, that.unidade) &&
                Objects.equals(dezena, that.dezena) &&
                Objects.equals(centena, that.centena);
    }
}
