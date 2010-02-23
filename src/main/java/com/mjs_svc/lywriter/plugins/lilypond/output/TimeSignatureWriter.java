package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write time signature Lilypond data
 *
 * @author Matthew Soctt
 * @version $Id: TimeSignatureWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class TimeSignatureWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public TimeSignatureWriter(MusicObject m) {
        super(m);
    }

    /**
     * Write the time signature
     * @return Lilypond data
     */
    @Override
    public String toString() {
        return "\n" + indent() +
				"\\time " +
				((TimeSignature) obj).getNumerator()
				+ "/" + ((TimeSignature) obj)
				.getDisplayDenominator();
    }
}
