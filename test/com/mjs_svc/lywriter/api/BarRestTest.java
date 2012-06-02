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
public class BarRestTest {

    public BarRestTest() {
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
     * Test of setIsMultirest method, of class BarRest.
     */
    @Test
    public void testSetIsMultirest() {
        System.out.println("setIsMultirest");
        boolean _isMultirest = false;
        BarRest instance = null;
        instance.setIsMultirest(_isMultirest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsMultirest method, of class BarRest.
     */
    @Test
    public void testGetIsMultirest() {
        System.out.println("getIsMultirest");
        BarRest instance = null;
        boolean expResult = false;
        boolean result = instance.getIsMultirest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}