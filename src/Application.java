import br.com.projetojava.moduloum.CalculadoraDeSalario;
import br.com.projetojava.moduloum.modelo.Funcionario;

public class Application {

    public static void main(String[] args) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();


     Funcionario[] funcionarios = new Funcionario[7];

            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Albert");
            funcionario.setSalario(15000.00);
            funcionario.setDesconto(1110.00);
            funcionarios[0] = funcionario;

            funcionario.setNome("Willen");
            funcionario.setSalario(1250.00);
            funcionario.setDesconto(150.00);
            funcionarios[1] = funcionario;

            funcionario.setNome("Hilton");
            funcionario.setSalario(1300.00);
            funcionario.setDesconto(250.00);
            funcionarios[2] = funcionario;

            funcionario.setNome("Joas");
            funcionario.setSalario(1230.00);
            funcionario.setDesconto(120.00);
            funcionarios[3] = funcionario;

            funcionario.setNome("Paulo Henrique");
            funcionario.setSalario(2000.00);
            funcionario.setDesconto(330.00);
            funcionarios[4] = funcionario;

            funcionario.setNome("Flavio");
            funcionario.setSalario(3000.00);
            funcionario.setDesconto(340.00);
            funcionarios[5] = funcionario;

            funcionario.setNome("Natanael");
            funcionario.setSalario(5000.00);
            funcionario.setDesconto(510.00);
            funcionarios[6] = funcionario;
           calculadoraDeSalario.calcular(funcionarios);
            System.out.println(funcionario);

    }

}