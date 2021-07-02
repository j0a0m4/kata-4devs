package com.dojopuzzles.chequeporextenso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoedaTest {

    @Test
    @DisplayName("Escrever 1 real por extenso")
    void casoUm() {
        Moeda umReal = new Moeda(1);
        assertEquals("um real", umReal.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 2 reais por extenso")
    void casoDois() {
        Moeda doisReais = new Moeda(2);
        assertEquals("dois reais", doisReais.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 3 reais por extenso")
    void casoTres() {
        Moeda tresReais = new Moeda(3);
        assertEquals("três reais", tresReais.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 4 reais por extenso")
    void casoQuatro() {
        Moeda quatroReais = new Moeda(4);
        assertEquals("quatro reais", quatroReais.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 10 reais por extenso")
    void casoDez() {
        Moeda dezReais = new Moeda(10);
        assertEquals("dez reais", dezReais.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 11 reais por extenso")
    void casoOnze() {
        Moeda onzeReais = new Moeda(11);
        assertEquals("onze reais", onzeReais.porExtenso().toString());
    }

    @Test
    @DisplayName("Escrever 20 reais por extenso")
    void casoVinte(){
        Moeda vinteReais = new Moeda(20);
        assertEquals("vinte reais", vinteReais.porExtenso().toString());
    }
}
