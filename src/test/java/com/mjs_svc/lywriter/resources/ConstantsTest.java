package com.mjs_svc.lywriter.resources;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Scott
 * @version $Id$
 */
public class ConstantsTest {

    /**
     * Test that note ratios are correct (i.e.: 128 hundred twenty-eighth notes per whole note)
     */
    @Test
    public void ratiosTest() {
        System.out.println("ratiosTest");
        assertEquals(128, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.HUNDREDTWENTYEIGHTH_NOTE);
        assertEquals(64, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.SIXTYFOURTH_NOTE);
        assertEquals(32, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.THIRTYSECOND_NOTE);
        assertEquals(16, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.SIXTEENTH_NOTE);
        assertEquals(8, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.EIGHTH_NOTE);
        assertEquals(4, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.QUARTER_NOTE);
        assertEquals(2, APIConstants.Notes.Durations.WHOLE_NOTE / APIConstants.Notes.Durations.HALF_NOTE);
        assertEquals(2, APIConstants.Notes.Durations.BREVE / APIConstants.Notes.Durations.WHOLE_NOTE);
        assertEquals(4, APIConstants.Notes.Durations.LONGA / APIConstants.Notes.Durations.WHOLE_NOTE);
    }
}