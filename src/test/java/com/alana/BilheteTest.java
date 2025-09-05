package com.alana;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class BilheteTest extends TestCase {

    @Test
    public void testeTemVagasQuandoVazio() {
        Trem trem = new Trem("T123", 2, 2);
        assertTrue(trem.temVagas());
    }
    @Test
    public void testeEmbarcarPassageiro() throws Exception{
        Trem trem = new Trem("T123", 2, 2);
        trem.embarcarPassageiro();
        assertEquals(1, trem.getOcupacaoAtual());
    }
    @Test
    public void testeEmbarcarPassageiroLotado() throws Exception{
        Trem trem = new Trem("T123", 1 , 1);
        trem.embarcarPassageiro();
        assertThrows(Exception.class, trem::embarcarPassageiro);
    }
    @Test
    public void testeDesembarcarPassageiro() throws Exception{
        Trem trem = new Trem("T123", 2 , 1);
        trem.embarcarPassageiro();
        trem.desembarcarPassageiro();
        assertEquals(0, trem.getOcupacaoAtual());
    }
    @Test
    public void testeDesembarcarPassageiroVazio() {
        Trem trem = new Trem("T123", 2, 1);
        assertThrows(Exception.class, trem::desembarcarPassageiro);
    }
}