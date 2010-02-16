package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.BarCapacityException;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: PolyphonicPassage.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class PolyphonicPassage extends VoiceObject  {
    private final int MAX_VOICES = 4;
    private Vector<Vector<Bar>> passage = new Vector<Vector<Bar>>();
    private ResourceBundle rb = ResourceBundle.getBundle("com/mjs_svc/lywriter/resources/Errors");

    public void addVoice() {
        if (passage.size() < MAX_VOICES) {
            passage.add(new Vector<Bar>());
            TimeSignature time = passage.get(0).get(0).getTimeSignature();
            for(int i = 0; i < passage.get(0).size(); i++) {
                passage.get(passage.size() - 1).add(new Bar(time));
            }
        } else {
            //XXX throw appropriate exception
        }
    }

    /**
     *
     * @param voice
     * @param b
     * @throws IndexOutOfBoundsException
     * @throws BarCapacityException
     */
    public void add(int voice, BarObject b) throws IndexOutOfBoundsException, BarCapacityException {
        passage.get(voice)
                .get(passage.get(voice).size())
                .add(b);
    }

    /**
     *
     */
    public void extend() {
        TimeSignature time = passage.get(0)
                .get(0)
                .getTimeSignature();
        for (Vector<Bar> b : passage) {
            b.add(new Bar(time));
        }
    }

    /**
     *
     * @param index
     */
    public void remove(int index) {
        for (Vector<Bar> b : passage) {
            b.remove(index);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return passage.get(1).size();
    }

    /**
     * 
     * @param b
     * @return
     */
    public int indexOf(MusicObject b) {
        return passage.indexOf(b);
    }

    /**
     *
     * @param voice
     * @param index
     * @return
     */
    public Bar getBar(int voice, int index) {
        return passage.get(voice).get(index);
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return passage.iterator();
    }
}
