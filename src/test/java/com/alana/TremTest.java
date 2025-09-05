package com.alana;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TremTest{

    Trem trem1;
    Trem trem2;

    @BeforeEach
    void passagem(){
        trem1 = new Trem("100abc", 100, 100);
        trem2 = new Trem("abc200", 100, 0);
    }

    @Test
    void temVagas() {
        assertFalse(trem1.temVagas());
        assertTrue(trem2.temVagas());
    }

    @Test
    void embarcarPassageiro() throws Exception{
        assertThrows(Exception .class,() -> trem1.embarcarPassageiro());
        desembarcarPassageiro();
        assertTrue(trem2.embarcarPassageiro());
    }

    @Test
    void desembarcarPassageiro() throws Exception{
        assertTrue(trem1.desembarcarPassageiro());
        assertThrows(Exception.class,() -> trem2.desembarcarPassageiro());
    }
}