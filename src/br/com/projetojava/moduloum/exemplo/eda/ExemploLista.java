package br.com.projetojava.moduloum.exemplo.eda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploLista {

    //programação estruturada

    //repetição
    //condicional
    //estruturação
    //operadores

    //orientação a objetos
    // 4 pilares
    //classes
    //interfaces
    //atributos
    //métodos
    //escopos (statico ou referencia)

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("f");
        lista.add("c");
        lista.add("z");
        lista.add("j");
        lista.add("a");

        //ordenação
        lista.sort(String::compareTo);

        lista.forEach(System.out::println);

    }




}
