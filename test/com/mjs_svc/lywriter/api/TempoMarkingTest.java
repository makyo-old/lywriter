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
public class TempoMarkingTest {

    public TempoMarkingTest() {
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
     * Test of getText method, of class TempoMarking.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        TempoMarking instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class TempoMarking.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String _text = "";
        TempoMarking instance = null;
        instance.setText(_text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class TempoMarking.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        TempoMarking instance = null;
        int expResult = 0;
        int result = instance.getTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempo method, of class TempoMarking.
     */
    @Test
    public void testSetTempo() {
        System.out.println("setTempo");
        int _tempo = 0;
        TempoMarking instance = null;
        instance.setTempo(_tempo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowTempo method, of class TempoMarking.
     */
    @Test
    public void testGetShowTempo() {
        System.out.println("getShowTempo");
        TempoMarking instance = null;
        boolean expResult = false;
        boolean result = instance.getShowTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowTempo method, of class TempoMarking.
     */
    @Test
    public void testSetShowTempo() {
        System.out.println("setShowTempo");
        boolean _showTempo = false;
        TempoMarking instance = null;
        instance.setShowTempo(_showTempo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}