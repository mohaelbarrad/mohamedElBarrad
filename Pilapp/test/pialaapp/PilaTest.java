/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pialaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moha
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    
    /**
     * Test of afegir method, of class Pila.
     * Test Pila buida afegim primer element
     */
    @Test
    public void testAfegir() {
        System.out.println("afegir");
        int el = 1;
        Pila pila = new Pila();
        int expResult = 1;
        int result = pila.afegir(el);
        assertEquals(expResult, result);        
    }

    /**
     * Test of afegir method, of class Pila.
     * Test Pila plena no afageix l'element per aixó retorna 0
     */
    @Test
    public void testAfegir2() {
        System.out.println("afegir");
        int el = 100;
        Pila pila = new Pila();
        for (int i = 1; i <= 100; i++) {
            pila.afegir(i);
        }
        int expResult = 0;
        int result = pila.afegir(el);
        assertEquals(expResult, result);        
    }

    /**
     * Test of afegir method, of class Pila.
     * Test Pila mig plena afegim un element i s'afegieix correctament.
     */
    @Test
    public void testAfegir3() {
        System.out.println("afegir");
        int el = 51;
        Pila pila = new Pila();
        for (int i = 1; i <= 50; i++) {
            pila.afegir(i);
        }
        int expResult = 51;
        int result = pila.afegir(el);
        assertEquals(expResult, result);        
    }

    /**
     * Test of afegir method, of class Pila.
     * Test Pila element menor 0 no l'afageix
     */
    @Test
    public void testAfegir4() {
        System.out.println("afegir");
        int el = -1;
        Pila pila = new Pila();
        int expResult = 0;
        int result = pila.afegir(el);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of afegir method, of class Pila.
     * Test Pila si l'element és 0 no l'afaeix el 0 que retorna és en cas de quan no l'afageix
     */
    @Test
    public void testAfegir5() {
        System.out.println("afegir");
        int el = 0;
        Pila pila = new Pila();
        int expResult = 0;
        int result = pila.afegir(el);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of treure method, of class Pila.
     * Pila està buida no teru cap element
     */
    @Test
    public void testTreure() {
        System.out.println("treure");
        Pila pila = new Pila();
        int expResult = -1;
        int result = pila.treure();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of treure method, of class Pila.
     * Pila te elements i en treu un
     */
    @Test
    public void testTreure2() {
        System.out.println("treure");
        Pila pila = new Pila();
        for (int i = 1; i <= 10; i++) {
            pila.afegir(i);
        }
        int expResult = 10;
        int result = pila.treure();
        assertEquals(expResult, result);
        
    }
    
}
