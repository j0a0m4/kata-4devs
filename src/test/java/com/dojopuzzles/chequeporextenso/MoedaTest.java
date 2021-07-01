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
        assertEquals(new LinhaDoCheque("um real"), umRealPorExtenso);
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        assertEquals(doisReais.porExtenso(), new LinhaDoCheque("dois reais"));
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Moeda tresReais = new Moeda(3);
        assertEquals(tresReais.porExtenso(), new LinhaDoCheque("três reais"));
    }
}
