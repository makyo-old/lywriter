package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.*;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Chord.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Chord extends BarObject  {
    private Vector<Note> chordMembers;
    private int dynamic;
    private Vector<Articulation> articulations;
    private boolean displayDynamic;

    /**
     *
     * @param _duration
     * @param _dynamic
     * @param _pitches
     */
    public Chord(int _duration, int _dynamic, int... _pitches) {
        chordMembers = new Vector<Note>(_pitches.length);
        duration = _duration;
        dynamic = _dynamic;
        for (int i : _pitches) {
            chordMembers.add(new Note(i, duration, dynamic));
        }
    }

    /**
     *
     * @param _pitch
     */
    public void add(int _pitch) {
        chordMembers.add(new Note(_pitch, duration, dynamic));
    }

    /**
     *
     * @return
     */
    public Vector<Note> getChordMembers() {
        return chordMembers;
    }

    /**
     *
     * @param index
     * @return
     */
    public Note get(int index) {
        return chordMembers.get(index);
    }

    /**
     *
     * @return
     */
    public int size() {
        return chordMembers.size();
    }

    /**
     *
     * @param index
     */
    public Note remove(int index) {
        return chordMembers.remove(index);
    }

    /**
     *
     * @param n
     */
    public boolean remove(Note n) {
        return chordMembers.remove(n);
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
     * @param _dynamic
     */
    public void setDynamic(int _dynamic) {
        for (Note n : chordMembers) {
            n.setDynamic(_dynamic);
        }
        dynamic = _dynamic;
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
     * @param _displayDynamic
     */
    public void setDisplayDynamic(boolean _displayDynamic) {
        displayDynamic = _displayDynamic;
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
     * @param _duration
     * @throws DurationException
     */
    @Override
    public void setDuration(int _duration) throws DurationException {
        for (Note n : chordMembers) {
            // The following may throw a DurationException,
            // so we don't need to throw one of our own.
            n.setDuration(_duration);
        }
        duration = _duration;
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return chordMembers.iterator();
    }
}