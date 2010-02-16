package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.resources.APIConstants;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Note.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Note extends BarObject {
    private int pitch, dynamic, accidental;
    private boolean tiedIn, tiedOut, displayDynamic, beamLeft, beamRight;
    private Vector<Articulation> articulations = new Vector<Articulation>();

    /*private static final int NOTE_GROUP = 1;
    private static final int ACCIDENTAL_GROUP = 2;
    private static final int OCTAVE_MODIFIER = 7;
    private static final int DURATION_GROUP = 10;
    private static final int ARTICULATION_GROUP = 11;
    private static final String PATTERN = "([a-g](((e|i)s)*((e|i)h)*))(('*)|(,*))(\\d*)([_-^][.->^+_|[1-5]])*";*/

    /**
     *
     * @param _pitch
     * @param _duration
     * @param _dynamic
     */
    public Note(int _pitch, int _duration, int _dynamic) {
        pitch = _pitch;
        duration = _duration;
        dynamic = _dynamic;
        tiedIn = false;
        tiedOut = false;
        displayDynamic = false;
    }

    /**
     *
     * @param tiedNote
     */
    public void tieTo(Note tiedNote) {
        tiedOut = true;
        tiedNote.setTiedIn(true);
    }

    /**
     *
     * @param tiedNote
     */
    public void unTieTo(Note tiedNote) {
        tiedOut = false;
        tiedNote.setTiedIn(false);
    }

    /**
     *
     * @return
     */
    public boolean getTiedIn() {
        return tiedIn;
    }

    /**
     *
     * @return
     */
    public boolean getTiedOut() {
        return tiedOut;
    }

    /**
     *
     * @param _tiedIn
     */
    public void setTiedIn(boolean _tiedIn) {
        tiedIn = _tiedIn;
    }

    /**
     *
     * @param _tiedOut
     */
    public void setTiedOut(boolean _tiedOut) {
        tiedOut = _tiedOut;
    }

    /**
     * Add a new articulation
     * @param newArticulation from APIConstants
     * @param articulationPosition from APIConstants
     */
    public void addArticulation(int newArticulation, int articulationPosition) {
        articulations.add(new Articulation(this, newArticulation, articulationPosition));
    }

    /**
     *
     * @param index
     * @return
     */
    public Articulation removeArticulation(int index) {
        return articulations.remove(index);
    }

    /**
     * 
     * @param _articulation
     * @return
     */
    public boolean removeArticulation(Articulation _articulation) {
        return articulations.remove(_articulation);
    }

    /**
     *
     * @return
     */
    public Vector<Articulation> getArticulations() {
        return articulations;
    }

    /**
     *
     * @return
     */
    public int getDynamic() {
        return dynamic;
    }

    /**
     *
     * @param _dynamic
     */
    public void setDynamic(int _dynamic) {
        dynamic = _dynamic;
    }

    /**
     *
     * @return
     */
    public boolean getDisplayDynamic() {
        return displayDynamic;
    }

    /**
     *
     * @param _displayDynamic
     */
    public void setDisplayDynamic(boolean _displayDynamic) {
        displayDynamic = _displayDynamic;
    }

    /**
     *
     * @return
     */
    public int getPitch() {
        return pitch;
    }

    /**
     *
     * @param _pitch
     */
    public void setPitch(int _pitch) {
        pitch = _pitch;
    }

    /**
     *
     * @return
     */
    public int getAccidental() {
        return accidental;
    }

    /**
     *
     * @param _accidental
     */
    public void setAccidental(int _accidental) {
        accidental = _accidental;
    }
}
