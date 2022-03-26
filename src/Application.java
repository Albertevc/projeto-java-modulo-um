public class Application {

    //LINGUAGEM DE PROGRAMAÇÃO FORTEMENTE TIPADA
    public static void main(String[] args) {

        CalculadoraDeDoisNumeros calculadoraDeDoisNumeros = new CalculadoraDeDoisNumeros();

        Double soma = calculadoraDeDoisNumeros.calcular(
                2D,
                2D,
                "multiplicacao"
        );

        System.out.println(soma);

    }

}
