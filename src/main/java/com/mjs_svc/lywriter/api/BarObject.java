package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: BarObject.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class BarObject extends MusicObject {
    private long tick;
    protected MusicObject container;

    /**
     *
     * @return
     */
    public long getTick() {
        return tick;
    }

    /**
     *
     * @param _tick
     */
    public void setTick(long _tick) {
        tick = _tick;
    }

    /**
     *
     * @param _container
     */
    public void addBarListener(Bar _container) {
        container = _container;
    }

    /**
     *
     * @param _container
     */
    public void addTupletListener(Tuplet _container) {
        container = _container;
    }

    /**
     *
     * @param _duration
     * @throws DurationException
     */
    @Override
    public void setDuration(int _duration) throws DurationException {
        try {
            if (container instanceof Bar) {
                ((Bar) container).durationChangeListner(_duration - duration);
            } else if (container instanceof Tuplet) {
                ((Tuplet) container).durationChangeListener(_duration - duration);
            }
        } catch (BarCapacityException e) {
            throw new DurationException(e.toString());
        } catch (TupletCapacityException e) {
            throw new DurationException(e.toString());
        }
        
        duration = _duration;
    }
}
