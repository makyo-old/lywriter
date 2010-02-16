package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write a staff group's Lilypond data
 *
 * @author Matthew Scott
 * @version $Id: StaffGroupWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class StaffGroupWriter extends MusicWriter implements ScoreContext {

    /**
     *
     * @param m
     */
    public StaffGroupWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            if (m instanceof Staff) {
                m.setWriter(new StaffWriter(m));
            } else if (m instanceof Lyrics) {
                m.setWriter(new LyricsWriter(m));
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }

    /**
     * A staff group contains no data, but in the score context, notes which
     * staves belong to it, so simply build the \staffGroup from the appropriate
     * staves
     * @return a string for the \score block
     */
    public String scoreInclusion() {
        StringBuffer toReturn = new StringBuffer();

        // Build the staff group from the score context information of its component staves
        toReturn.append(indent() + "\\new StaffGroup <<\n");
        for (MusicObject m : obj) {
            toReturn.append(indent(getIndentLevel() + 1) + ((ScoreContext) obj).scoreInclusion());
        }
        toReturn.append(indent() + ">>\n");

        return toReturn.toString();
    }
}
