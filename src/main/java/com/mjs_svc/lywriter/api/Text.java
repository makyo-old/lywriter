package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Text.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Text extends BarObject {
    private String text;
    private boolean italic, bold;
    private int position;
    private BarObject anchor;

    /**
     * 
     * @param _anchor
     */
    public Text(BarObject _anchor) {
        anchor = _anchor;
    }
    /**
     *
     * @param _text
     */
    public Text(BarObject _anchor, String _text) {
        anchor = _anchor;
        text = _text;
    }

    /**
     *
     * @param _italic
     * @param _bold
     */
    public void setStyle(boolean _italic, boolean _bold) {
        italic = _italic;
        bold = _bold;
    }

    /**
     *
     * @return
     */
    public boolean getBold() {
        return bold;
    }

    /**
     *
     * @return
     */
    public boolean getItalic() {
        return italic;
    }

    public void setText(String _text) {
        text = _text;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param _position
     */
    public void setPosition(int _position) {
        position = _position;
    }

    /**
     *
     * @return
     */
    public int getPosition() {
        return position;
    }
}


