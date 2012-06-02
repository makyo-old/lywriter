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
public class BarLineTest {

    public BarLineTest() {
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
     * Test of getLineType method, of class BarLine.
     */
    @Test
    public void testGetLineType() {
        System.out.println("getLineType");
        BarLine instance = null;
        int expResult = 0;
        int result = instance.getLineType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineType method, of class BarLine.
     */
    @Test
    public void testSetLineType() {
        System.out.println("setLineType");
        int _lineType = 0;
        BarLine instance = null;
        instance.setLineType(_lineType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}