package com.mjs_svc.lywriter.api;

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
public class BarObjectTest {

    public BarObjectTest() {
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
     * Test of getTick method, of class BarObject.
     */
    @Test
    public void testGetTick() {
        System.out.println("getTick");
        BarObject instance = new BarObjectImpl();
        long expResult = 0L;
        long result = instance.getTick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTick method, of class BarObject.
     */
    @Test
    public void testSetTick() {
        System.out.println("setTick");
        long _tick = 0L;
        BarObject instance = new BarObjectImpl();
        instance.setTick(_tick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBarListener method, of class BarObject.
     */
    @Test
    public void testAddBarListener() {
        System.out.println("addBarListener");
        Bar _container = null;
        BarObject instance = new BarObjectImpl();
        instance.addBarListener(_container);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTupletListener method, of class BarObject.
     */
    @Test
    public void testAddTupletListener() {
        System.out.println("addTupletListener");
        Tuplet _container = null;
        BarObject instance = new BarObjectImpl();
        instance.addTupletListener(_container);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class BarObject.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        BarObject instance = new BarObjectImpl();
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BarObjectImpl extends BarObject {
    }

}