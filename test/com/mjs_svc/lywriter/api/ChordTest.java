package com.mjs_svc.lywriter.api;

import java.util.Iterator;
import java.util.Vector;
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
public class ChordTest {

    public ChordTest() {
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
     * Test of add method, of class Chord.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int _pitch = 0;
        Chord instance = null;
        instance.add(_pitch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChordMembers method, of class Chord.
     */
    @Test
    public void testGetChordMembers() {
        System.out.println("getChordMembers");
        Chord instance = null;
        Vector expResult = null;
        Vector result = instance.getChordMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Chord.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Chord instance = null;
        Note expResult = null;
        Note result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Chord.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Chord instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Chord.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Chord instance = null;
        Note expResult = null;
        Note result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Chord.
     */
    @Test
    public void testRemove_Note() {
        System.out.println("remove");
        Note n = null;
        Chord instance = null;
        boolean expResult = false;
        boolean result = instance.remove(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDynamic method, of class Chord.
     */
    @Test
    public void testSetDynamic() {
        System.out.println("setDynamic");
        int _dynamic = 0;
        Chord instance = null;
        instance.setDynamic(_dynamic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDynamic method, of class Chord.
     */
    @Test
    public void testGetDynamic() {
        System.out.println("getDynamic");
        Chord instance = null;
        int expResult = 0;
        int result = instance.getDynamic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisplayDynamic method, of class Chord.
     */
    @Test
    public void testSetDisplayDynamic() {
        System.out.println("setDisplayDynamic");
        boolean _displayDynamic = false;
        Chord instance = null;
        instance.setDisplayDynamic(_displayDynamic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayDynamic method, of class Chord.
     */
    @Test
    public void testGetDisplayDynamic() {
        System.out.println("getDisplayDynamic");
        Chord instance = null;
        boolean expResult = false;
        boolean result = instance.getDisplayDynamic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Chord.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        Chord instance = null;
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Chord.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Chord instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}