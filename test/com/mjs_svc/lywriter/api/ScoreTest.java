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
public class ScoreTest {

    public ScoreTest() {
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
     * Test of add method, of class Score.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ScoreObject s = null;
        Score instance = new Score();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Score.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Score instance = new Score();
        ScoreObject expResult = null;
        ScoreObject result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Score.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Score instance = new Score();
        ScoreObject expResult = null;
        ScoreObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Score.
     */
    @Test
    public void testRemove_ScoreObject() {
        System.out.println("remove");
        ScoreObject s = null;
        Score instance = new Score();
        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Score.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Score instance = new Score();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}