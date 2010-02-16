package com.mjs_svc.lywriter.resources;

import java.util.*;

/**
 * Instrument information - US English
 *
 * @author Matthew Scott
 * @version $Id: Instruments.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Instruments extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    // Instrument information: description, name, short name, GM patch
    // NB: instruments 0-127 reserved for GM instruments
    public static final Object[][] contents = {
        {"0", new String[] {"Accoustic Grand Piano", "Piano", "Pno.", "0"}}
    };
}
