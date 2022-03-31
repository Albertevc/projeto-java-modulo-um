package br.com.projetojava.moduloum;

public class CalculadoraDeDoisNumeros {

    //Em construção
    public Double calcular(
            Double fatorUm,
            Double fatorDois,
            String operacao
            ){
        // TRUE OU FALSE
        if(operacao.equalsIgnoreCase("SOMA")){
            return fatorUm + fatorDois;
        }
        if(operacao == "ADCAO") {
            return fatorUm + fatorDois;
        }
        if(operacao == "MULTIPLICACAO") {
            return fatorUm * fatorDois;
        }
        if(operacao == "DIVISAO") {
            return fatorUm / fatorDois;
        }
        return null;

    }

}
