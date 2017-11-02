package com.example.alinemokfa.kaiju;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by alinemokfa on 02/11/2017.
 */

public class KaijuTest {

    Destoroyah destoroyah;
    Godzilla godzilla;

    @Before
    public void before() {
        destoroyah = new Destoroyah("Destoroyah", 600, 70);
        godzilla = new Godzilla("Godzilla", 1000, 100);

    }

    @Test
    public void testKaijuNames() {
        assertEquals("Destoroyah", destoroyah.getName());
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void testKaijuAttackVal() {
        assertEquals(70, destoroyah.getAttackVal());
        assertEquals(100, godzilla.getAttackVal());
    }

    @Test
    public void testKaijuHealthVal() {
        assertEquals(600, destoroyah.getHealthVal());
        assertEquals(1000, godzilla.getHealthVal());
    }


    @Test
    public void testKaijuRoar(){
        assertEquals("Roar", destoroyah.roar());
        assertEquals("ROAR", godzilla.roar());
    }
}