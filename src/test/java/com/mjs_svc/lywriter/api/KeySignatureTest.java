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
public class KeySignatureTest {

    public KeySignatureTest() {
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
     * Test of getKeySignature method, of class KeySignature.
     */
    @Test
    public void testGetKeySignature() {
        System.out.println("getKeySignature");
        KeySignature instance = null;
        int expResult = 0;
        int result = instance.getKeySignature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeySignature method, of class KeySignature.
     */
    @Test
    public void testSetKeySignature() {
        System.out.println("setKeySignature");
        int _key = 0;
        KeySignature instance = null;
        instance.setKeySignature(_key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}