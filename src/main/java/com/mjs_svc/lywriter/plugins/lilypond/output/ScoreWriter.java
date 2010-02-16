package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write a score to the book
 *
 * @author Matthew Scott
 * @version $Id: ScoreWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class ScoreWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public ScoreWriter(MusicObject _obj) {
        super(_obj);

        if (((Score) obj).header instanceof Header) {
            ((Score) obj).header.setWriter(new HeaderWriter(((Score) obj).header));
        }
        for (MusicObject m : obj) {
            if (m instanceof Staff) {
                m.setWriter(new StaffWriter(m));
            } else if (m instanceof ChoirStaff) {
                m.setWriter(new ChoirStaffWriter(m));
            } else if (m instanceof GrandStaff) {
                m.setWriter(new GrandStaffWriter(m));
            } else if (m instanceof StaffGroup) {
                m.setWriter(new StaffGroupWriter(m));
            } else if (m instanceof Lyrics) {
                m.setWriter(new LyricsWriter(m));
            }
        }
    }

    /**
     * Generate not only the score block but the data (stored as variables)
     * as well, using the child elements' toString and scoreInclusion methods
     * @return A string containing all the Lilypond data about a score
     */
    @Override
    public String toString() {
        // A string buffer each for the voice/staff data and the score context information
        StringBuffer scoreContextData = new StringBuffer(), staffData = new StringBuffer();

        // Cast for ease of use
        Score score = (Score) obj;

        // begin the \score block
        scoreContextData.append(indent() + "\\score {\n" + indent(getIndentLevel() + 1) + "<<\n");

        // loop through each element and add the data and score context information to the appropriate buffer
        for (MusicObject s : score) {
            s.getWriter().setIndentLevel(getIndentLevel());
            staffData.append(s.getWriter().toString());
            s.getWriter().setIndentLevel(getIndentLevel() + 2);
            scoreContextData.append(((ScoreContext) s.getWriter()).scoreInclusion());
        }

        // close the \score block and return the appended buffers
        scoreContextData.append(indent(getIndentLevel() + 1) + ">>\n" + indent() + "}\n\n");
        return staffData.append(scoreContextData).toString();
    }
}
