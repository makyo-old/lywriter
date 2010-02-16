package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: BarWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class BarWriter extends MusicWriter {

    int previousPitch, previousDuration;

    /**
     *
     * @param m
     */
    public BarWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            if (m instanceof Note) {
                m.setWriter(new NoteWriter(m));
            } else if (m instanceof Chord) {
                m.setWriter(new ChordWriter(m));
            } else if (m instanceof Tuplet) {
                m.setWriter(new TupletWriter(m));
            } else if (m instanceof Rest) {
                m.setWriter(new RestWriter(m));
            } else if (m instanceof SpacerRest) {
                m.setWriter(new SpacerRestWriter(m));
            }
        }
    }

    /**
     *
     * @param _previousPitch
     */
    public void setPreviousPitch(int _previousPitch) {
        previousPitch = _previousPitch;
    }

    /**
     *
     * @return
     */
    public int getPreviousPitch() {
        return previousPitch;
    }

    /**
     *
     * @param _previousDuration
     */
    public void setPreviousDuration(int _previousDuration) {
        previousDuration = _previousDuration;
    }

    /**
     *
     * @return
     */
    public int getPreviousDuration() {
        return previousDuration;
    }

    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer(indent());

        for (MusicObject m : obj) {
            if (m.getWriter() instanceof NoteRestWriter) {
                ((NoteRestWriter) m.getWriter()).setPreviousPitch(previousPitch);
                ((NoteRestWriter) m.getWriter()).setPreviousDuration(previousDuration);
                previousPitch = ((NoteRestWriter) m.getWriter()).getCurrentPitch();
                previousDuration = ((BarObject) m).getDuration();
            }
            toReturn.append(m.getWriter().toString() + " ");

        }

        return toReturn.toString();
    }
}
