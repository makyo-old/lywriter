package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: LineWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LineWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public LineWriter(MusicObject m) {
        super(m);
    }

    /**
     * This outputs nothing, but does add line-listeners to each of the anchor
     * BarObjects.  This needs to be in toString (rather than a constructor)
     * because that's pretty much the only way to ensure that the BarObjects
     * already have Writers attached.
     * @return an empty string
     */
    @Override
    public String toString() {
        ((NoteRestWriter) ((Line) obj).getLeftAnchor().getWriter()).addLineBeginningListener((Line) obj);
        ((NoteRestWriter) ((Line) obj).getRightAnchor().getWriter()).addLineEndListener((Line) obj);
        return "";
    }
}
