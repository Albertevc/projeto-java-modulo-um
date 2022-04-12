import br.com.projetojava.moduloum.modelo.Funcionario;

import java.util.ArrayList;

public class cadastrarfuncionario {

    public class Departamento {
        private int Codigo;
        private String Nome;
        private int Salario;
        ArrayList<Funcionario> ListaFunc;

        public Departamento() {
            ListaFunc = new ArrayList();
        }

        public Departamento(int Codigo, String Nome) {
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.Salario = Salario;
            ListaFunc = new ArrayList();
        }

        public int getCodigo() {
            return Codigo;
        }

        public void setCodigo(int Codigo) {
            this.Codigo = Codigo;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        public int getSalario() {
            return Salario;
        }
        public void setSalario(int Salario) {
            this.Salario = Salario;
        }
        public ArrayList<Funcionario> getListaFunc() {
            return ListaFunc;
        }

        public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
            this.ListaFunc = ListaFunc;
        }

        public void addFunc(Funcionario F){
            F.setDep(this);
            ListaFunc.add(F);
        }
    }
}
