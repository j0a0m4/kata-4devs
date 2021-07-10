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

    @Test
    @DisplayName("Escrever 41 reais por extenso")
    void casoQuarentaUm() {
        Moeda quarentaUmReais = new Moeda(41);
        assertEquals(new LinhaDoCheque(Dezena.QUARENTA, Unidade.UM), quarentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 49 reais por extenso")
    void casoQuarentaNove() {
        Moeda quarentaNoveReais = new Moeda(49);
        assertEquals(new LinhaDoCheque(Dezena.QUARENTA, Unidade.NOVE), quarentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 50 reais por extenso")
    void casoCinquenta() {
        Moeda cinquentaReais = new Moeda(50);
        assertEquals(new LinhaDoCheque(Dezena.CINQUENTA, Unidade.ZERO), cinquentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 51 reais por extenso")
    void casoCinquentaUm() {
        Moeda cinquentaUmReais = new Moeda(51);
        assertEquals(new LinhaDoCheque(Dezena.CINQUENTA, Unidade.UM), cinquentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 59 reais por extenso")
    void casoCinquentaNove() {
        Moeda cinquentaNoveReais = new Moeda(59);
        assertEquals(new LinhaDoCheque(Dezena.CINQUENTA, Unidade.NOVE), cinquentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 60 reais por extenso")
    void casoSessenta() {
        Moeda sessentaReais = new Moeda(60);
        assertEquals(new LinhaDoCheque(Dezena.SESSENTA, Unidade.ZERO), sessentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 61 reais por extenso")
    void casoSessentaUm() {
        Moeda sessentaUmReais = new Moeda(61);
        assertEquals(new LinhaDoCheque(Dezena.SESSENTA, Unidade.UM), sessentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 69 reais por extenso")
    void casoSessentaNove() {
        Moeda sessentaNoveReais = new Moeda(69);
        assertEquals(new LinhaDoCheque(Dezena.SESSENTA, Unidade.NOVE), sessentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 70 reais por extenso")
    void casoSetenta() {
        Moeda setentaReais = new Moeda(70);
        assertEquals(new LinhaDoCheque(Dezena.SETENTA, Unidade.ZERO), setentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 71 reais por extenso")
    void casoSetentaUm() {
        Moeda setentaUm = new Moeda(71);
        assertEquals(new LinhaDoCheque(Dezena.SETENTA, Unidade.UM), setentaUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 79 reais por extenso")
    void casoSetentaNove() {
        Moeda setentaNoveReais = new Moeda(79);
        assertEquals(new LinhaDoCheque(Dezena.SETENTA, Unidade.NOVE), setentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 80 reais por extenso")
    void casoOitenta() {
        Moeda oitentaReais = new Moeda(80);
        assertEquals(new LinhaDoCheque(Dezena.OITENTA, Unidade.ZERO), oitentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 81 reais por extenso")
    void casoOitentaUm() {
        Moeda oitentaUmReais = new Moeda(81);
        assertEquals(new LinhaDoCheque(Dezena.OITENTA, Unidade.UM), oitentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 89 reais por extenso")
    void casoOitentaNove() {
        Moeda oitentaNoveReais = new Moeda(89);
        assertEquals(new LinhaDoCheque(Dezena.OITENTA, Unidade.NOVE), oitentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 90 reais por extenso")
    void casoNoventa() {
        Moeda noventaReais = new Moeda(90);
        assertEquals(new LinhaDoCheque(Dezena.NOVENTA, Unidade.ZERO), noventaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 91 reais por extenso")
    void casoNoventaUm() {
        Moeda noventaUmReais = new Moeda(91);
        assertEquals(new LinhaDoCheque(Dezena.NOVENTA, Unidade.UM), noventaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 99 reais por extenso")
    void casoNoventaNove() {
        Moeda noventaNoveReais = new Moeda(99);
        assertEquals(new LinhaDoCheque(Dezena.NOVENTA, Unidade.NOVE), noventaNoveReais.porExtenso());
    }

}

