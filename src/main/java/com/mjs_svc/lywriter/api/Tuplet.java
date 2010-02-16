package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.*;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Tuplet.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Tuplet extends BarObject  {
    private int numerator, denominator, tupletOf, capacity, currentSize;
    private Vector<BarObject> tupletContents = new Vector<BarObject>();
    private ResourceBundle errors = ResourceBundle.getBundle("resources/Errors");

    /**
     *
     * @param _numerator
     * @param _denominator
     * @param _tupletOf
     */
    public Tuplet(int _numerator, int _denominator, int _tupletOf) {
        numerator = _numerator;
        denominator = _denominator;
        tupletOf = _tupletOf;
        try {
            setDuration(numerator * tupletOf);
        } catch (DurationException e) {
            // ignore
        }
        capacity = denominator * tupletOf;
        currentSize = 0;
    }

    /**
     *
     * @param b
     * @throws BarCapacityException
     */
    public void add(BarObject b) throws TupletCapacityException {
        if (b.getDuration() != 0) {
            if (currentSize == capacity) {
                throw new TupletCapacityException(errors.getString("tuplet.capacity.barisfull"));
            }
            if (currentSize + b.getDuration() > capacity) {
                throw new TupletCapacityException(errors.getString("tuplet.capacity.willnotfit"));
            } else {
                currentSize += b.getDuration();
            }
        }
        tupletContents.add(b);
        b.addTupletListener(this);
        b.setParent(this);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     *
     * @param index
     * @return
     */
    public BarObject get(int index) {
        return tupletContents.get(index);
    }

    /**
     *
     * @param index
     * @return
     */
    public BarObject remove(int index) {
        currentSize -= tupletContents.get(index).getDuration();
        return tupletContents.remove(index);
    }

    /**
     *
     * @param b
     * @return
     */
    public boolean remove(BarObject b) {
        if (tupletContents.remove(b)) {
            currentSize -= b.getDuration();
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param durationDelta
     * @throws BarCapacityException
     */
    public void durationChangeListener(int durationDelta) throws TupletCapacityException {
        if (currentSize + durationDelta > capacity) {
            throw new TupletCapacityException(errors.getString("bar.capacity.willnotfit"));
        }
    }

    /**
     *
     * @param _duration
     * @throws DurationException
     */
    @Override
    public void setDuration(int _duration) throws DurationException {
        throw new DurationException(errors.getString("duration.durationlocked"));
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return tupletContents.iterator();
    }

}
