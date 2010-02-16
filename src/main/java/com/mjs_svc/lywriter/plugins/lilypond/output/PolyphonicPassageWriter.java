package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;
import java.util.*;

/**
 * @author Matthew Scott
 * @version $Id: PolyphonicPassageWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class PolyphonicPassageWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public PolyphonicPassageWriter(MusicObject _obj) {
        super(_obj);

        for (MusicObject m : obj) {
            for (MusicObject b : m) {
                if (b instanceof Bar) {
                    b.setWriter(new BarWriter(b));
                }
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer();

        toReturn.append(indent() + "<<\n");
        for (Iterator<MusicObject> m = obj.iterator(); m.hasNext();) {
            toReturn.append(indent(getIndentLevel() + 1) + "{");
            for (MusicObject b : m.next()) {
                b.getWriter().setIndentLevel(getIndentLevel() + 2);
                toReturn.append(indent(getIndentLevel() + 2) + b.getWriter().toString() + "\n");
            }
            toReturn.append(indent(getIndentLevel() + 1) + "}");
            if (!m.hasNext()) {
                toReturn.append(" // ");
            } else {
                toReturn.append("\n");
            }
        }

        toReturn.append(indent() + ">>\n" + indent());
        return toReturn.toString();
    }
}
