package com.mjs_svc.lywriter.exception;

/**
 *
 * @author Matthew Scott
 * @version $Id: LySyntaxException.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LySyntaxException extends MusicException {

    /**
     * Creates a new instance of <code>LySyntaxException</code> without detail message.
     */
    public LySyntaxException() {
    }


    /**
     * Constructs an instance of <code>LySyntaxException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public LySyntaxException(String msg) {
        super(msg);
    }
}
