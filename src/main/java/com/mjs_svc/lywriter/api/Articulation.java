package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Articulation.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Articulation extends BarObject {
    private BarObject anchor;
    private int articulation, placement;

    public Articulation(BarObject _anchor, int _articulation, int _placement) {
        anchor = _anchor;
        articulation = _articulation;
        placement = _placement;

        setParent(anchor);
    }

    /**
     *
     * @return
     */
    public BarObject getAnchor() {
        return anchor;
    }

    /**
     *
     * @return
     */
    public int getArticulation() {
        return articulation;
    }

    /**
     *
     * @return
     */
    public int getPlacement() {
        return placement;
    }

    /**
     *
     * @param _placement
     */
    public void setPlacement(int _placement) {
        placement = _placement;
    }
}
