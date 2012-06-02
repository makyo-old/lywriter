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
public class ClefTest {

    public ClefTest() {
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
     * Test of getClefType method, of class Clef.
     */
    @Test
    public void testGetClefType() {
        System.out.println("getClefType");
        Clef instance = null;
        int expResult = 0;
        int result = instance.getClefType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClefType method, of class Clef.
     */
    @Test
    public void testSetClefType() {
        System.out.println("setClefType");
        int _clefType = 0;
        Clef instance = null;
        instance.setClefType(_clefType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Clef.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        Clef instance = null;
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}