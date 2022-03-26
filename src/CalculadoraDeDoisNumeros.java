public class CalculadoraDeDoisNumeros {

    //Em construção
    public Double calcular(
            Double fatorUm,
            Double fatorDois,
            String operacao
            ){
        // TRUE OU FALSE
        if(operacao == "SOMA"){
            return fatorUm + fatorDois;
        }

        else if(operacao == "SUBTRACAO"){
            return fatorUm - fatorDois;
        }

        else if(operacao == "DIVISAO"){
            return fatorUm / fatorDois;
        }

        else if(operacao == "MULTIPLICACAO"){
            return fatorUm * fatorDois;
        }

        return null;

    }

}
