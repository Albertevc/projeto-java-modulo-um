package br.com.projetojava.moduloum;

public class PostoDeGasolina {

    private BombaDeCombustivel bombaDeCombustivel;

    public PostoDeGasolina(BombaDeGasolina bombaDeGasolina) {
        this.bombaDeCombustivel = bombaDeGasolina;
    }

    public BombaDeCombustivel getBombaDeCombustivel() {
        return bombaDeCombustivel;
    }

    public static void main(String[] args) {

        PostoDeGasolina postoDeGasolina = new PostoDeGasolina(new BombaDeGasolina(new Gasolina()));
        postoDeGasolina.getBombaDeCombustivel()
                .abastecer(
                        new Carro()
                );

    }
}
