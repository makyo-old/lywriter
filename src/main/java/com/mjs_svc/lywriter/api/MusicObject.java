package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.*;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: MusicObject.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class MusicObject implements Iterable<MusicObject> {
    protected boolean visible = true;
    protected int duration = 0;
    protected long tick, length;
    protected MusicWriter writer;
    protected MusicObject parent;
    protected Vector<Tweak> tweaks;

    /**
     *
     * @param _writer
     */
    public void setWriter(MusicWriter _writer) {
        writer = _writer;
        writer.setMusicObject(this);
    }

    /**
     *
     * @return
     */
    public MusicWriter getWriter() {
        return writer;
    }

    /**
     *
     * @param _parent
     */
    public void setParent(MusicObject _parent) {
        parent = _parent;
    }

    public MusicObject getParent() {
        return parent;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return writer.toString();
    }

    /**
     *
     * @return
     */
    public int getDuration() {
        return duration;
    }

    /**
     *
     * @param _duration
     * @throws DurationException
     */
    public void setDuration(int _duration) throws DurationException {
        duration = _duration;
    }

    /**
     *
     * @return
     */
    public boolean getVisible() {
        return visible;
    }

    /**
     *
     * @param _visible
     */
    public void setVisible(boolean _visible) {
        visible = _visible;
    }

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
    public void setTick(long _tick) throws TickException {
        tick = _tick;
    }

    /**
     *
     * @return
     */
    public long getLength() {
        return length;
    }

    /**
     *
     * @param _length
     */
    public void setLength(int _length) {
        length = _length;
    }

    /**
     *
     * @param t
     */
    public void addTweak(Tweak t) {
        if (!(tweaks instanceof Vector)) {
            tweaks = new Vector<Tweak>();
        }

        tweaks.add(t);
        t.setParent(this);
    }

    /**
     *
     * @return
     */
    public Iterator<MusicObject> iterator() {
        return new Vector<MusicObject>().iterator();
    }
}
