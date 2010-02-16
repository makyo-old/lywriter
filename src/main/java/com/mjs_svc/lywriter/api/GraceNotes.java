package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.DurationException;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: GraceNotes.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class GraceNotes extends BarObject {
    private Vector<Note> notes = new Vector<Note>();
    private int type;
    private ResourceBundle rb = ResourceBundle.getBundle("com.mjs_svc.lywriter.resources.Errors");


    /**
     *
     * @param style
     */
    public GraceNotes(int _type) {
        type = _type;
        duration = 0;
    }

    /**
     *
     * @return
     */
    public int getType() {
        return type;
    }
    
    /**
     * 
     * @param _isAppogiatura
     */
    public void setType(int _type) {
        type = _type;
    }

    /**
     *
     * @param n
     */
    public void add(Note n) {
        notes.add(n);
    }
    
    /**
     * 
     * @param index
     * @return
     */
    public Note get(int index) {
        return notes.get(index);
    }
    
    /**
     * 
     * @param index
     * @return
     */
    public Note remove(int index) {
        return notes.remove(index);
    }
    
    /**
     * 
     * @param n
     * @return
     */
    public boolean remove(Note n) {
        return notes.remove(n);
    }

    /**
     *
     * @param _duration
     * @throws DurationException
     */
    @Override
    public void setDuration(int _duration) throws DurationException {
        throw new DurationException(rb.getString("duration.nondurationobject"));
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return notes.iterator();
    }
}
