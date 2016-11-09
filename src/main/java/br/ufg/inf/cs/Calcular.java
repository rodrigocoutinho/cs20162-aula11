/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.cs;


/**
 *
 * @author guest-ihx2cx
 */
public class Calcular {

    public static void main(String[] args) {
        int codigo = 0;
        if (args.length > 0) {
            Lexer nome = new Lexer(args[0]);
            
            try{
                Parser nome2 = new Parser(nome.tokenize());
                System.out.println(nome2.expressao().valor());
            }catch (Exception nome3){
                codigo = 1;
            }

        }
        System.exit(codigo);
    }

}
