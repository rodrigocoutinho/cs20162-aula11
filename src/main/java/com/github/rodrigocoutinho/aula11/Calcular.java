/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.rodrigocoutinho.aula11;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;

import java.util.List;

/**
 *
 * @author Shakaw
 */
public final class Calcular {
    
    /**
     * Recebe parametros e retorna o resultado da expressao passada.
     *
     * @param expressao String Parametros passados pela linha de comando
     * @return retorna o resultado da expressao matematica
     */
    public static float Entrada(final String expressao) {

        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);

        return parser.expressao().valor();
    }
}
