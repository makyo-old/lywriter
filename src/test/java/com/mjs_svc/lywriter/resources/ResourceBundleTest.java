package com.mjs_svc.lywriter.resources;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id$
 */
public class ResourceBundleTest {
    public static ResourceBundle errors, menus, instruments;

    @BeforeClass
    public static void setUpClass() throws Exception {
        errors = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Errors");
        menus = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Menus");
        instruments = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Instruments");
    }

    @Test
    public void errorsTest() {
        System.out.println("errorsTest");

        assertTrue(errors.containsKey("bar.capacity.willnotfit"));
        assertTrue(errors.containsKey("bar.capacity.barisfull"));

        assertTrue(errors.containsKey("tuplet.capacity.willnotfit"));
        assertTrue(errors.containsKey("tuplet.capacity.tupletisfull"));
        assertTrue(errors.containsKey("tuplet.creation.cannotcrossbarline"));

        assertTrue(errors.containsKey("duration.nondurationobject"));
        assertTrue(errors.containsKey("duration.durationlocked"));

        assertTrue(errors.containsKey("tick.nontickobject"));
    }

    @Test
    public void menusTest() {
        System.out.println("menusTest");

        assertTrue(menus.containsKey("file"));
        assertTrue(menus.containsKey("file.open"));
        assertTrue(menus.containsKey("file.save"));
        assertTrue(menus.containsKey("file.saveas"));
        assertTrue(menus.containsKey("file.exit"));

        assertTrue(menus.containsKey("edit"));
        assertTrue(menus.containsKey("edit.cut"));
        assertTrue(menus.containsKey("edit.copy"));
        assertTrue(menus.containsKey("edit.paste"));
        assertTrue(menus.containsKey("edit.delete"));

        assertTrue(menus.containsKey("score"));

        assertTrue(menus.containsKey("staff"));

        assertTrue(menus.containsKey("tools"));

        assertTrue(menus.containsKey("help"));
        assertTrue(menus.containsKey("help.contents"));
        assertTrue(menus.containsKey("help.about"));
    }

    @Test
    public void instrumentsTest() {
        System.out.print("instrumentsTest");

        // make sure we have at least 128 instruments before testing them all
        assertTrue(
                "There should be at least 128 instruments - one for each GM patch",
                instruments.keySet().size() >= 128);
        
        // Test for instruments 0-128 - GM instruments
        for (int i = 0; i < 128; i++) {
            assertTrue(instruments.containsKey(String.valueOf(i)));
        }
    }
}