package br.com.projetojava.moduloum;

import java.util.Arrays;

public class CalculadoraDeSalario {

    //Encapsulamento
    //Array é uma estrutura de dados que guarda informações posicionalmente
    public void calcular(String[] funcionarios){

        //ITERAR, é um verbo que significa percorrer uma estrutura de lista

        //3 argumentos
        for (
                int i = 0;//CRIAÇÃO DO INDICE
                i < funcionarios.length; //CONDICIONAL DE LIMITE
                i++ // INCREMENTAÇÃO DO INDICE
        ){

            String funcionario = funcionarios[i];
            System.out.println(funcionario);

        }

        //ENQUANTO
        int i = 0;
        while(
                i < funcionarios.length
        ){
            String funcionario = funcionarios[i];
            System.out.println(funcionario);
            i++;
        }

    }

}
