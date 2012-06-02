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
public class RestTest {

    public RestTest() {
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
     * Test of setArticulations method, of class Rest.
     */
    @Test
    public void testSetArticulations() {
        System.out.println("setArticulations");
        int[] _articulations = null;
        Rest instance = null;
        instance.setArticulations(_articulations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulations method, of class Rest.
     */
    @Test
    public void testGetArticulations() {
        System.out.println("getArticulations");
        Rest instance = null;
        int[] expResult = null;
        int[] result = instance.getArticulations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDynamic method, of class Rest.
     */
    @Test
    public void testGetDynamic() {
        System.out.println("getDynamic");
        Rest instance = null;
        int expResult = 0;
        int result = instance.getDynamic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDynamic method, of class Rest.
     */
    @Test
    public void testSetDynamic() {
        System.out.println("setDynamic");
        int _dynamic = 0;
        Rest instance = null;
        instance.setDynamic(_dynamic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}