package br.com.projetojava.moduloum;

import br.com.projetojava.moduloum.modelo.Funcionario;

public class CalculadoraDeSalario {

    //Encapsulamento
    //Array é uma estrutura de dados que guarda informações posicionalmente
    public Double calcular(
            Double salario,
            Double desconto
    ) {

       if (salario < desconto) {
           return 0.0;
       }

       return salario - desconto;
    }

}
