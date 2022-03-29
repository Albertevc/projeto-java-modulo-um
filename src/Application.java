public class Application {

    //LINGUAGEM DE PROGRAMAÇÃO FORTEMENTE TIPADA
    public static void main(String[] args) {

        CalculadoraDeDoisNumeros calculadoraDeDoisNumeros = new CalculadoraDeDoisNumeros();

        Double soma = calculadoraDeDoisNumeros.calcular(
                2D,
                2D,
                "multiplicacao"
        );
        Double adcao = calculadoraDeDoisNumeros.calcular(
                2D,
                2D,
                "ADCAO"
        );
        Double multiplicacao = calculadoraDeDoisNumeros.calcular(
                2D,
                3D,
                "MULTIPLICACAO"
        );
        Double divisao = calculadoraDeDoisNumeros.calcular(
                2D,
                3D,
                "DIVISAO"
        );

        System.out.println(soma);
        System.out.println(adcao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }

}
