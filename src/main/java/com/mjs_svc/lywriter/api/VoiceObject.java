package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.DurationException;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: VoiceObject.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class VoiceObject extends MusicObject {
    private ResourceBundle rb = ResourceBundle.getBundle("com/mjs_svc/lywriter/resources/Errors");

    @Override
    public void setDuration(int _duration) throws DurationException {
        throw new DurationException(rb.getString("duration.nondurationobject"));
    }
}
