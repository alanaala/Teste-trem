package com.alana;

public class Bilhete {

    private Passageiro passageiro;
    private Viagem viagem;
    private double precoBase;

    public Bilhete(Passageiro passageiro, Viagem viagem, double precoBase) {
        this.passageiro = passageiro;
        this.viagem = viagem;
        this.precoBase = precoBase;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public double calcularPreco(int idade) throws Exception {
        Trem trem = viagem.getTrem();
        if (!trem.temVagas()) {
            throw new Exception("Não é possível calcular preço: trem lotado!");
        }

        if (passageiro.temDesconto()) {
            return precoBase * 0.5;
        }
        return precoBase;
    }

    public void validarEmbarque() throws Exception{
        viagem.getTrem().embarcarPassageiro();
    }
}