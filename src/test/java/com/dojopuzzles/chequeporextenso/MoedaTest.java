package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoedaTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Moeda umReal = new Moeda(1);
        LinhaDoCheque umRealPorExtenso = umReal.porExtenso();
        assertEquals(new LinhaDoCheque(Unidade.UM).toString(), "um real");
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        var doisReaisPorExtenso = doisReais.porExtenso();
        assertEquals(new LinhaDoCheque(Unidade.DOIS).toString(), "dois reais");
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Moeda tresReais = new Moeda(3);
        var tresReaisPorExtenso = tresReais.porExtenso();
        assertEquals(new LinhaDoCheque(Unidade.TRES).toString(), "três reais");
    }
}
