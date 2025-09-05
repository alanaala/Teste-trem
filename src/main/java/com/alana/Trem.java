package com.alana;

public class Trem {

    private String codigo;
    private int capacidade;
    private int ocupacaoAtual;

    public Trem(String codigo, int capacidade, int ocupacaoAtual) {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.ocupacaoAtual = ocupacaoAtual;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getOcupacaoAtual() {
        return ocupacaoAtual;
    }

    public boolean temVagas() {
        if(capacidade == getOcupacaoAtual()) return false;
        return true;
    }

    public boolean embarcarPassageiro() throws Exception{
        if (temVagas()) {
            ocupacaoAtual++;
            return true;
        }
        else{
            throw new Exception("Trem lotado!");
        }
    }

    public boolean desembarcarPassageiro() throws Exception{
        if (ocupacaoAtual != 0) {
            ocupacaoAtual--;
            return true;
        }
        else{
            throw new Exception("Trem vazio!");
        }
    }
}