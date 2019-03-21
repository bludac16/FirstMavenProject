/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.bluemel.firstmavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class AnlageTest {
    
    public AnlageTest() {
    }

    /**
     * Test of jahresAfa method, of class Anlage.
     */
    @Test
    public void testJahresAfa() {
        Anlage a = new Anlage(2000.00, 10);
        assertEquals(200.0, a.jahresAfa(), 0.01);
    }

    /**
     * Test of updateBuchwert method, of class Anlage.
     */
    @Test
    public void testUpdateBuchwert1() {
        Anlage a = new Anlage(2000.00,10);
        a.updateBuchwert(5);
        assertEquals(1000.00, a.getBuchwert(), 0.01);
    }
    
    @Test
    public void testUpdateBuchwert2() {
        Anlage a = new Anlage(2000.00,10);
        a.updateBuchwert(12);
        assertEquals(1.00, a.getBuchwert(), 0.01);
    }

    /**
     * Test of getBuchwert method, of class Anlage.
     */
    @Test
    public void testGetBuchwert() {
    }
    
}
