package com.mjs_svc.lywriter.plugins.lilypond.input;

import com.mjs_svc.lywriter.api.MusicObject;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Generator.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class Generator {

    protected MusicObject obj;
    protected StringTokenizer tokenizer;
    protected HashMap<String, Object> patterns;

    /**
     *
     * @param _tokenizer
     */
    public Generator(StringTokenizer _tokenizer) {
        tokenizer = _tokenizer;
    }

    /**
     *
     * @return
     */
    public abstract MusicObject generate();

    /**
     *
     * @return
     */
    public abstract boolean producesObject();
}
