package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.DurationException;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Clef.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Clef extends BarObject {
    private int clefType;
    private ResourceBundle rb = ResourceBundle.getBundle("resources/Errors");

    /**
     * 
     * @param _clefType
     */
    public Clef(int _clefType) {
        clefType = _clefType;
    }

    /**
     *
     * @return
     */
    public int getClefType() {
        return clefType;
    }

    /**
     *
     * @param _clefType
     */
    public void setClefType(int _clefType) {
        clefType = _clefType;
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

}
