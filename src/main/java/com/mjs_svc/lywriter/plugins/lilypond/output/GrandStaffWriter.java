package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write a grand staff group's Lilypond data
 *
 * @see com.mjs_svc.lywriter.plugins.lilypond.output.StaffGroupWriter
 * @author Matthew Scott
 * @version $Id: GrandStaffWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class GrandStaffWriter extends MusicWriter implements ScoreContext {

    /**
     *
     * @param m
     */
    public GrandStaffWriter(MusicObject _obj) {
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
     * @see com.mjs_svc.lywriter.plugins.LilypondOutput.StaffGroupWriter#scoreInclusion()
     * @return Score context information
     */
    public String scoreInclusion() {
        StringBuffer toReturn = new StringBuffer();

        toReturn.append(indent() + "\\new GrandStaff <<\n");
        for (MusicObject m : obj) {
            toReturn.append(indent(getIndentLevel() + 1) + ((ScoreContext) obj).scoreInclusion());
        }
        toReturn.append(indent() + ">>\n");

        return toReturn.toString();
    }
}

