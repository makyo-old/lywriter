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
public class TextTest {

    public TextTest() {
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
     * Test of setStyle method, of class Text.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        boolean _italic = false;
        boolean _bold = false;
        Text instance = null;
        instance.setStyle(_italic, _bold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBold method, of class Text.
     */
    @Test
    public void testGetBold() {
        System.out.println("getBold");
        Text instance = null;
        boolean expResult = false;
        boolean result = instance.getBold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItalic method, of class Text.
     */
    @Test
    public void testGetItalic() {
        System.out.println("getItalic");
        Text instance = null;
        boolean expResult = false;
        boolean result = instance.getItalic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Text.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String _text = "";
        Text instance = null;
        instance.setText(_text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Text.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Text instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Text.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int _position = 0;
        Text instance = null;
        instance.setPosition(_position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Text.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Text instance = null;
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}