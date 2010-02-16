package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Selection.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Selection {

    MusicObject upperLeft, lowerRight;

    /**
     *
     * @param _upperLeft
     * @param _lowerRight
     */
    public Selection(MusicObject _upperLeft, MusicObject _lowerRight) {
        upperLeft = _upperLeft;
        lowerRight = _lowerRight;
    }

    /**
     *
     * @param _upperLeft
     */
    public void setUpperLeft(MusicObject _upperLeft) {
        upperLeft = _upperLeft;
    }

    /**
     *
     * @return
     */
    public MusicObject getUpperLeft() {
        return upperLeft;
    }

    /**
     *
     * @param _lowerRight
     */
    public void setLowerRight(MusicObject _lowerRight) {
        lowerRight = _lowerRight;
    }

    /**
     *
     * @return
     */
    public MusicObject getLowerRight() {
        return lowerRight;
    }

    /**
     *
     * @param obj
     * @return
     */
    public boolean contains(BarObject obj) {
        MusicObject ul = upperLeft, lr = lowerRight, score = upperLeft, temp = obj;

        // first check if the object is in a staff between the upper and lower bounds
        while (!(ul instanceof Staff)) {
            ul = ul.getParent();
        }

        while (!(lr instanceof Staff)) {
            lr = lr.getParent();
        }

        while (!(temp instanceof Staff)) {
            temp = temp.getParent();
        }

        while (!(score instanceof Score)) {
            score = score.getParent();
        }

        if (((Score) score).indexOf((ScoreObject) temp) < ((Score) score).indexOf((ScoreObject) ul) || ((Score) score).indexOf((ScoreObject) temp) > ((Score) score).indexOf((ScoreObject) lr)) {
            return false;
        }

        // next, check if the object is between the right and left bounds
        ul = upperLeft;
        lr = lowerRight;
        temp = obj;
        score = upperLeft;

        // loop in case ul is in a tuplet
        while (!(ul instanceof Bar)) {
            ul = ul.getParent();
        }

        while (!(lr instanceof Bar)) {
            lr = lr.getParent();
        }

        while (!(temp instanceof Bar)) {
            temp = temp.getParent();
        }

        while (!(score instanceof Voice)) {
            score = score.getParent();
        }

        if (((Voice) score).indexOf((VoiceObject) temp) > ((Voice) score).indexOf((VoiceObject) ul)) {
            score = lowerRight;
            while (!(score instanceof Voice)) {
                score = score.getParent();
            }

            if (((Voice) score).indexOf((VoiceObject) temp) < ((Voice) score).indexOf((VoiceObject) lr)) {
                return true;
            } else if (((Voice) score).indexOf((VoiceObject) temp) == ((Voice) score).indexOf((VoiceObject) lr)) {
                // we need to use ticks if the objects are in bars of the same number, which means we need to update ticks
                while (!(score instanceof Book)) {
                    score = score.getParent();
                }
                Utils.updateTicks((Book) score);
                if (upperLeft.getTick() <= temp.getTick() && lowerRight.getTick() >= temp.getTick()) {
                    return true;
                }
            }
        } else if (((Voice) score).indexOf((VoiceObject) temp) == ((Voice) score).indexOf((VoiceObject) ul)) {
            // we need to use ticks if the objects are in bars of the same number, which means we need to update ticks
            while (!(score instanceof Book)) {
                score = score.getParent();
            }
            Utils.updateTicks((Book) score);
            if (upperLeft.getTick() <= temp.getTick() && lowerRight.getTick() >= temp.getTick()) {
                return true;
            }
        }


        return false;
    }
}
