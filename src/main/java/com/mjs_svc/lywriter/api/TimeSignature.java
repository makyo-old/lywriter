package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.resources.APIConstants;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: TimeSignature.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class TimeSignature extends VoiceObject {
    private int numerator, denominator;
    private ResourceBundle rb = ResourceBundle.getBundle("com/mjs_svc/lywriter/resources/Errors");

    /**
     *
     * @param _numerator The number of notes - of value specified by the
     * denominator - per bar
     * @param _denominator A note value as taken from
     * <code>com.mjs_svc.lywriter.resource.Constants.Notes.Durations</code>
     */
    public TimeSignature(int _numerator, int _denominator) {
        numerator = _numerator;
        denominator = _denominator;
    }

    /**
     *
     * @param _numerator
     * @param _denominator
     */
    public void setSignature(int _numerator, int _denominator) {
        /*numerator = _numerator;
        denominator = _denominator;*/
        throw new UnsupportedOperationException("Not implemented until we can figure out how to rewrite bars");
    }

    /**
     *
     * @return
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     *
     * @return
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     *
     * @return
     */
    public int getDisplayDenominator() {
        return APIConstants.Notes.Durations.WHOLE_NOTE / denominator;
    }
}
