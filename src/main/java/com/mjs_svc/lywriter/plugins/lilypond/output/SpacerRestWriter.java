package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: SpacerRestWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class SpacerRestWriter extends NoteRestWriter {

    /**
     *
     * @param m
     */
    public SpacerRestWriter(MusicObject m) {
        super(m);
    }

    /**
     *
     * @return
     */
    @Override
    public int getCurrentPitch() {
        return previousPitch;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer(getPrependText() + "s");

        // Append duration if needed
        if (((Rest) obj).getDuration() != previousDuration) {
            toReturn.append(getDisplayDuration());
        }

        // Append line commands
        toReturn.append(getLineEndings());
        toReturn.append(getLineBeginnings());

        return toReturn.toString();
    }
}
