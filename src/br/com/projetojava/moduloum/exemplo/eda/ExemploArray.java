package br.com.projetojava.moduloum.exemplo.eda;

public class ExemploArray {

    public static void main(String[] args) {
        //Criando array
        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        arr[2] = 0;
        ordenar(arr);
    }

    public static void ordenar(int[] arr){
        //Logica de ordenação

        //i = INDICE
        for (int i = 0; i < arr.length; i++) {

            //
            for (int j = i + 1; j < arr.length; j++) {

                //VARIAVEL TEMPORARIA PARA GUARDAR O INDICE MOVIMENTADO
                int tmp = 0;

                if (arr[i] < arr[j]) {
                    tmp = arr[i]; //RECEBE VALOR TEMPORÁRIO
                    arr[i] = arr[j]; //DESLOCA O MENOR VALOR PARA A ESQUERDA
                    arr[j] = tmp; //DESLOCA O MAIOR VALOR PARA A DIREITA
                }

            }

            //Resultado
            System.out.println(arr[i]);
        }
    }
}
