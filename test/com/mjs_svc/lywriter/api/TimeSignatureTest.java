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
public class TimeSignatureTest {

    public TimeSignatureTest() {
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
     * Test of setSignature method, of class TimeSignature.
     */
    @Test
    public void testSetSignature() {
        System.out.println("setSignature");
        int _numerator = 0;
        int _denominator = 0;
        TimeSignature instance = null;
        instance.setSignature(_numerator, _denominator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerator method, of class TimeSignature.
     */
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        TimeSignature instance = null;
        int expResult = 0;
        int result = instance.getNumerator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDenominator method, of class TimeSignature.
     */
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        TimeSignature instance = null;
        int expResult = 0;
        int result = instance.getDenominator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayDenominator method, of class TimeSignature.
     */
    @Test
    public void testGetDisplayDenominator() {
        System.out.println("getDisplayDenominator");
        TimeSignature instance = null;
        int expResult = 0;
        int result = instance.getDisplayDenominator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}