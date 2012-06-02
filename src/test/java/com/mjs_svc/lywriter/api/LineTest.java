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
public class LineTest {

    public LineTest() {
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
     * Test of getRightAnchor method, of class Line.
     */
    @Test
    public void testGetRightAnchor() {
        System.out.println("getRightAnchor");
        Line instance = null;
        BarObject expResult = null;
        BarObject result = instance.getRightAnchor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRightAnchor method, of class Line.
     */
    @Test
    public void testSetRightAnchor() {
        System.out.println("setRightAnchor");
        BarObject _rightAnchor = null;
        Line instance = null;
        instance.setRightAnchor(_rightAnchor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeftAnchor method, of class Line.
     */
    @Test
    public void testGetLeftAnchor() {
        System.out.println("getLeftAnchor");
        Line instance = null;
        BarObject expResult = null;
        BarObject result = instance.getLeftAnchor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeftAnchor method, of class Line.
     */
    @Test
    public void testSetLeftAnchor() {
        System.out.println("setLeftAnchor");
        BarObject _leftAnchor = null;
        Line instance = null;
        instance.setLeftAnchor(_leftAnchor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Line.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Line instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Line.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        int _type = 0;
        Line instance = null;
        instance.setType(_type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlacement method, of class Line.
     */
    @Test
    public void testGetPlacement() {
        System.out.println("getPlacement");
        Line instance = null;
        int expResult = 0;
        int result = instance.getPlacement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlacement method, of class Line.
     */
    @Test
    public void testSetPlacement() {
        System.out.println("setPlacement");
        int _placement = 0;
        Line instance = null;
        instance.setPlacement(_placement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}