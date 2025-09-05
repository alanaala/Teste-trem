package com.alana;

import java.time.Duration;
import java.time.LocalDateTime;

public class Viagem {

    private Estacao origem;
    private Estacao destino;
    private LocalDateTime partida;
    private LocalDateTime chegada;
    private Trem trem;

    public Viagem(Estacao origem, Estacao destino, LocalDateTime partida, LocalDateTime chegada, Trem trem) {
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.chegada = chegada;
        this.trem = trem;
    }
    public Estacao getOrigem() {
        return origem;
    }
    public Estacao getDestino() {
        return destino;
    }
    public LocalDateTime getHorarioPartida() {
        return partida;
    }
    public LocalDateTime getHorarioChegada() {
        return chegada;
    }
    public Trem getTrem() {
        return trem;
    }

    public long duracaoHoras() {
        Duration duracao = Duration.between(partida, chegada);
        return duracao.toHours();
    }
}

