package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Rest.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Rest extends BarObject {
    private int[] articulations;
    private int dynamic;

    /**
     *
     * @param _duration
     */
    public Rest(int _duration) {
        duration = _duration;
    }

    /**
     *
     * @param _articulations
     */
    public void setArticulations(int... _articulations) {
        articulations = _articulations;
    }

    /**
     *
     * @return
     */
    public int[] getArticulations() {
        return articulations;
    }

    /**
     *
     * @return
     */
    public int getDynamic() {
        return dynamic;
    }

    /**
     *
     * @param _dynamic
     */
    public void setDynamic(int _dynamic) {
        dynamic = _dynamic;
    }
}
