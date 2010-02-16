package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: CommentWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class CommentWriter extends MusicWriter {

    public CommentWriter(MusicObject b) {
        super(b);
    }

    @Override
    public String toString() {
        if (((Comment) obj).getIsMultiline()) {
            return "%{ " + ((Comment) obj).getComment() + "%}";
        } else {
            return "% " + ((Comment) obj).getComment() + "\n";
        }
    }

}
