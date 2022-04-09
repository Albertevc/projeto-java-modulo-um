package br.com.projetojava.moduloum;

public class Carro {

    private TanqueDeCombustivel tanqueDeCombustivel;

    public void receberCombustivel(Combustivel combustivel){
            this.tanqueDeCombustivel.getCombustivels()
                    .add(combustivel);
    }

}
