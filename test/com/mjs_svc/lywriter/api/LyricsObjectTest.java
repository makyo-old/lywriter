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
public class LyricsObjectTest {

    public LyricsObjectTest() {
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
     * Test of getText method, of class LyricsObject.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        LyricsObject instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class LyricsObject.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String _text = "";
        LyricsObject instance = null;
        instance.setText(_text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnchor method, of class LyricsObject.
     */
    @Test
    public void testGetAnchor() {
        System.out.println("getAnchor");
        LyricsObject instance = null;
        BarObject expResult = null;
        BarObject result = instance.getAnchor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnchor method, of class LyricsObject.
     */
    @Test
    public void testSetAnchor() {
        System.out.println("setAnchor");
        BarObject _anchor = null;
        LyricsObject instance = null;
        instance.setAnchor(_anchor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}