package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Output LyricsObjects Lilypond data
 *
 * @author Matthew Scott
 * @version $Id: LyricsObjectWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LyricsObjectWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public LyricsObjectWriter(MusicObject m) {
        super(m);
    }

    /**
     * Output lyric objects as text
     * @return Lilypond lyricmode data
     */
    @Override
    public String toString() {
        return ((LyricsObject) obj).getText();
    }
}
