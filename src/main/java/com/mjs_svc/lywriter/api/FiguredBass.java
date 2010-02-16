package com.mjs_svc.lywriter.api;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: FiguredBass.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class FiguredBass extends BarObject {
    private BarObject anchor;
    private String romanNumeral;
    private HashMap<String, Integer> figure;

    public FiguredBass(BarObject _anchor) throws NoSuchMethodError {
        anchor = _anchor;
        throw new NoSuchMethodError("Not implemented yet");
    }

    public void add(String figure, int modifications) {

    }
}
