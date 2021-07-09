package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoedaTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Moeda umReal = new Moeda(1);
        assertEquals(new LinhaDoCheque(Unidade.UM), umReal.porExtenso());
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        assertEquals(new LinhaDoCheque(Unidade.DOIS), doisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Moeda tresReais = new Moeda(3);
        assertEquals(new LinhaDoCheque(Unidade.TRES), tresReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 4 reais por extenso")
    void casoQuatro() {
        Moeda quatroReais = new Moeda(4);
        assertEquals(new LinhaDoCheque(Unidade.QUATRO), quatroReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 10 reais por extenso")
    void casoDez() {
        Moeda dezReais = new Moeda(10);
        assertEquals(new LinhaDoCheque(Dezena.DEZ), dezReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 11 reais por extenso")
    void casoOnze() {
        Moeda onzeReais = new Moeda(11);
        assertEquals(new LinhaDoCheque(Dezena.ONZE), onzeReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 20 reais por extenso")
    void casoVinte() {
        Moeda vinteReais = new Moeda(20);
        assertEquals(new LinhaDoCheque(Dezena.VINTE), vinteReais.porExtenso());
    }
}
