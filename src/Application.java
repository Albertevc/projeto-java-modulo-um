import br.com.projetojava.moduloum.CalculadoraDeSalario;
import br.com.projetojava.moduloum.modelo.Funcionario;

public class Application {

    //LINGUAGEM DE PROGRAMAÇÃO FORTEMENTE TIPADA
    public static void main(String[] args) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

        Funcionario[] funcionarios = new Funcionario[5];
        double salarioFixo = 100.00;
        double desconto = 10.00;

        //características do funcionário;
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Albert");
        funcionario.setSalario(salarioFixo);
        funcionario.setDesconto(desconto);
        funcionarios[0] = funcionario;

        String[] strings = new String[7];
        strings[0] = "Albert";
        strings[1] = "Willen";
        strings[2] = "Hilton";
        strings[3] = "Joas";
        strings[4] = "Paulo Henrique";
        strings[5] = "Flavio";
        strings[6] = "Natanael";

        calculadoraDeSalario.calcular(
                for(int i = 0; i == funcionarios.length; i++){
                    
                }
        );

        //TAREFA
        //CALCULAR E EXIBIR POR MEIO DO METODO CALCULAR O VALOR DO SALARIO LIQUID DE UMA LISTA DE FUNCIONARIOS
    }

}
