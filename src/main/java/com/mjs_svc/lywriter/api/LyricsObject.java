package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: LyricsObject.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class LyricsObject extends VoiceObject {
    private String text;
    private BarObject anchor;

    public LyricsObject(String _text, BarObject _anchor) {
        text = _text;
        anchor = _anchor;
    }

    public String getText() {
        return text;
    }

    public void setText(String _text) {
        text = _text;
    }

    public BarObject getAnchor() {
        return anchor;
    }

    public void setAnchor(BarObject _anchor) {
        anchor = _anchor;
    }
}
