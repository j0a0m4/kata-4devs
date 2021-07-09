package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoedaTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Moeda umReal = new Moeda(1);
        assertEquals(new LinhaDoCheque(Vintena.UM), umReal.porExtenso());
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        assertEquals(new LinhaDoCheque(Vintena.DOIS), doisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Moeda tresReais = new Moeda(3);
        assertEquals(new LinhaDoCheque(Vintena.TRES), tresReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 4 reais por extenso")
    void casoQuatro() {
        Moeda quatroReais = new Moeda(4);
        assertEquals(new LinhaDoCheque(Vintena.QUATRO), quatroReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 10 reais por extenso")
    void casoDez() {
        Moeda dezReais = new Moeda(10);
        assertEquals(new LinhaDoCheque(Vintena.DEZ), dezReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 11 reais por extenso")
    void casoOnze() {
        Moeda onzeReais = new Moeda(11);
        assertEquals(new LinhaDoCheque(Vintena.ONZE), onzeReais.porExtenso());
    }


    @Test
    @DisplayName("Escrever 20 reais por extenso")
    void casoVinte() {
        Moeda vinteReais = new Moeda(20);
        assertEquals(new LinhaDoCheque(Dezena.VINTE), vinteReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 21 reais por extenso")
    void casoVinteUm() {
        Moeda vinteUmReais = new Moeda(21);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Vintena.UM), vinteUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 22 reais por extenso")
    void casoVinteDois() {
        Moeda vinteDoisReais = new Moeda(22);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Vintena.DOIS), vinteDoisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 29 reais por extenso")
    void casoVinteNove() {
        Moeda vinteNoveReais = new Moeda(29);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Vintena.NOVE), vinteNoveReais.porExtenso());
    }
}
