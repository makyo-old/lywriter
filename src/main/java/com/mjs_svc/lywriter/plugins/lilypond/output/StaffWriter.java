package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write a staff's Lilypond data
 *
 * @author Matthew Scott
 * @version $Id: StaffWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class StaffWriter extends MusicWriter implements ScoreContext {

    /**
     *
     * @param m
     */
    public StaffWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            if (m instanceof Voice) {
                m.setWriter(new VoiceWriter(m));
            }
        }
    }

    /**
     * Build the new staff command to include the data from all the component
     * voices.
     * @return A string for the score context
     */
    public String scoreInclusion() {
        // begin with the \new command for the appropriate staff type
        Staff staff = (Staff) obj;
        StringBuffer toReturn = new StringBuffer(indent() + "\\new " + Constants.staves[staff.getType()] + "Staff <<\n");
        int i = 0;

        // If there is only once voice, simply apply the notes to the staff,
        // otherwise, build up a block with each voice labelled.
        if (((Staff) obj).getIsOneVoice()) {
            toReturn.append(indent(getIndentLevel() + 1) + "\\new Voice = " + ((Staff) obj).get(0).getVarName() + " { \\" + staff.get(0).getVarName() + " }\n");
            for (Lyrics l : staff.get(0).getLyrics()) {
                l.getWriter().setIndentLevel(getIndentLevel() + 1);
                toReturn.append(((ScoreContext) l.getWriter()).scoreInclusion());
            }

        } else {
            for (MusicObject m : obj) {
                toReturn.append(indent(getIndentLevel() + 1) + "\\new Voice {\n" +
                        indent(getIndentLevel() + 2) + "\\voice" + (new String[]{"One\n", "Two\n", "Thre\n", "Four\n"})[i] +
                        indent(getIndentLevel() + 2) + " << \\" + ((Voice) m).getVarName() + " >>\n" +
                        indent(getIndentLevel() + 1) + "}\n");
                for (Lyrics l : staff.get(0).getLyrics()) {
                    l.getWriter().setIndentLevel(getIndentLevel() + 1);
                    toReturn.append(((ScoreContext) l.getWriter()).scoreInclusion());
                }
                i++;
            }
        }
        toReturn.append(indent() + ">>\n");
        return toReturn.toString();
    }

    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer();

        for (MusicObject m : obj) {
            ((MusicWriter) m.getWriter()).setIndentLevel(getIndentLevel());
            toReturn.append(indent() + ((VoiceWriter) ((Voice) m).getWriter()).toString() + "\n");
        }

        return toReturn.toString();
    }
}

