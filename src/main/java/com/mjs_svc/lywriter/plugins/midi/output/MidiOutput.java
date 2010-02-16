
package com.mjs_svc.lywriter.plugins.midi.output;

import com.mjs_svc.lywriter.api.*;
import com.mjs_svc.lywriter.plugins.Plugin;

/**
 *
 * @author Matthew Scott
 * @version $Id: MidiOutput.java 10 2010-02-16 06:32:51Z mjs@mjs-svc.com $
 */
public class MidiOutput extends Plugin {
    public static final String name = "MIDI output";
    public static final String category = "File Handling";

    /**
     *
     * @param s
     */
    public MidiOutput(Book s) {

    }

    /**
     * For use by MidiPlay and other classes that just need a MIDI representation;
     * not meant for use by the plugin structure.  This function simply generates
     * the MIDI data.  It performs no saving or output functions.
     * @param s
     * @param donotsave
     */
    public MidiOutput(Score s, boolean donotsave) {

    }

}
