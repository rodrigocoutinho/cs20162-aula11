/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.rodrigocoutinho.aula11;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;

import java.util.List;

public final class Calcular {

    /**
     * 
     *
     * @param args Parametros passados pela linha de comando
     */
    public static void main(final String[] args) {

        List<Token> tokens = new Lexer(args[0]).tokenize();
        Parser parser = new Parser(tokens);
        float resultado = parser.expressao().valor(); // 23.0

        System.out.println(resultado);
    }
}