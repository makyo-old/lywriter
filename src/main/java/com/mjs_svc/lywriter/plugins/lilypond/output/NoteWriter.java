package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: NoteWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class NoteWriter extends NoteRestWriter {

    /**
     *
     * @param m
     */
    public NoteWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            m.setWriter(new NoteWriter(m));
        }
    }

    /**
     *
     * @return
     */
    public String getPitchString() {
        StringBuffer pitchString = new StringBuffer();
        Note note = (Note) obj;

        switch (note.getAccidental()) {
            case 1:
            case 5:
                pitchString.append((new String[]{"b", "c", "", "d", "", "e", "f", "", "g", "", "a", ""})[note.getPitch() % 12]);
                pitchString.append(Constants.accidentals[note.getAccidental()]);
                break;
            case 2:
            case 6:
                pitchString.append((new String[]{"", "d", "", "e", "f", "", "g", "", "a", "", "b", "c"})[note.getPitch() % 12]);
                pitchString.append(Constants.accidentals[note.getAccidental()]);
                break;
            case 4:
            case 8:
                pitchString.append((new String[]{"d", "", "e", "f", "", "g", "", "a", "", "b", "c", ""})[note.getPitch() % 12]);
                pitchString.append(Constants.accidentals[note.getAccidental()]);
                break;
            case 3:
            case 7:
                pitchString.append((new String[]{"", "b", "c", "", "d", "", "e", "f", "", "g", "", "a"})[note.getPitch() % 12]);
                pitchString.append(Constants.accidentals[note.getAccidental()]);
                break;
            case 0:
            default:
                pitchString.append((new String[]{"c", "", "d", "", "e", "f", "", "g", "", "a", "", "b"})[note.getPitch() % 12]);
                break;
        }

        /* Append relativity modifiers, one for each octave beyond the previous
         * pitch (counting from 0) so long as the difference is greater than
         * a perfect fourth
         */
        if (note.getPitch() - previousPitch > 5) {
            for (int i = 0; i <= (note.getPitch() - previousPitch) / 12; i++) {
                pitchString.append("'");
            }
        } else if (previousPitch - note.getPitch() > 5) {
            for (int i = 0; i <= (previousPitch - note.getPitch()) / 12; i++) {
                pitchString.append(",");
            }
        }

        // return the lilypond data
        return pitchString.toString();
    }

    /**
     *
     * @return
     */
    @Override
    public int getCurrentPitch() {
        return ((Note) obj).getPitch();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (!obj.getVisible()) {
            SpacerRest spacer = new SpacerRest(((Note) obj).getDuration());
            spacer.setWriter(new SpacerRestWriter(spacer));
            return spacer.getWriter().toString();
        }

        Note note = (Note) obj;
        StringBuffer toReturn = new StringBuffer(getPrependText() + getPitchString());

        // Append the duration
        if (note.getDuration() != previousDuration) {
            toReturn.append(getDisplayDuration());
        }

        // Append the articulation
        for (Articulation a : note.getArticulations()) {
            if (a.getPlacement() != 0 && a.getVisible()) {
                toReturn.append(Constants.placements[a.getPlacement()] + Constants.articulations[a.getArticulation()]);
            }
        }


        // Append dynamic
        if (note.getDisplayDynamic()) {
            toReturn.append(Constants.dynamics[note.getDynamic()]);
        }

        // Append line commands
        toReturn.append(getLineEndings());
        toReturn.append(getLineBeginnings());

        if (note.getTiedOut()) {
            toReturn.append("~");
        }

        return toReturn.toString();
    }
}
