package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Book.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Book extends MusicObject  {
    private Vector<Score> scores = new Vector<Score>();
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
    public void add(Score s) {
        scores.add(s);
        s.setParent(this);
    }

    /**
     *
     * @param index
     */
    public void remove(int index) {
        scores.remove(index);
    }

    /**
     *
     * @param s
     */
    public void remove(Score s) {
        scores.remove(s);
    }

    /**
     *
     * @return
     */
    public int size() {
        return scores.size();
    }

    /**
     *
     * @param index
     * @return
     */
    public Score get(int index) {
        return scores.get(index);
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return scores.iterator();
    }
}