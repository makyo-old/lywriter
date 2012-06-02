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
public class PolyphonicPassageTest {

    public PolyphonicPassageTest() {
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
     * Test of add method, of class PolyphonicPassage.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        int voice = 0;
        BarObject b = null;
        PolyphonicPassage instance = new PolyphonicPassage();
        instance.add(voice, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extend method, of class PolyphonicPassage.
     */
    @Test
    public void testExtend() {
        System.out.println("extend");
        PolyphonicPassage instance = new PolyphonicPassage();
        instance.extend();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PolyphonicPassage.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        PolyphonicPassage instance = new PolyphonicPassage();
        instance.remove(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PolyphonicPassage.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PolyphonicPassage instance = new PolyphonicPassage();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBar method, of class PolyphonicPassage.
     */
    @Test
    public void testGetBar() {
        System.out.println("getBar");
        int voice = 0;
        int index = 0;
        PolyphonicPassage instance = new PolyphonicPassage();
        Bar expResult = null;
        Bar result = instance.getBar(voice, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class PolyphonicPassage.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        PolyphonicPassage instance = new PolyphonicPassage();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}