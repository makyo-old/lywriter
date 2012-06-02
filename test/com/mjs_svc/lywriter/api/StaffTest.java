package com.mjs_svc.lywriter.api;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Scott
 * @version $Id$
 */
public class StaffTest {

    public StaffTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setInstrument method, of class Staff.
     */
    @Test
    public void testSetInstrument() {
        System.out.println("setInstrument");
        Instrument _instrument = null;
        Staff instance = null;
        instance.setInstrument(_instrument);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstrument method, of class Staff.
     */
    @Test
    public void testGetInstrument() {
        System.out.println("getInstrument");
        Staff instance = null;
        Instrument expResult = null;
        Instrument result = instance.getInstrument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Staff.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Voice v = null;
        Staff instance = null;
        instance.add(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Staff.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Staff instance = null;
        Voice expResult = null;
        Voice result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Staff.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Staff instance = null;
        Voice expResult = null;
        Voice result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Staff.
     */
    @Test
    public void testRemove_Voice() {
        System.out.println("remove");
        Voice s = null;
        Staff instance = null;
        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Staff.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Staff instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}