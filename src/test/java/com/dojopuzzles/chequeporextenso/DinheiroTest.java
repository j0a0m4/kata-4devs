package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class DinheiroTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Dinheiro umReal = new Dinheiro(1);
        assertEquals(new DinheiroPorExtenso(Unidade.UM), umReal.porExtenso());
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Dinheiro doisReais = new Dinheiro(2);
        assertEquals(new DinheiroPorExtenso(Unidade.DOIS), doisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Dinheiro tresReais = new Dinheiro(3);
        assertEquals(new DinheiroPorExtenso(Unidade.TRES), tresReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 4 reais por extenso")
    void casoQuatro() {
        Dinheiro quatroReais = new Dinheiro(4);
        assertEquals(new DinheiroPorExtenso(Unidade.QUATRO), quatroReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 10 reais por extenso")
    void casoDez() {
        Dinheiro dezReais = new Dinheiro(10);
        assertEquals(new DinheiroPorExtenso(Dezena.DEZ, Unidade.ZERO), dezReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 11 reais por extenso")
    void casoOnze() {
        Dinheiro onzeReais = new Dinheiro(11);
        assertEquals(new DinheiroPorExtenso(Dezena.DEZ, Unidade.UM), onzeReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 20 reais por extenso")
    void casoVinte() {
        Dinheiro vinteReais = new Dinheiro(20);
        assertEquals(new DinheiroPorExtenso(Dezena.VINTE, Unidade.ZERO), vinteReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 21 reais por extenso")
    void casoVinteUm() {
        Dinheiro vinteUmReais = new Dinheiro(21);
        assertEquals(new DinheiroPorExtenso(Dezena.VINTE, Unidade.UM), vinteUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 22 reais por extenso")
    void casoVinteDois() {
        Dinheiro vinteDoisReais = new Dinheiro(22);
        assertEquals(new DinheiroPorExtenso(Dezena.VINTE, Unidade.DOIS), vinteDoisReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 29 reais por extenso")
    void casoVinteNove() {
        Dinheiro vinteNoveReais = new Dinheiro(29);
        assertEquals(new DinheiroPorExtenso(Dezena.VINTE, Unidade.NOVE), vinteNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 30 reais por extenso")
    void casoTrinta() {
        Dinheiro trintaReais = new Dinheiro(30);
        assertEquals(new DinheiroPorExtenso(Dezena.TRINTA, Unidade.ZERO), trintaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 31 reais por extenso")
    void casoTrintaUm() {
        Dinheiro trintaUmReais = new Dinheiro(31);
        assertEquals(new DinheiroPorExtenso(Dezena.TRINTA, Unidade.UM), trintaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 39 reais por extenso")
    void casoTrintaNove() {
        Dinheiro trintaNoveReais = new Dinheiro(39);
        assertEquals(new DinheiroPorExtenso(Dezena.TRINTA, Unidade.NOVE), trintaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 40 reais por extenso")
    void casoQuarenta() {
        Dinheiro quarentaReais = new Dinheiro(40);
        assertEquals(new DinheiroPorExtenso(Dezena.QUARENTA, Unidade.ZERO), quarentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 41 reais por extenso")
    void casoQuarentaUm() {
        Dinheiro quarentaUmReais = new Dinheiro(41);
        assertEquals(new DinheiroPorExtenso(Dezena.QUARENTA, Unidade.UM), quarentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 49 reais por extenso")
    void casoQuarentaNove() {
        Dinheiro quarentaNoveReais = new Dinheiro(49);
        assertEquals(new DinheiroPorExtenso(Dezena.QUARENTA, Unidade.NOVE), quarentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 50 reais por extenso")
    void casoCinquenta() {
        Dinheiro cinquentaReais = new Dinheiro(50);
        assertEquals(new DinheiroPorExtenso(Dezena.CINQUENTA, Unidade.ZERO), cinquentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 51 reais por extenso")
    void casoCinquentaUm() {
        Dinheiro cinquentaUmReais = new Dinheiro(51);
        assertEquals(new DinheiroPorExtenso(Dezena.CINQUENTA, Unidade.UM), cinquentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 59 reais por extenso")
    void casoCinquentaNove() {
        Dinheiro cinquentaNoveReais = new Dinheiro(59);
        assertEquals(new DinheiroPorExtenso(Dezena.CINQUENTA, Unidade.NOVE), cinquentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 60 reais por extenso")
    void casoSessenta() {
        Dinheiro sessentaReais = new Dinheiro(60);
        assertEquals(new DinheiroPorExtenso(Dezena.SESSENTA, Unidade.ZERO), sessentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 61 reais por extenso")
    void casoSessentaUm() {
        Dinheiro sessentaUmReais = new Dinheiro(61);
        assertEquals(new DinheiroPorExtenso(Dezena.SESSENTA, Unidade.UM), sessentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 69 reais por extenso")
    void casoSessentaNove() {
        Dinheiro sessentaNoveReais = new Dinheiro(69);
        assertEquals(new DinheiroPorExtenso(Dezena.SESSENTA, Unidade.NOVE), sessentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 70 reais por extenso")
    void casoSetenta() {
        Dinheiro setentaReais = new Dinheiro(70);
        assertEquals(new DinheiroPorExtenso(Dezena.SETENTA, Unidade.ZERO), setentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 71 reais por extenso")
    void casoSetentaUm() {
        Dinheiro setentaUm = new Dinheiro(71);
        assertEquals(new DinheiroPorExtenso(Dezena.SETENTA, Unidade.UM), setentaUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 79 reais por extenso")
    void casoSetentaNove() {
        Dinheiro setentaNoveReais = new Dinheiro(79);
        assertEquals(new DinheiroPorExtenso(Dezena.SETENTA, Unidade.NOVE), setentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 80 reais por extenso")
    void casoOitenta() {
        Dinheiro oitentaReais = new Dinheiro(80);
        assertEquals(new DinheiroPorExtenso(Dezena.OITENTA, Unidade.ZERO), oitentaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 81 reais por extenso")
    void casoOitentaUm() {
        Dinheiro oitentaUmReais = new Dinheiro(81);
        assertEquals(new DinheiroPorExtenso(Dezena.OITENTA, Unidade.UM), oitentaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 89 reais por extenso")
    void casoOitentaNove() {
        Dinheiro oitentaNoveReais = new Dinheiro(89);
        assertEquals(new DinheiroPorExtenso(Dezena.OITENTA, Unidade.NOVE), oitentaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 90 reais por extenso")
    void casoNoventa() {
        Dinheiro noventaReais = new Dinheiro(90);
        assertEquals(new DinheiroPorExtenso(Dezena.NOVENTA, Unidade.ZERO), noventaReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 91 reais por extenso")
    void casoNoventaUm() {
        Dinheiro noventaUmReais = new Dinheiro(91);
        assertEquals(new DinheiroPorExtenso(Dezena.NOVENTA, Unidade.UM), noventaUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 99 reais por extenso")
    void casoNoventaNove() {
        Dinheiro noventaNoveReais = new Dinheiro(99);
        assertEquals(new DinheiroPorExtenso(Dezena.NOVENTA, Unidade.NOVE), noventaNoveReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 100 reais por extenso")
    void casoCem() {
        Dinheiro cemReais = new Dinheiro(100);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.ZERO, Unidade.ZERO), cemReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 101 reais por extenso")
    void casoCentoEUm() {
        Dinheiro centoEUmReais = new Dinheiro(101);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.ZERO, Unidade.UM), centoEUmReais.porExtenso());
    }
}

