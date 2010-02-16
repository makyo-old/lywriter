package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write key signature Lilypond data
 *
 * @author Matthew Scott
 * @version $Id: KeySignatureWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class KeySignatureWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public KeySignatureWriter(MusicObject m) {
        super(m);
    }

    /**
     * Write the key signature
     * @return Lilypond data
     */
    @Override
    public String toString() {
        KeySignature key = (KeySignature) obj;
        if (key.getIsMajor()) {
            return "\n" + indent() + "\\key " + Constants.majorKeySignatures[key.getKeySignature()] + " \\major";
        } else {
            return "\n" + indent() + "\\key " + Constants.minorKeySignatures[key.getKeySignature()] + " \\minor";
        }
    }
}
