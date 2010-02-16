package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: BarLine.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class BarLine extends VoiceObject {
    private int lineType;

    /**
     *
     * @param _barline
     */
    public BarLine(int _barline) {
        lineType = _barline;
    }

    /**
     *
     * @return
     */
    public int getLineType() {
        return lineType;
    }

    /**
     *
     * @param _lineType
     */
    public void setLineType(int _lineType) {
        lineType = _lineType;
    }
}
