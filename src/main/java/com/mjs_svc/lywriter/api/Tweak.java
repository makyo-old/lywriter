package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Tweak.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Tweak {
    MusicObject parent;
    String tweakText;

    /**
     *
     * @param m
     */
    public Tweak(MusicObject m) {
        setParent(m);
    }

    /**
     *
     * @param m
     * @param _tweakText
     */
    public Tweak(MusicObject m, String _tweakText) {
        setParent(m);
        setText(_tweakText);
    }

    /**
     * 
     * @param _tweakText
     */
    public void setText(String _tweakText) {
        tweakText = _tweakText;
    }

    /**
     *
     * @param m
     */
    public void setParent(MusicObject m) {
        parent = m;
    }
}
