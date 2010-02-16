package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Voice.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Voice extends ScoreObject {
    private Vector<VoiceObject> voiceContents = new Vector<VoiceObject>();
    private Vector<Lyrics> lyrics = new Vector<Lyrics>();
    private Instrument instrument;
    private TimeSignature currentTime;

    /**
     *
     * @param _instrument
     */
    public void setInstrument(Instrument _instrument) {
        instrument = _instrument;
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
    public void add(VoiceObject s) {
        voiceContents.add(s);
        if (s instanceof TimeSignature) {
            currentTime = (TimeSignature) s;
        }
        s.setParent(this);
    }

    /**
     *
     * @param index
     * @return
     */
    public VoiceObject get(int index) {
        return voiceContents.get(index);
    }

    /**
     *
     * @return
     */
    public TimeSignature getCurrentTimeSignature() {
        return currentTime;
    }

    /**
     *
     * @param index
     * @return
     */
    public VoiceObject remove(int index) {
        return voiceContents.remove(index);
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean  remove(VoiceObject s) {
        return voiceContents.remove(s);
    }

    /**
     *
     * @param s
     * @return
     */
    public int indexOf(VoiceObject s) {
        return voiceContents.indexOf(s);
    }

    /**
     *
     * @return
     */
    public Vector<Lyrics> getLyrics() {
        return lyrics;
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return voiceContents.iterator();
    }
}
