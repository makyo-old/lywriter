package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.DurationException;
import java.util.ResourceBundle;

/**
 *
 * @author Matthew Scott
 * @version $Id: Line.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Line extends VoiceObject {
    private BarObject rightAnchor, leftAnchor;
    private int type, placement;

    /**
     * 
     * @param type
     * @param _leftAnchor
     */
    public Line(int type, BarObject _leftAnchor) {
        leftAnchor = _leftAnchor;
    }

    /**
     *
     * @return
     */
    public BarObject getRightAnchor() {
        return rightAnchor;
    }

    /**
     *
     * @param _rightAnchor
     */
    public void setRightAnchor(BarObject _rightAnchor) {
        rightAnchor = _rightAnchor;
    }

    /**
     *
     * @return
     */
    public BarObject getLeftAnchor() {
        return leftAnchor;
    }

    /**
     *
     * @param _leftAnchor
     */
    public void setLeftAnchor(BarObject _leftAnchor) {
        leftAnchor = _leftAnchor;
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
     * @param _type
     */
    public void setType(int _type) {
        type = _type;
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
