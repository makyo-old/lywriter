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
public class LyricsTest {

    public LyricsTest() {
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
     * Test of add method, of class Lyrics.
     */
    @Test
    public void testAdd_String_BarObject() {
        System.out.println("add");
        String text = "";
        BarObject anchor = null;
        Lyrics instance = new Lyrics();
        instance.add(text, anchor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Lyrics.
     */
    @Test
    public void testAdd_LyricsObject() {
        System.out.println("add");
        LyricsObject newLyricsObject = null;
        Lyrics instance = new Lyrics();
        instance.add(newLyricsObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Lyrics.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Lyrics instance = new Lyrics();
        LyricsObject expResult = null;
        LyricsObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Lyrics.
     */
    @Test
    public void testRemove_LyricsObject() {
        System.out.println("remove");
        LyricsObject l = null;
        Lyrics instance = new Lyrics();
        boolean expResult = false;
        boolean result = instance.remove(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Lyrics.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Lyrics instance = new Lyrics();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}