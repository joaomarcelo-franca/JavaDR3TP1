package org.example;

import Pessoa.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.getIdade());
        if (pessoa.getIdade() >= 18){
            System.out.println("Voce e maior de Idade");
            pessoa.setMaiorDeIDade(true);
        } else {
            System.out.println("Voce e menor de idade");
            pessoa.setMaiorDeIDade(false);
        }
    }
}
