package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write Lilypond data for lyrics
 *
 * @author Matthew Scott
 * @version $Id: LyricsWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LyricsWriter extends MusicWriter implements ScoreContext {

    /**
     *
     * @param m
     */
    public LyricsWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            m.setWriter(new LyricsObjectWriter(m));
        }
    }

    /**
     * Apply lyrics to a voice in the score context
     * @return Lilypond score context data
     */
    public String scoreInclusion() {
        return indent() + "\\new Lyrics = " + ((Lyrics) obj).getVoiceVarName() + " { s1 }\n" +
                indent() + "\\context Lyrics = " + ((Lyrics) obj).getVoiceVarName() + " \\lyricsto " + ((Lyrics) obj).getVoiceVarName() + " \\" + ((Lyrics) obj).getVoiceVarName() + "lyrics\n";
    }

    /**
     * Compile the LyricsObjects together
     * @return Lilypond data
     */
    @Override
    public String toString() {
        // begin with the variable set to a lyricmode container
        StringBuffer toReturn = new StringBuffer(indent() + ((Lyrics) obj).getVoiceVarName() + "lyrics = \\lyricmode {\n" + indent(getIndentLevel() + 1));

        // add all the lyric data
        for (MusicObject m : obj) {
            toReturn.append(m.getWriter().toString() + " ");
        }

        // close the lyricmode block and return
        toReturn.append("\n" + indent() + "}\n\n");
        return toReturn.toString();
    }
}
