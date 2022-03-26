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

        else if(operacao.equalsIgnoreCase("SUBTRACAO")){
            return fatorUm - fatorDois;
        }

        else if(operacao.equalsIgnoreCase("DIVISAO")){
            return fatorUm / fatorDois;
        }

        else if(operacao.equalsIgnoreCase("MULTIPLICACAO")){
            return fatorUm * fatorDois;
        }

        return null;

    }

}
