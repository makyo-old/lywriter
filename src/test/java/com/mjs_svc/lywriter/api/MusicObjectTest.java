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
public class MusicObjectTest {

    public MusicObjectTest() {
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
     * Test of getDuration method, of class MusicObject.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        MusicObject instance = new MusicObjectImpl();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class MusicObject.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        MusicObject instance = new MusicObjectImpl();
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisible method, of class MusicObject.
     */
    @Test
    public void testGetVisible() {
        System.out.println("getVisible");
        MusicObject instance = new MusicObjectImpl();
        boolean expResult = false;
        boolean result = instance.getVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class MusicObject.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean _visible = false;
        MusicObject instance = new MusicObjectImpl();
        instance.setVisible(_visible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTick method, of class MusicObject.
     */
    @Test
    public void testGetTick() {
        System.out.println("getTick");
        MusicObject instance = new MusicObjectImpl();
        long expResult = 0L;
        long result = instance.getTick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTick method, of class MusicObject.
     */
    @Test
    public void testSetTick() throws Exception {
        System.out.println("setTick");
        long _tick = 0L;
        MusicObject instance = new MusicObjectImpl();
        instance.setTick(_tick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class MusicObject.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        MusicObject instance = new MusicObjectImpl();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MusicObjectImpl extends MusicObject {
    }

}