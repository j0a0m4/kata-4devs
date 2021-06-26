package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoedaTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Moeda umReal = new Moeda(1);
        assertEquals(umReal.porExtenso(), new LinhaDoCheque("um real"));
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        assertEquals(doisReais.porExtenso(), new LinhaDoCheque("dois reais"));
    }
}
