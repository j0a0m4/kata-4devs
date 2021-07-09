package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


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
        assertEquals(new LinhaDoCheque(Unidade.DEZ), dezReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 11 reais por extenso")
    void casoOnze() {
        Moeda onzeReais = new Moeda(11);
        assertEquals(new LinhaDoCheque(Unidade.ONZE), onzeReais.porExtenso());
    }


    @Test
    @DisplayName("Escrever 20 reais por extenso")
    void casoVinte() {
        Moeda vinteReais = new Moeda(20);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Unidade.ZERO), vinteReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 21 reais por extenso")
    void casoVinteUm() {
        Moeda vinteUmReais = new Moeda(21);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Unidade.UM), vinteUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 22 reais por extenso")
    void casoVinteDois() {
        Moeda vinteDoisReais = new Moeda(22);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Unidade.DOIS), vinteDoisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 29 reais por extenso")
    void casoVinteNove() {
        Moeda vinteNoveReais = new Moeda(29);
        assertEquals(new LinhaDoCheque(Dezena.VINTE, Unidade.NOVE), vinteNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 30 reais por extenso")
    void casoTrinta() {
        Moeda trintaReais = new Moeda(30);
        assertEquals(new LinhaDoCheque(Dezena.TRINTA, Unidade.ZERO), trintaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 31 reais por extenso")
    void casoTrintaUm() {
        Moeda trintaUmReais = new Moeda(31);
        assertEquals(new LinhaDoCheque(Dezena.TRINTA, Unidade.UM), trintaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 39 reais por extenso")
    void casoTrintaNove() {
        Moeda trintaNoveReais = new Moeda(39);
        assertEquals(new LinhaDoCheque(Dezena.TRINTA, Unidade.NOVE), trintaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 40 reais por extenso")
    void casoQuarenta() {
        Moeda quarentaReais = new Moeda(40);
        assertEquals(new LinhaDoCheque(Dezena.QUARENTA, Unidade.ZERO), quarentaReais.porExtenso());
    }
}

