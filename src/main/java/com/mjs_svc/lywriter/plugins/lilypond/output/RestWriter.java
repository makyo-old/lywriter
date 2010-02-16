package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: RestWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class RestWriter extends NoteRestWriter {

    /**
     *
     * @param m
     */
    public RestWriter(MusicObject m) {
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
        if (!obj.getVisible()) {
            SpacerRest spacer = new SpacerRest(((Note) obj).getDuration());
            spacer.setWriter(new SpacerRestWriter(spacer));
            return spacer.getWriter().toString();
        }

        StringBuffer toReturn = new StringBuffer(getPrependText() + "r");

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
