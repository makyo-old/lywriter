package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: TupletWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class TupletWriter extends NoteRestWriter {

    int currentPitch = -1;

    /**
     *
     * @param m
     */
    public TupletWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            if (m instanceof Note) {
                m.setWriter(new NoteWriter(m));
            } else if (m instanceof Rest) {
                m.setWriter(new RestWriter(m));
            } else if (m instanceof SpacerRest) {
                m.setWriter(new SpacerRestWriter(m));
            }
        }
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

    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer("\\times ");
        Tuplet tuplet = (Tuplet) obj;

        toReturn.append(String.valueOf(tuplet.getNumerator()) +
                "/" + String.valueOf(tuplet.getDenominator()) + " { ");

        for (MusicObject m : tuplet) {
            toReturn.append(((NoteRestWriter) tuplet.getWriter()).toString() + " ");
        }

        toReturn.append("}");

        return toReturn.toString();
    }
}
