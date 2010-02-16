package com.mjs_svc.lywriter.plugins.lilypond.output;

/**
 * Since score blocks can only contain one music statement, we'll need a
 * separate string for the text that's included in the score block from the
 * string generated for each staff/voice.  Objects in the score context
 * implement this interface to return that string
 *
 * @author Matthew Scott
 * @version $Id: ScoreContext.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public interface ScoreContext {

    public String scoreInclusion();
}
