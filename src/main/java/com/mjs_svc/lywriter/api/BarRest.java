package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: BarRest.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class BarRest extends Bar {
    private boolean isMultirest;

    /**
     *
     * @param time
     */
    public BarRest(TimeSignature time) {
        super(time);
    }

    /**
     *
     * @param _isMultirest
     */
    public void setIsMultirest(boolean _isMultirest) {
        isMultirest = _isMultirest;
    }

    /**
     *
     * @return
     */
    public boolean getIsMultirest() {
        return isMultirest;
    }

}
