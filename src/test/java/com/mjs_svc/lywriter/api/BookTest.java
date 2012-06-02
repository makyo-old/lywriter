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
public class BookTest {

    public BookTest() {
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
     * Test of add method, of class Book.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Score s = null;
        Book instance = new Book();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Book.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Book instance = new Book();
        instance.remove(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Book.
     */
    @Test
    public void testRemove_Score() {
        System.out.println("remove");
        Score s = null;
        Book instance = new Book();
        instance.remove(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Book.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Book.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Book instance = new Book();
        Score expResult = null;
        Score result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Book.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Book instance = new Book();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}