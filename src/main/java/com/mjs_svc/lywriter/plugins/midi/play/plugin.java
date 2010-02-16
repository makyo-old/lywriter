package com.mjs_svc.lywriter.plugins.midi.play;

import com.mjs_svc.lywriter.plugins.*;
import com.mjs_svc.lywriter.plugins.midi.output.MidiOutput;
import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: plugin.java 9 2010-02-13 01:59:44Z mjs@mjs-svc.com $
 */
public class plugin extends Plugin {
    public static final String name = "MIDI playback";
    public static final String category = "Playback";

    /**
     *
     * @param s
     */
    public plugin(Score s) {
        MidiOutput midi = new MidiOutput(s, true);
    }

}
