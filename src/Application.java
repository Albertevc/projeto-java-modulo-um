import br.com.projetojava.moduloum.CalculadoraDeSalario;
import br.com.projetojava.moduloum.modelo.Funcionario;

public class Application {

    //LINGUAGEM DE PROGRAMAÇÃO FORTEMENTE TIPADA
    public static void main(String[] args) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

            Funcionario[] funcionarios = new Funcionario[7];

            Funcionario funcionario = new Funcionario();


        funcionarios[0] = funcionario;

                funcionario.setNome("Albert");
                funcionario.setSalario(8500.00);
                funcionario.setDesconto(350.00);

        funcionarios[1] = funcionario;

                funcionario.setNome("Willer");
                funcionario.setSalario(2300.00);
                funcionario.setDesconto(520.00);

        funcionarios[2] = funcionario;

                funcionario.setNome("Hilton");
                funcionario.setSalario(2600.00);
                funcionario.setDesconto(460.00);

        funcionarios[3] = funcionario;

                funcionario.setNome("Joas");
                funcionario.setSalario(3350.00);
                funcionario.setDesconto(110.00);

        funcionarios[4] = funcionario;

                funcionario.setNome("Paulo Henrique");
                funcionario.setSalario(2350.00);
                funcionario.setDesconto(210.00);

        funcionarios[5] = funcionario;

                funcionario.setNome("Flavio");
                funcionario.setSalario(4250.00);
                funcionario.setDesconto(130.00);

        funcionarios[6] = funcionario;

                funcionario.setNome("Natanael");
                funcionario.setSalario(3150.00);
                funcionario.setDesconto(225.00);


        calculadoraDeSalario.calcular(funcionarios);
        System.out.println(funcionario);

        //TAREFA
        //CALCULAR E EXIBIR POR MEIO DO METODO CALCULAR O VALOR DO SALARIO LIQUID DE UMA LISTA DE FUNCIONARIOS


}
