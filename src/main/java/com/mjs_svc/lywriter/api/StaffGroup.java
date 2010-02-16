package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: StaffGroup.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class StaffGroup extends ScoreObject  {
    protected Vector<ScoreObject> staves = new Vector<ScoreObject>();
    private boolean brace, bracket, subBracket;
    private String name, shortName;

    /**
     *
     * @param _name
     * @param _shortName
     */
    public void setText(String _name, String _shortName) {
        name = _name;
        shortName = _shortName;
    }

    /**
     * 
     * @param s
     */
    public void add(ScoreObject s) {
        staves.add(s);
        s.setParent(this);
    }

    /**
     *
     * @param index
     * @return
     */
    public ScoreObject remove(int index) {
        return staves.remove(index);
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean remove(ScoreObject s) {
        return staves.remove(s);
    }

    /**
     * 
     * @param _name
     */
    public void setName(String _name) {
        name = _name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param _shortName
     */
    public void setShortName(String _shortName) {
        shortName = _shortName;
    }

    /**
     *
     * @return
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return staves.iterator();
    }
}
