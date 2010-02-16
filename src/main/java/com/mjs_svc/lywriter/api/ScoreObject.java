package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.*;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: ScoreObject.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class ScoreObject extends MusicObject {
    private ResourceBundle rb = ResourceBundle.getBundle("com/mjs_svc/lywriter/resources/Errors");
    protected String varName;

    /**
     *
     * @param _varName
     */
    public void setVarName(String _varName) {
        varName = _varName;
    }

    /**
     *
     * @return
     */
    public String getVarName() {
        if (varName instanceof String) {
            return varName;
        } else {
            return Integer.toHexString(((Object) this).hashCode());
        }
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
     * @param _tick
     * @throws TickException
     */
    @Override
    public void setTick(long _tick) throws TickException {
        throw new TickException(rb.getString("tick.nontickobject"));
    }
}
