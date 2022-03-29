import br.com.projetojava.moduloum.CalculadoraDeSalario;
import br.com.projetojava.moduloum.modelo.Funcionario;

import java.util.Random;

public class Application {

    //LINGUAGEM DE PROGRAMAÇÃO FORTEMENTE TIPADA
    public static void main(String[] args) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        Funcionario[] funcionarios = new Funcionario[6];
        Application app = new Application();

        funcionarios[0] = new Funcionario(
                "Albert",
                app.numAleatorio(10000),
                app.numAleatorio(1000));

        funcionarios[1] = new Funcionario(
                "Natanael",
                app.numAleatorio(10000),
                app.numAleatorio(1000));

        funcionarios[2] = new Funcionario(
                "Willen",
                app.numAleatorio(10000),
                app.numAleatorio(1000));

        funcionarios[3] = new Funcionario(
                "Hilton",
                app.numAleatorio(10000),
                app.numAleatorio(1000));

        funcionarios[4] = new Funcionario(
                "Flavio",
                app.numAleatorio(10000),
                app.numAleatorio(1000));

        funcionarios[5] = new Funcionario(
                "Paulo Henrique",
                app.numAleatorio(10000),
                app.numAleatorio(1000));


        for (Funcionario funcionario : funcionarios) {
            System.out.println(
                    "\nFuncionário: " + funcionario.getNome() +
                    "\nSalário Bruto - Total de Descontos\n"
                    + funcionario.getSalario() + " - " + funcionario.getDesconto() + " = R$" +
                    calculadoraDeSalario.calcular(
                            funcionario.getSalario(),
                            funcionario.getDesconto()).toString()
            );

            System.out.println("-----------------------------------------------");
        }


        //TAREFA
        //CALCULAR E EXIBIR POR MEIO DO METODO CALCULAR O VALOR DO SALARIO LIQUID DE UMA LISTA DE FUNCIONARIOS
    }


    private Double numAleatorio(int limiteMaximo) {
        return Math.round((Math.random()) * limiteMaximo) / 1.00D;
    }

}
