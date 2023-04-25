package com.example.calculadora;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainActivityTest extends TestCase{

    private MainActivity mainActivity;
    @Before
    public void SetUp(){
        mainActivity = new MainActivity();
    }
    @After
    public void tearDown(){
        mainActivity = null;
    }

    @Test
    public void testSum(){
        int resultado = MainActivity.suma(10,10);
        assertEquals(20, resultado);
    }
    @Test
    public void testSum2(){
        int resultado = MainActivity.suma(100,20);
        assertEquals(120, resultado);
    }
    @Test
    public void testRest(){
        int resultado = MainActivity.resta(40,10);
        assertEquals(30, resultado);
    }
    @Test
    public void testRest2(){
        int resultado = MainActivity.resta(80,20);
        assertEquals(60, resultado);
    }

    @Test
    public void testRest3(){
        int resultado = MainActivity.resta(80,20);
        assertEquals(75, resultado);
    }
}