package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;
import com.mjs_svc.lywriter.resources.APIConstants;
import java.util.*;

/**
 * Abstract class for use with note and rest writer classes
 *
 * @author Matthew Scott
 * @version $Id: NoteRestWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class NoteRestWriter extends MusicWriter {

    int previousPitch, previousDuration;
    protected Vector<Line> lineBeginnings = new Vector<Line>(), lineEndings = new Vector<Line>();
    protected StringBuffer prependText;

    /**
     *
     * @param m
     */
    public NoteRestWriter(MusicObject m) {
        super(m);
    }

    public String getDisplayDuration() {
        StringBuffer toReturn = new StringBuffer();
        if (obj.getDuration() <= APIConstants.Notes.Durations.WHOLE_NOTE) {
            toReturn.append(APIConstants.Notes.Durations.WHOLE_NOTE / obj.getDuration());
            if (obj.getDuration() % APIConstants.Notes.Durations.WHOLE_NOTE == obj.getDuration() / 2) {
                toReturn.append(".");
            } else if (obj.getDuration() % APIConstants.Notes.Durations.WHOLE_NOTE == obj.getDuration() * 3 / 4) {
                toReturn.append("..");
            }
        } else {
            switch (obj.getDuration()) {
                case 192:
                    toReturn.append("1.");
                    break;
                case 265:
                    toReturn.append("\\breve");
                    break;
                case 512:
                    toReturn.append("\\longa");
                    break;
                default:
                    break;
            }
        }
        return toReturn.toString();
    }

    /**
     * Listen for the start of a line
     * @param l the line
     */
    public void addLineBeginningListener(Line l) {
        lineBeginnings.add(l);
    }

    /**
     * Listen for the ending of a line
     * @param l the line
     */
    public void addLineEndListener(Line l) {
        lineEndings.add(l);
    }

    public String getPrependText() {
        prependText = new StringBuffer();

        for (Line l : lineBeginnings) {
            if (Constants.prependTexts[l.getType()].length() != 0) {
                prependText.append(Constants.prependTexts[l.getType()] + " ");
            }
        }

        return prependText.toString();
    }

    /**
     * Generate Lilypond commands to start a line
     * @return Lilypond data
     */
    public String getLineBeginnings() {
        if (lineBeginnings instanceof Vector) {
            StringBuffer toReturn = new StringBuffer("");

            for (Line l : lineBeginnings) {
                toReturn.append(Constants.lineBeginnings[l.getType()]);
            }

            return toReturn.toString();
        } else {
            return "";
        }
    }

    /**
     * Generate Lilypond commands to terminate a line
     * @return Lilypond data
     */
    public String getLineEndings() {
        if (lineEndings instanceof Vector) {
            StringBuffer toReturn = new StringBuffer("");

            for (Line l : lineEndings) {
                toReturn.append(Constants.lineEndings[l.getType()]);
            }

            return toReturn.toString();
        } else {
            return "";
        }
    }

    /**
     *
     * @param _previousPitch
     */
    public void setPreviousPitch(int _previousPitch) {
        previousPitch = _previousPitch;
    }

    /**
     *
     * @param _previousDuration
     */
    public void setPreviousDuration(int _previousDuration) {
        previousDuration = _previousDuration;
    }

    public int getCurrentPitch() {
        return 0;
    }
}
