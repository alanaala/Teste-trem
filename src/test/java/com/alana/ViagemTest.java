package com.alana;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

import static org.junit.Assert.assertNotEquals;

public class ViagemTest extends TestCase {

    Estacao origem;
    Estacao destino;
    Trem trem;
    LocalDateTime partida;
    LocalDateTime chegada;
    Viagem v;

    @BeforeEach
    void Passegeiro() {
        origem = new Estacao("Central", "São Paulo");
        destino = new Estacao("Norte", "Campinas");
        trem = new Trem("T123", 100, 50);
        partida = LocalDateTime.of(2023, 1, 1, 10, 0);
        chegada = LocalDateTime.of(2023, 1, 1, 13, 0);
        v= new Viagem(origem, destino, partida, chegada, trem);
    }

    @Test
    public void testeDuracaoHoras() throws Exception{
        assertEquals(3, v.duracaoHoras());
    }

    @Test
    public void testeOrigemDestinoDiferentes() throws Exception{
        assertNotEquals(v.getOrigem().getNome(), v.getDestino().getNome());
    }
}
