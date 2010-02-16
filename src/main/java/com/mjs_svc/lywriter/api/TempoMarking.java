package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: TempoMarking.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class TempoMarking extends VoiceObject {
    private String text;
    private int tempo;
    private boolean showTempo;

    /**
     *
     * @param _tempo
     */
    public TempoMarking(int _tempo) {
        tempo = _tempo;
        showTempo = true;
    }

    /**
     * 
     * @param _text
     */
    public TempoMarking(String _text) {
        text = _text;
        showTempo = false;
    }

    /**
     *
     * @param _text
     * @param _tempo
     * @param _showTempo
     */
    public TempoMarking(String _text, int _tempo, boolean _showTempo) {
        text = _text;
        tempo = _tempo;
        showTempo = _showTempo;
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
     * @param _text
     */
    public void setText(String _text) {
        text = _text;
    }

    /**
     *
     * @return
     */
    public int getTempo() {
        return tempo;
    }

    /**
     *
     * @param _tempo
     */
    public void setTempo(int _tempo) {
        tempo = _tempo;
    }

    /**
     *
     * @return
     */
    public boolean getShowTempo() {
        return showTempo;
    }

    /**
     *
     * @param _showTempo
     */
    public void setShowTempo(boolean _showTempo) {
        showTempo = _showTempo;
    }
}
