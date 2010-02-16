package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.BarCapacityException;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Bar.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Bar extends VoiceObject {
    private Vector<BarObject> barContents;
    private int capacity, currentSize, barNumber;
    private TimeSignature myTime;
    private ResourceBundle errors = ResourceBundle.getBundle("com/mjs_svc/lywriter/resources/Errors");

    /**
     * Create a new bar of the given size
     * @param time A time signature representing how large the bar is
     */
    public Bar(TimeSignature time) {
        myTime = time;
        capacity = myTime.getNumerator() * myTime.getDenominator();
        currentSize = 0;
        barContents = new Vector<BarObject>();
    }

    /**
     * 
     * @return
     */
    public TimeSignature getTimeSignature() {
        return myTime;
    }

    /**
     *
     * @return
     */
    public int getBarNumber() {
        return barNumber;
    }

    /**
     *
     * @param _barNumber
     */
    public void setBarNumber(int _barNumber) {
        barNumber = _barNumber;
    }

    /**
     *
     * @param b
     * @throws BarCapacityException
     */
    public void add(BarObject b) throws BarCapacityException {
        if (b.getDuration() != 0) {
            if (currentSize == capacity) {
                throw new BarCapacityException(errors.getString("bar.capacity.barisfull"));
            }
            if (currentSize + b.getDuration() > capacity) {
                throw new BarCapacityException(errors.getString("bar.capacity.willnotfit"));
            } else {
                currentSize += b.getDuration();
            }
        }
        barContents.add(b);
        b.addBarListener(this);
        b.setParent(this);
    }
    
    /**
     * 
     * @param index
     * @return
     */
    public BarObject get(int index) {
        return barContents.get(index);
    }

    /**
     *
     * @param index
     * @return
     */
    public BarObject remove(int index) {
        currentSize -= barContents.get(index).getDuration();
        return barContents.remove(index);
    }

    /**
     *
     * @param b
     * @return
     */
    public boolean remove(BarObject b) {
        if (barContents.remove(b)) {
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
    public void durationChangeListner(int durationDelta) throws BarCapacityException {
        if (currentSize + durationDelta > capacity) {
            throw new BarCapacityException(errors.getString("bar.capacity.willnotfit"));
        }
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return barContents.iterator();
    }
}
