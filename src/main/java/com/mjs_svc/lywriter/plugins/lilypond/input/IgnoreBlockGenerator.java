package com.mjs_svc.lywriter.plugins.lilypond.input;

import com.mjs_svc.lywriter.api.*;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: IgnoreBlockGenerator.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class IgnoreBlockGenerator extends Generator {

    /**
     * Ignore a block (\command { ... }) by advancing the tokenizer beyond that block
     * @param _tokenizer
     */
    public IgnoreBlockGenerator(StringTokenizer _tokenizer) {
        super(_tokenizer);
        int depth = 0;
        String t = tokenizer.nextToken();
        while (t.contentEquals("}") && depth != 0) {
            if (t.contentEquals("{")) {
                depth++;
            } else if (t.contentEquals("}") && depth > 0) {
                depth--;
            }
            t = tokenizer.nextToken();
        }
    }

    @Override
    public MusicObject generate() {
        return new Clef(0);
    }

    @Override
    public boolean producesObject() {
        return false;
    }
}
