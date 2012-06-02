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
public class TupletTest {

    public TupletTest() {
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
     * Test of add method, of class Tuplet.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        BarObject b = null;
        Tuplet instance = null;
        instance.add(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Tuplet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Tuplet instance = null;
        BarObject expResult = null;
        BarObject result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Tuplet.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Tuplet instance = null;
        BarObject expResult = null;
        BarObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Tuplet.
     */
    @Test
    public void testRemove_BarObject() {
        System.out.println("remove");
        BarObject b = null;
        Tuplet instance = null;
        boolean expResult = false;
        boolean result = instance.remove(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of durationChangeListener method, of class Tuplet.
     */
    @Test
    public void testDurationChangeListener() throws Exception {
        System.out.println("durationChangeListener");
        int durationDelta = 0;
        Tuplet instance = null;
        instance.durationChangeListener(durationDelta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Tuplet.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        Tuplet instance = null;
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Tuplet.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Tuplet instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}