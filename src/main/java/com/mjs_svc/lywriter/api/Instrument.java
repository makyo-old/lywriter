package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Instrument.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Instrument {
    public String description, name, shortName;
    public int GMpatch;

    /**
     *
     * @param _description
     * @param _name
     * @param _shortName
     * @param _GMpatch
     */
    public Instrument(String _description, String _name, String _shortName, int _GMpatch) {
        description = _description;
        name = _name;
        shortName = _shortName;
        GMpatch = _GMpatch;
    }

    /**
     *
     */
    public Instrument() {

    }

    /**
     * Get a localized list of instruments and their information
     * @return
     */
    public Vector<Instrument> getInstrumentList() {
        Vector<Instrument> instruments = new Vector<Instrument>();
        ResourceBundle rb = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Instruments");


        for (String k : rb.keySet()) {
            instruments.add(new Instrument(
                    rb.getStringArray(k)[0], 
                    rb.getStringArray(k)[1], 
                    rb.getStringArray(k)[2], 
                    Integer.parseInt(rb.getStringArray(k)[3])));
        }

        return instruments;
    }
}
