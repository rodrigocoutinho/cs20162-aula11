/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.rodrigocoutinho.aula11;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author Shakaw
 */
public class MainTest {
    


    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void rodarSemExpressao() {
        exit.expectSystemExitWithStatus(1); //Espera sair com erro (1)
        String[] args = null;
        Main.main(args);

    }

    @Test
    public void rodarExpressaoInvalida() {
        exit.expectSystemExitWithStatus(1); //Espera sair com erro (1)
        String[] args = {"+-"};
        Main.main(args);

    }

    @Test
    public void rodarExpressaoValida() {
        exit.expectSystemExitWithStatus(0); //Espera sair sem erro (0)
        String[] args = {"(2+5)/2"};
        Main.main(args);
    }
}
