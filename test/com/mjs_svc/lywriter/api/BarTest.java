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
public class BarTest {

    public BarTest() {
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
     * Test of getTimeSignature method, of class Bar.
     */
    @Test
    public void testGetTimeSignature() {
        System.out.println("getTimeSignature");
        Bar instance = null;
        TimeSignature expResult = null;
        TimeSignature result = instance.getTimeSignature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarNumber method, of class Bar.
     */
    @Test
    public void testGetBarNumber() {
        System.out.println("getBarNumber");
        Bar instance = null;
        int expResult = 0;
        int result = instance.getBarNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBarNumber method, of class Bar.
     */
    @Test
    public void testSetBarNumber() {
        System.out.println("setBarNumber");
        int _barNumber = 0;
        Bar instance = null;
        instance.setBarNumber(_barNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Bar.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        BarObject b = null;
        Bar instance = null;
        instance.add(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Bar.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Bar instance = null;
        BarObject expResult = null;
        BarObject result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Bar.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Bar instance = null;
        BarObject expResult = null;
        BarObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Bar.
     */
    @Test
    public void testRemove_BarObject() {
        System.out.println("remove");
        BarObject b = null;
        Bar instance = null;
        boolean expResult = false;
        boolean result = instance.remove(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of durationChangeListner method, of class Bar.
     */
    @Test
    public void testDurationChangeListner() throws Exception {
        System.out.println("durationChangeListner");
        int durationDelta = 0;
        Bar instance = null;
        instance.durationChangeListner(durationDelta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Bar.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Bar instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}