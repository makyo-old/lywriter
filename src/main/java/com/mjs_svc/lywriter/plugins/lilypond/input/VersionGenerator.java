package com.mjs_svc.lywriter.plugins.lilypond.input;

import com.mjs_svc.lywriter.api.*;
import java.util.*;

/**
 *
 * @author Matthew
 */
public class VersionGenerator extends Generator {

    /**
     *
     * @param _tokenizer
     */
    public VersionGenerator(StringTokenizer _tokenizer) {
        super(_tokenizer);
    }

    public MusicObject generate() {
        // just ignore this
        return new Clef(0);
    }

    @Override
    public boolean producesObject() {
        return false;
    }
}
