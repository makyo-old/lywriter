package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: GraceNotesWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class GraceNotesWriter extends NoteRestWriter {

    int currentPitch = -1;

    /**
     *
     * @param _obj
     */
    public GraceNotesWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            ((Note) m).setWriter(new NoteWriter(m));
        }
    }

    @Override
    public int getCurrentPitch() {
        if (currentPitch == -1) {
            toString();
        }

        return currentPitch;
    }

    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer();
        GraceNotes notes = (GraceNotes) obj;

        toReturn.append(Constants.graceNoteTypes[notes.getType()] + " {");
        for (MusicObject m : notes) {
            toReturn.append(((NoteWriter) ((Note) m).getWriter()).toString() + " ");
        }
        toReturn.setCharAt(toReturn.length() - 1, '}');

        return toReturn.toString();
    }
}
