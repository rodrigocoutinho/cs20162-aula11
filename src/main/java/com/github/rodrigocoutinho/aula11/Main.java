/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.rodrigocoutinho.aula11;

/**
 *
 * @author Shakaw
 */
public final class Main {
    
    private Main(){
}

    /**
     * imprime o resultado da expressão matemática fornecida ao executar.
     *
     * @param args A expressão a ser calculada.
     */
    public static void main(final String[] args) {
        String entrada;

        if (args == null) {
            System.err.println("Expressão matemática não fornecida.");
            System.exit(1);
        } else {
            entrada = args[0];
            try {
                System.out.println(Calcular.Entrada(entrada));
                System.exit(0);
            } catch (IllegalArgumentException ex) {
                System.err.println("Entrada inválida.");
                System.exit(1);
            }
        }
    }

}
