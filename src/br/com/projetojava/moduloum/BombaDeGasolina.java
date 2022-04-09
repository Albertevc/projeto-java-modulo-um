package br.com.projetojava.moduloum;

public class BombaDeGasolina implements BombaDeCombustivel{

    private Gasolina gasolina;

    public BombaDeGasolina(Gasolina gasolina){
        this.gasolina = gasolina;
    }

    @Override
    public void abastecer(Carro carro) {
        carro.receberCombustivel(
                this.gasolina
        );
    }


}
