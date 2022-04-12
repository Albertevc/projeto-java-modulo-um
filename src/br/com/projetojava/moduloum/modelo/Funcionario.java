package br.com.projetojava.moduloum.modelo;

public class Funcionario {
    private int Salario;
    private String Nome;
    private cadastrarfuncionario.Departamento Dep;

    public Funcionario() {
    }

    public Funcionario(int Salario, String Nome) {
        this.Salario = Salario;
        this.Nome = Nome;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Matricula) {
        this.Salario = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public cadastrarfuncionario.Departamento getDep() {
        return Dep;
    }

    public void setDep(cadastrarfuncionario.Departamento Dep) {
        this.Dep = Dep;
    }


}
