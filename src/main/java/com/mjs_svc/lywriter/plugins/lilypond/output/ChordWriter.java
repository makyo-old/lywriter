package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: ChordWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class ChordWriter extends NoteRestWriter {

    int currentPitch = -1;

    /**
     *
     * @param m
     */
    public ChordWriter(MusicObject m) {
        super(m);
    }

    /**
     *
     * @return
     */
    @Override
    public int getCurrentPitch() {
        if (currentPitch == -1) {
            toString();
        }
        return currentPitch;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (!obj.getVisible()) {
            SpacerRest spacer = new SpacerRest(((Chord) obj).getDuration());
            spacer.setWriter(new SpacerRestWriter(spacer));
            return spacer.getWriter().toString();
        }

        StringBuffer toReturn = new StringBuffer(getPrependText() + "<");
        Chord chord = (Chord) obj;

        // Get the pitch strings for the chord members
        for (MusicObject m : chord) {
            toReturn.append(((NoteWriter) ((Note) m).getWriter()).getPitchString() + " ");
            currentPitch = ((Note) m).getPitch();
        }

        // Replace the final space with a close-chord symbol
        toReturn.setCharAt(toReturn.length() - 1, '>');

        // Append duration if needed
        if (chord.getDuration() != previousDuration) {
            toReturn.append(getDisplayDuration());
        }

        // Append articulations
        for (Articulation a : chord.getArticulations()) {
            if (a.getPlacement() != 0 && a.getVisible()) {
                toReturn.append(Constants.placements[a.getPlacement()] + Constants.articulations[a.getArticulation()]);
            }
        }


        // Append dynamic if displayed
        if (chord.getDisplayDynamic()) {
            toReturn.append(Constants.dynamics[chord.getDynamic()]);
        }

        // Append line commands
        toReturn.append(getLineEndings());
        toReturn.append(getLineBeginnings());

        return toReturn.toString();
    }
}
