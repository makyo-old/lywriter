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
public class GraceNoteTest {

    public GraceNoteTest() {
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
     * Test of getIsAppogiatura method, of class GraceNote.
     */
    @Test
    public void testGetIsAppogiatura() {
        System.out.println("getIsAppogiatura");
        GraceNotes instance = null;
        boolean expResult = false;
        boolean result = instance.getIsAppogiatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAppogiatura method, of class GraceNote.
     */
    @Test
    public void testSetIsAppogiatura() {
        System.out.println("setIsAppogiatura");
        boolean _isAppogiatura = false;
        GraceNotes instance = null;
        instance.setIsAppogiatura(_isAppogiatura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class GraceNote.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        GraceNotes instance = null;
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class GraceNote.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        GraceNotes instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}