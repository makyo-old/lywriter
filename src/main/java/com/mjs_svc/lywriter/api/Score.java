package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Score.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Score extends MusicObject {
    private Vector<ScoreObject> scoreContents = new Vector<ScoreObject>();
    private int tickFactor = 1, PPQ = 1;
    private Paper paper;
    public Header header = new Header();

    /**
     *
     * @param p
     */
    public void setPaper(Paper p) {
        paper = p;
        try {
            paper.setParent(this);
        } catch (Exception e) {
            // should never happen...
        }
    }

    /**
     * 
     * @param s
     */
    public void add(ScoreObject s) {
        scoreContents.add(s);
        s.setParent(this);
    }

    /**
     *
     * @param _tickFactor
     */
    public void setTickFactor(int _tickFactor) {
        tickFactor = _tickFactor;
    }

    /**
     *
     * @return
     */
    public int getTickFactor() {
        return tickFactor;
    }

    /**
     * 
     * @param _PPQ
     */
    public void setPPQ(int _PPQ) {
        PPQ = _PPQ;
    }

    public int getPPQ() {
        return PPQ;
    }

    /**
     *
     * @param index
     * @return
     */
    public ScoreObject get(int index) {
        return scoreContents.get(index);
    }

    /**
     *
     * @param index
     */
    public ScoreObject remove(int index) {
        return scoreContents.remove(index);
    }

    /**
     *
     * @param s
     */
    public boolean remove(ScoreObject s) {
        return scoreContents.remove(s);
    }

    public int indexOf(ScoreObject s) {
        return scoreContents.indexOf(s);
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return scoreContents.iterator();
    }
}
