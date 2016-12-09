/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.rodrigocoutinho.aula11;

import org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Shakaw
 */
public class MainTest {

    /**
     * Instancia classe.
     */
    @Test
    public void testMain() {
        Main m = new Main();
    }
    /**
     * Faz referencia as saidas
     */
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    /**
     * Testa quando a expressao esta vazia ou nula;
     */
    @Test
    public void testExpressaoVazia() {
        exit.expectSystemExitWithStatus(1);
        String[] args = null;
        Main.main(args);
        assertEquals(1, exit);
    }

    /**
     * Testando expressao incorreta.
     */
    @Test
    public void testExpressaoInvalida() {
        exit.expectSystemExitWithStatus(1);
        String[] args = {"+-"};
        Main.main(args);
        assertEquals(1, exit);

    }

    /**
     * Testa uma expressao valida.
     */
    @Test
    public void testExpressaoValida() {
        exit.expectSystemExitWithStatus(0);
        String[] args = {"(2+5)/2"};
        Main.main(args);
        assertEquals(0, exit);
    }
}
