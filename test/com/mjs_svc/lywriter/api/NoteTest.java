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
public class NoteTest {

    public NoteTest() {
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
     * Test of tieTo method, of class Note.
     */
    @Test
    public void testTieTo() {
        System.out.println("tieTo");
        Note tiedNote = null;
        Note instance = null;
        instance.tieTo(tiedNote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unTieTo method, of class Note.
     */
    @Test
    public void testUnTieTo() {
        System.out.println("unTieTo");
        Note tiedNote = null;
        Note instance = null;
        instance.unTieTo(tiedNote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiedIn method, of class Note.
     */
    @Test
    public void testGetTiedIn() {
        System.out.println("getTiedIn");
        Note instance = null;
        boolean expResult = false;
        boolean result = instance.getTiedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiedOut method, of class Note.
     */
    @Test
    public void testGetTiedOut() {
        System.out.println("getTiedOut");
        Note instance = null;
        boolean expResult = false;
        boolean result = instance.getTiedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTiedIn method, of class Note.
     */
    @Test
    public void testSetTiedIn() {
        System.out.println("setTiedIn");
        boolean _tiedIn = false;
        Note instance = null;
        instance.setTiedIn(_tiedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTiedOut method, of class Note.
     */
    @Test
    public void testSetTiedOut() {
        System.out.println("setTiedOut");
        boolean _tiedOut = false;
        Note instance = null;
        instance.setTiedOut(_tiedOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulations method, of class Note.
     */
    @Test
    public void testSetArticulations() {
        System.out.println("setArticulations");
        int[] _articulations = null;
        Note instance = null;
        instance.setArticulations(_articulations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulations method, of class Note.
     */
    @Test
    public void testGetArticulations() {
        System.out.println("getArticulations");
        Note instance = null;
        int[] expResult = null;
        int[] result = instance.getArticulations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDynamic method, of class Note.
     */
    @Test
    public void testGetDynamic() {
        System.out.println("getDynamic");
        Note instance = null;
        int expResult = 0;
        int result = instance.getDynamic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDynamic method, of class Note.
     */
    @Test
    public void testSetDynamic() {
        System.out.println("setDynamic");
        int _dynamic = 0;
        Note instance = null;
        instance.setDynamic(_dynamic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayDynamic method, of class Note.
     */
    @Test
    public void testGetDisplayDynamic() {
        System.out.println("getDisplayDynamic");
        Note instance = null;
        boolean expResult = false;
        boolean result = instance.getDisplayDynamic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisplayDynamic method, of class Note.
     */
    @Test
    public void testSetDisplayDynamic() {
        System.out.println("setDisplayDynamic");
        boolean _displayDynamic = false;
        Note instance = null;
        instance.setDisplayDynamic(_displayDynamic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPitch method, of class Note.
     */
    @Test
    public void testGetPitch() {
        System.out.println("getPitch");
        Note instance = null;
        int expResult = 0;
        int result = instance.getPitch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPitch method, of class Note.
     */
    @Test
    public void testSetPitch() {
        System.out.println("setPitch");
        int _pitch = 0;
        Note instance = null;
        instance.setPitch(_pitch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}