/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.rodrigocoutinho.aula11;

import org.junit.Test;

/**
 *
 * @author Shakaw
 */
public class CalcularTest {
    
    /**
     * Instancia classe.
     */
    @Test
    public void testInst() {
        Calcular calc = new Calcular();
    }

    /**
     * Testa entrada valida.
     */
    @Test
    public void CalcularTest() {
        String entrada = "5-5";
        Calcular.Entrada(entrada);
    }

    /**
     * Testa entrada valida.
     */
    @Test
    public void testEntradaValida() {
        String valorParaCalcular = "50-5";
        Calcular.Entrada(valorParaCalcular);
    }

    /**
     * Testa entrada valida.
     */
    @Test
    public void testEntradaValida2() {
        String valorParaCalcular = "5-5";
        Calcular.Entrada(valorParaCalcular);
    }
    
        /**
     * Testa se a expressão recebe argumento incorreto.
     */
    @Test
    public void testEntradaInvalida()throws IllegalArgumentException{
        String valorParaCalcular = "A";
            Calcular.Entrada(valorParaCalcular);
    }

}
