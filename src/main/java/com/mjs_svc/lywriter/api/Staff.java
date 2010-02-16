package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Staff.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Staff extends ScoreObject  {
    private Voice[] voices = new Voice[4];
    private Instrument instrument;
    private boolean isOneVoice = true;
    private int type;

    /**
     *
     * @param _instrument
     */
    public Staff(Instrument _instrument) {
        instrument = _instrument;
    }

    /**
     *
     * @param _instrument
     */
    public void setInstrument(Instrument _instrument) {
        instrument = _instrument;

        for (Voice v : voices) {
            if (v instanceof Voice) {
                v.setInstrument(instrument);
            }
        }
    }

    /**
     *
     * @return
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     *
     * @param s
     */
    public void set(int index, Voice v) throws IndexOutOfBoundsException {
        voices[index] = v;
        if (index > 1) isOneVoice = false;
        voices[index].setInstrument(instrument);
        voices[index].setParent(this);
    }

    /**
     *
     * @param index
     * @return
     */
    public Voice get(int index) {
        return voices[index];
    }

    /**
     *
     * @return
     */
    public boolean getIsOneVoice() {
        return isOneVoice;
    }

    /**
     *
     * @param _type
     */
    public void setType(int _type) {
        type = _type;
    }

    /**
     *
     * @return
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        Vector<Voice> v = new Vector<Voice>();

        for(Voice i : voices) {
            if (i instanceof Voice) {
                v.add(i);
            }
        }

        return v.iterator();
    }
}
