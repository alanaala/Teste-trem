package com.alana;

import junit.framework.TestCase;
import org.junit.Test;

public class PassageiroTest extends TestCase {

    @Test
    public void testTemDesconto() {

        //Criando o passageiro dentro do teste

        Passageiro p1 = new Passageiro("", 11, "");
        Passageiro p2 = new Passageiro("", 78, "");
        Passageiro p3 = new Passageiro("", 20, "");

        //Verificando se o metodo temDesconto retorna true

        assertTrue(p1.temDesconto());
        assertTrue(p2.temDesconto());
        assertFalse(p3.temDesconto());
    }

}
