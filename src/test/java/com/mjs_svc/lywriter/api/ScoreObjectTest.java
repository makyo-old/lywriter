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
 *
 */
public class ScoreObjectTest {

    public ScoreObjectTest() {
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
     * Test of setDuration method, of class ScoreObject.
     */
    @Test
    public void testSetDuration() throws Exception {
        System.out.println("setDuration");
        int _duration = 0;
        ScoreObject instance = new ScoreObjectImpl();
        instance.setDuration(_duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTick method, of class ScoreObject.
     */
    @Test
    public void testSetTick() throws Exception {
        System.out.println("setTick");
        long _tick = 0L;
        ScoreObject instance = new ScoreObjectImpl();
        instance.setTick(_tick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ScoreObjectImpl extends ScoreObject {
    }

}