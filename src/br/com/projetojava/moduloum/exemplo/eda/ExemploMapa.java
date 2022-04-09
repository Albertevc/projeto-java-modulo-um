package br.com.projetojava.moduloum.exemplo.eda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploMapa {

    public static void main(String[] args) {

        //ESTRUTURA DE DADO DE CHAVE E VALOR

        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        String[] arrString = new String[]{"1", "10", "100", "1000", "10000"};

        int i = arr[2];

        boolean exists = arr[2] > 0 ? true : false;

        boolean existsString = arrString[2] != null
                ? true : arrString[2] != ""
                ? true : arrString[2].equals("100")
                ? true : false;

        //INTERFACE
        Map<Object, List<List<String>>> map = new HashMap<>();

        //FUNCIONALIDADE
        //CRIAR UMA ESTRUTURA DE DADOS PARA CADASTRAR FUNCIONARIOS, SEUS SALARIOS E SEUS CARGOS;
        //LISTAR TODOS OS FUNCIONARIOS CADASTRADOS
        //PESQUISAR A EXISTENCIA DE UM FUNCIONARIO
        //REMOVER UM FUNCIONARIO
        //BOA ABSTRAÇÃO (BAIXO ACOPLAMENTO E ALTA COESAO) utilize o ARRAY (PROIBIDO DE USAR LISTA)


    }
}
