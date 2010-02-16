package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write lilypond voice data
 *
 * @author Matthew Scott
 * @version $Id: VoiceWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class VoiceWriter extends MusicWriter {

    int currentRelative = 60;
    int currentDuration = 4;

    /**
     *
     * @param m
     */
    public VoiceWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            if (m instanceof KeySignature) {
                m.setWriter(new KeySignatureWriter(m));
            } else if (m instanceof TimeSignature) {
                m.setWriter(new TimeSignatureWriter(m));
            } else if (m instanceof PolyphonicPassage) {
                m.setWriter(new PolyphonicPassageWriter(m));
            } else if (m instanceof Line) {
                m.setWriter(new LineWriter(m));
            } else if (m instanceof Bar) {
                m.setWriter(new BarWriter(m));
            } else if (m instanceof BarRest) {
                m.setWriter(new BarRestWriter(m));
            } else if (m instanceof BarLine) {
                m.setWriter(new BarLineWriter(m));
            }
        }

        for (Lyrics l : ((Voice) obj).getLyrics()) {
            l.setWriter(new LyricsWriter(l));
        }
    }

    /**
     * Build the variable that will contain the new voice object which will
     * be a component of a staff object
     * @return The Lilypond data for the voice object
     */
    @Override
    public String toString() {
        Voice voice = (Voice) obj;
        StringBuffer toReturn = new StringBuffer();

        // Begin with a new voice command and metadata set
        toReturn.append(indent() + voice.getVarName() + " = \\relative {\n");
        toReturn.append(indent(getIndentLevel() + 1) + "\\set Staff.instrumentName = #\"" + voice.getInstrument().name + "\"\n");
        toReturn.append(indent(getIndentLevel() + 1) + "\\set Staff.shortInstrumentName = #\"" + voice.getInstrument().shortName + "\"\n");

        // Get the data for each VoiceObject contained within
        for (MusicObject s : voice) {
            // set the bar's starting relative pitch
            if (s instanceof Bar) {
                ((BarWriter) ((Bar) s).getWriter()).setPreviousPitch(currentRelative);
                ((BarWriter) ((Bar) s).getWriter()).setPreviousDuration(currentDuration);
            }

            // Append the object's lilypond data
            if (toReturn.charAt(toReturn.length() - 1) == '\n') {
                s.getWriter().setIndentLevel(getIndentLevel() + 1);
            } else {
                toReturn.append(' ');
            }
            toReturn.append(s.getWriter().toString());

            // Add a newline and indentation between two adjacent bars
            if (s instanceof Bar && voice.get(voice.indexOf((VoiceObject) s) + 1) instanceof Bar) {
                toReturn.append("\n");
            }

            // set the current relative to the bar's last pitch
            if (s instanceof Bar) {
                currentRelative = ((BarWriter) ((Bar) s).getWriter()).getPreviousPitch();
                currentDuration = ((BarWriter) ((Bar) s).getWriter()).getPreviousDuration();
            }
        }

        // Finish and add lyrics
        toReturn.append(indent() + "}\n\n");
        for (Lyrics l : voice.getLyrics()) {
            l.getWriter().setIndentLevel(getIndentLevel());
            toReturn.append(l.getWriter().toString());
        }

        return toReturn.toString();
    }
}
