package com.mjs_svc.lywriter.api;

import java.util.Iterator;
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
public class StaffGroupTest {

    public StaffGroupTest() {
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
     * Test of setText method, of class StaffGroup.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String _name = "";
        String _shortName = "";
        StaffGroup instance = new StaffGroup();
        instance.setText(_name, _shortName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class StaffGroup.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ScoreObject s = null;
        StaffGroup instance = new StaffGroup();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class StaffGroup.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        StaffGroup instance = new StaffGroup();
        ScoreObject expResult = null;
        ScoreObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class StaffGroup.
     */
    @Test
    public void testRemove_ScoreObject() {
        System.out.println("remove");
        ScoreObject s = null;
        StaffGroup instance = new StaffGroup();
        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StaffGroup.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StaffGroup instance = new StaffGroup();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShortName method, of class StaffGroup.
     */
    @Test
    public void testGetShortName() {
        System.out.println("getShortName");
        StaffGroup instance = new StaffGroup();
        String expResult = "";
        String result = instance.getShortName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class StaffGroup.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        StaffGroup instance = new StaffGroup();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}