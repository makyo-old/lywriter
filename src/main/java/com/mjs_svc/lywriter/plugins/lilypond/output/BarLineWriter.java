package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write barline Lilypond data
 *
 * @author Matthew Scott
 * @version $Id: BarLineWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class BarLineWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public BarLineWriter(MusicObject m) {
        super(m);
    }

    /**
     * Write the barline
     * @return Lilypond data
     */
    @Override
    public String toString() {
        return "\\bar \"" + Constants.barLines[((BarLine) obj).getLineType()] + "\"\n";
    }
}
