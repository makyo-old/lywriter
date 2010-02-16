package com.mjs_svc.lywriter.plugins;

import com.mjs_svc.lywriter.api.*;
import com.mjs_svc.lywriter.exception.TickException;

/**
 *
 * @author Matthew Scott
 * @version $Id: TickWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class TickWriter {
    private int multiplicationFactor = 1;

    /**
     * Construct a new TickWriter and set the ticks on each element in a Book
     * @param b the book on which to set ticks
     */
    public TickWriter(Book b) {
        // Loop through the scores in the book
        for (MusicObject score : b) {
            generateMultiplcationFactor(score); // find a factor for all the notes
            ((Score) score).setTickFactor(multiplicationFactor); // set the factor on the score
            setLengths(score, multiplicationFactor); // set the lengths in ticks of each object in the score
            
            // Finally, loop through the score to set ticks - only Staffs need them,
            // so loop through staffgroups to get all those staffs
            for (MusicObject s : score) {
                if (s instanceof Staff || s instanceof Lyrics) {
                    for (MusicObject voice : s) {
                        voiceHandler((Voice) voice);
                    }
                } else if (s instanceof StaffGroup) {
                    for (MusicObject staff : s) {
                        if (staff instanceof Staff || staff instanceof Lyrics) {
                            for (MusicObject voice : s) {
                                voiceHandler((Voice) voice);
                            }
                        }
                    }
                }
            }
            multiplicationFactor = 1;
        }

    }

    /**
     * Generate a factor that all tuplets will divide into evenly by multiplying
     * the start factor (1) by the denominator of any tuplet we find.
     * @param obj The object to check for tupletitude
     */
    public void generateMultiplcationFactor(MusicObject obj) {
        if (obj instanceof Tuplet) {
            multiplicationFactor *= ((Tuplet) obj).getDenominator();
        }

        for (MusicObject m : obj) {
            generateMultiplcationFactor(m);
        }
    }

    /**
     * Set the length in ticks on every object that has a duration by multiplying
     * its musical duration by the tick factor.  If the object is a tuplet, adjust
     * the factor before setting the lengths of any child objects
     * @param obj the MusicObject to set the length on
     * @param factor the tick factor to multiply by the duration in order to get the length
     */
    public void setLengths(MusicObject obj, int factor) {
        obj.setLength(obj.getDuration() * factor);

        if (obj instanceof Tuplet) {
            factor *= (((Tuplet) obj).getNumerator() / ((Tuplet) obj).getDenominator());
        }

        for(MusicObject m : obj) {
            setLengths(m, factor);
        }
    }

    /**
     * Loop through any objects in a voice to call barHandler() on any bars found,
     * handling polyphonic passages properly.
     * @param v the voice to parse
     */
    public void voiceHandler(Voice v) {
        long currentTick = 0;

        for (MusicObject bar : v) {
            if (bar instanceof Bar) {
                currentTick = barHandler((Bar) bar, currentTick);
            } else if (bar instanceof PolyphonicPassage) {
                long tempTick = currentTick;
                for (MusicObject pvoice : bar) {
                    for (MusicObject b : pvoice) {
                        tempTick = barHandler((Bar) b, currentTick);
                    }
                }
                currentTick = tempTick;
            }
        }
    }

    /**
     * Set the start tick of each object found in a bar
     * @param b the bar to parse
     * @param startTick the current tick at the start of the bar
     * @return the start tick plus the length of the bar in ticks
     */
    public long barHandler(Bar b, long startTick) {
        long tempTick = startTick;

        for (MusicObject obj : b) {
            try  {
                obj.setTick(tempTick);
                tempTick = tempTick + obj.getLength();
            } catch (TickException e) {
                //
            }
        }

        return tempTick;
    }
}
