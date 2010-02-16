package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;
import com.mjs_svc.lywriter.plugins.Plugin;

/**
 *
 * @author Matthew Scott
 * @version $Id: plugin.java 10 2010-02-16 06:32:51Z mjs@mjs-svc.com $
 */
public class plugin extends Plugin {

    public static final String name = "Lilypond output";
    public static final String category = "File handling";

    /**
     *
     * @param s
     */
    public plugin(Book s) {
        s.setWriter(new BookWriter(s));
    }
}
