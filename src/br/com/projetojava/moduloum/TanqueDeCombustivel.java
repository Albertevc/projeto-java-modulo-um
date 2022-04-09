package br.com.projetojava.moduloum;

import java.util.List;

public abstract class TanqueDeCombustivel {

    private List<Combustivel> combustivels;

    public List<Combustivel> getCombustivels() {
        return combustivels;
    }

    public void setCombustivels(List<Combustivel> combustivels) {
        this.combustivels = combustivels;
    }

}
