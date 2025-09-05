package com.alana;

import junit.framework.TestCase;
import org.junit.Test;

public class EstacaoTest extends TestCase {

    @Test
    public void testeCriarEstacao() {
        Estacao e = new Estacao("Central", "São Paulo");
        assertEquals("Central", e.getNome());
        assertEquals("São Paulo", e.getCidade());
    }

}
