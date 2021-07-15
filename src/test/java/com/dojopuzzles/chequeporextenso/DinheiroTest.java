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

    @Test
    @DisplayName("Escrever 109 reais por extenso")
    void casoCentoENove() {
        Dinheiro centoENove = new Dinheiro(109);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.ZERO, Unidade.NOVE), centoENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 110 reais por extenso")
    void casoCentoEDez() {
        Dinheiro centoEDez = new Dinheiro(110);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.DEZ, Unidade.ZERO), centoEDez.porExtenso());
    }

    @Test
    @DisplayName("Escrever 119 reais por extenso")
    void casoCentoEDezenove() {
        Dinheiro centoEDezenove = new Dinheiro(119);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.DEZ, Unidade.NOVE), centoEDezenove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 120 reais por extenso")
    void casoCentoEVinte() {
        Dinheiro centoEVinte = new Dinheiro(120);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.VINTE, Unidade.ZERO), centoEVinte.porExtenso());
    }

    @Test
    @DisplayName("Escrever 121 reais por extenso")
    void casoCentoEVinteEUm() {
        Dinheiro centoEVinteEUm = new Dinheiro(121);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.VINTE, Unidade.UM), centoEVinteEUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 129 reais por extenso")
    void casoCentoEVinteENove() {
        Dinheiro centoEVinteENove = new Dinheiro(129);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.VINTE, Unidade.NOVE), centoEVinteENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 130 reais por extenso")
    void casoCentoETrinta() {
        Dinheiro centoETrinta = new Dinheiro(130);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.TRINTA, Unidade.ZERO), centoETrinta.porExtenso());
    }

    @Test
    @DisplayName("Escrever 131 reais por extenso")
    void casoCentoETrintaEUm() {
        Dinheiro centoETrintaEUm = new Dinheiro(131);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.TRINTA, Unidade.UM), centoETrintaEUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 139 reais por extenso")
    void casoCentoETrintaENove() {
        Dinheiro centoETrintaENove = new Dinheiro(139);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.TRINTA, Unidade.NOVE), centoETrintaENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 140 reais por extenso")
    void casoCentoEQuarenta() {
        Dinheiro centoEQuarenta = new Dinheiro(140);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.QUARENTA, Unidade.ZERO), centoEQuarenta.porExtenso());
    }

    @Test
    @DisplayName("Escrever 141 reais por extenso")
    void casoCentoEQuarentaEUm() {
        Dinheiro centoEQuarentaEUm = new Dinheiro(141);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.QUARENTA, Unidade.UM), centoEQuarentaEUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 149 reais por extenso")
    void casoCentoEQuarentaENove() {
        Dinheiro centoEQuarentaENove = new Dinheiro(149);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.QUARENTA, Unidade.NOVE), centoEQuarentaENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 150 reais por extenso")
    void casoCentoECinquenta() {
        Dinheiro centoECinquenta = new Dinheiro(150);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.CINQUENTA, Unidade.ZERO), centoECinquenta.porExtenso());
    }

    @Test
    @DisplayName("Escrever 151 reais por extenso")
    void casoCentoECinquentaEUm() {
        Dinheiro centoECinquentaEUm = new Dinheiro(151);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.CINQUENTA, Unidade.UM), centoECinquentaEUm.porExtenso());
    }

    @Test
    @DisplayName("Escrever 159 reais por extenso")
    void casoCentoECinquentaENove() {
        Dinheiro centoECinquentaENove = new Dinheiro(159);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.CINQUENTA, Unidade.NOVE), centoECinquentaENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 199 reais por extenso")
    void casoCentoENoventaENove() {
        Dinheiro centoECinquentaENove = new Dinheiro(199);
        assertEquals(new DinheiroPorExtenso(Centena.CEM, Dezena.NOVENTA, Unidade.NOVE), centoECinquentaENove.porExtenso());
    }

    @Test
    @DisplayName("Escrever 200 reais por extenso")
    void casoDuzentos() {
        Dinheiro duzentosReais = new Dinheiro(200);
        assertEquals(new DinheiroPorExtenso(Centena.DUZENTOS, Dezena.ZERO, Unidade.ZERO), duzentosReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 201 reais por extenso")
    void casoDuzentosEUm() {
        Dinheiro duzentosEUmReais = new Dinheiro(201);
        assertEquals(new DinheiroPorExtenso(Centena.DUZENTOS, Dezena.ZERO, Unidade.UM), duzentosEUmReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 210 reais por extenso")
    void casoDuzentosEDez() {
        Dinheiro duzentosEDezReais = new Dinheiro(210);
        assertEquals(new DinheiroPorExtenso(Centena.DUZENTOS, Dezena.DEZ, Unidade.ZERO), duzentosEDezReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 211 reais por extenso")
    void casoDuzentosEOnze() {
        Dinheiro duzentosEOnzeReais = new Dinheiro(211);
        assertEquals(new DinheiroPorExtenso(Centena.DUZENTOS, Dezena.DEZ, Unidade.UM), duzentosEOnzeReais.porExtenso());
    }

    @Test
    @DisplayName("Escrever 299 reais por extenso")
    void casoDuzentosENoventaENove() {
        Dinheiro duzentosENoventaENoveReais = new Dinheiro(299);
        assertEquals(new DinheiroPorExtenso(Centena.DUZENTOS, Dezena.NOVENTA, Unidade.NOVE), duzentosENoventaENoveReais.porExtenso());
    }
}

