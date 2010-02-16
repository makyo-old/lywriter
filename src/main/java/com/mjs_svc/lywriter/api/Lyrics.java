package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Lyrics.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Lyrics extends MusicObject {
    private String voiceVarName;
    private Vector<LyricsObject> lyricsText = new Vector<LyricsObject>();
    private ResourceBundle rb = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Errors");

    /**
     * 
     * @param _voiceVarName
     */
    public Lyrics(String _voiceVarName) {
        voiceVarName = _voiceVarName;
    }

    /**
     *
     * @return
     */
    public String getVoiceVarName() {
        return voiceVarName;
    }

    /**
     *
     * @param _voiceVarName
     */
    public void setStaffVarName(String _staffVarName) {
        voiceVarName = _staffVarName;
    }

    /**
     * 
     * @param index
     * @return
     */
    public LyricsObject get(int index) {
        return lyricsText.get(index);
    }

    /**
     * 
     * @param text
     * @param anchor
     */
    public void add(String text, BarObject anchor) {
        lyricsText.add(new LyricsObject(text, anchor));
    }

    /**
     *
     * @param newLyricsObject
     */
    public void add(LyricsObject newLyricsObject) {
        lyricsText.add(newLyricsObject);
    }

    /**
     *
     * @param index
     */
    public LyricsObject remove(int index) {
        return lyricsText.remove(index);
    }

    /**
     *
     * @param l
     */
    public boolean remove(LyricsObject l) {
        return lyricsText.remove(l);
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return lyricsText.iterator();
    }
}
