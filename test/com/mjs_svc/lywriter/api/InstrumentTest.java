package com.mjs_svc.lywriter.api;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Scott
 * @version $Id$
 */
public class InstrumentTest {

    /**
     * Test of getInstrumentList method, of class Instrument by making sure
     */
    @Test
    public void testGetInstrumentList() {
        System.out.println("getInstrumentList");
        ResourceBundle instruments = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Instruments");
        Instrument instance = new Instrument(
                instruments.getStringArray("0")[0],
                instruments.getStringArray("0")[1],
                instruments.getStringArray("0")[2],
                Integer.parseInt(instruments.getStringArray("0")[3]));
        //assertTrue(Constants.SupportedLocales().contains(Locale.getDefault()));
        assertEquals(instance.description, instance.getInstrumentList().get(0).description);
        assertEquals(instance.name, instance.getInstrumentList().get(0).name);
        assertEquals(instance.shortName, instance.getInstrumentList().get(0).shortName);
    }

}