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
public class VoiceTest {

    public VoiceTest() {
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
     * Test of setInstrument method, of class Voice.
     */
    @Test
    public void testSetInstrument() {
        System.out.println("setInstrument");
        Instrument _instrument = null;
        Voice instance = new Voice();
        instance.setInstrument(_instrument);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstrument method, of class Voice.
     */
    @Test
    public void testGetInstrument() {
        System.out.println("getInstrument");
        Voice instance = new Voice();
        Instrument expResult = null;
        Instrument result = instance.getInstrument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Voice.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VoiceObject s = null;
        Voice instance = new Voice();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Voice.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Voice instance = new Voice();
        VoiceObject expResult = null;
        VoiceObject result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTimeSignature method, of class Voice.
     */
    @Test
    public void testGetCurrentTimeSignature() {
        System.out.println("getCurrentTimeSignature");
        Voice instance = new Voice();
        TimeSignature expResult = null;
        TimeSignature result = instance.getCurrentTimeSignature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Voice.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Voice instance = new Voice();
        VoiceObject expResult = null;
        VoiceObject result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Voice.
     */
    @Test
    public void testRemove_VoiceObject() {
        System.out.println("remove");
        VoiceObject s = null;
        Voice instance = new Voice();
        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Voice.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Voice instance = new Voice();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}