package com.mjs_svc.lywriter.plugins.lilypond.input;

import com.mjs_svc.lywriter.api.*;
import com.mjs_svc.lywriter.plugins.Plugin;
import java.util.*;

/**
 * 
 * @author Matthew Scott
 * @version $Id: LilypondInput.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LilypondInput extends Plugin {

    public static final String name = "Lilypond input";
    public static final String category = "File Handling";
    private StringTokenizer input;
    private Book output;

    /**
     * 
     * @param s
     */
    public LilypondInput(String in) {
        input = new StringTokenizer(in);
        BookGenerator gen = new BookGenerator(input);
        output = (Book) gen.generate();
    }

    /**
     *
     * @return
     */
    public Book getOutput() {
        return output;
    }

    /**
     *
     * @param in
     */
    public void setInput(String in) {
        input = new StringTokenizer(in);
        BookGenerator gen = new BookGenerator(input);
        output = (Book) gen.generate();
    }
}
