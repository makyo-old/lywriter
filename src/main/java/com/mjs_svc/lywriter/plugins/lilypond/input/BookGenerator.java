package com.mjs_svc.lywriter.plugins.lilypond.input;

import com.mjs_svc.lywriter.api.*;
import java.util.*;
import java.lang.reflect.Constructor;

/**
 *
 * @author Matthew Scott
 * @version $Id: BookGenerator.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class BookGenerator extends Generator {

    /**
     *
     * @param _tokenizer
     */
    public BookGenerator(StringTokenizer _tokenizer) {
        super(_tokenizer);

        patterns = new HashMap<String, Object>();

        patterns.put("\\version", VersionGenerator.class);
        patterns.put("\\layout", IgnoreBlockGenerator.class);
        patterns.put("\\paper", IgnoreBlockGenerator.class);
        //patterns.put("\\score", ScoreGenerator.class);
        //patterns.put("{", MusicBlockGenerator.class);
    }

    public MusicObject generate() {
        Book b = new Book();
        while (tokenizer.hasMoreElements()) {
            String e = tokenizer.nextToken();
            for (String pattern : patterns.keySet()) {
                if (e.matches(pattern)) {
                    // create a new object using the class corresponding to that generator
                    try {
                        Constructor ctor = patterns.get(pattern).getClass().getDeclaredConstructor(StringTokenizer.class);
                        Generator gen = (Generator) ctor.newInstance(tokenizer);
                        if (gen.producesObject()) {
                            MusicObject m = gen.generate();
                            if (m instanceof Header) {
                                b.header = (Header) m;
                            } else if (m instanceof Score) {
                                b.add((Score) m);
                            } else if (m instanceof Paper) {
                                b.setPaper((Paper) m);
                            }
                        }
                    } catch (Exception exc) {
                        //
                        }
                }
            }
        }

        obj = b;
        return obj;
    }

    @Override
    public boolean producesObject() {
        return true;
    }
}
