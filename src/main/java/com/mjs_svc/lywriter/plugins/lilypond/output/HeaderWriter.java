package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: HeaderWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class HeaderWriter extends MusicWriter {

    /**
     *
     * @param m
     */
    public HeaderWriter(MusicObject m) {
        super(m);
    }

    @Override
    public String toString() {
        StringBuffer toReturn = new StringBuffer();
        Header header = (Header) obj;

        toReturn.append(indent() + "\\header {\n");
        if (header.title instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "title = \"" + header.title + "\"\n");
        }
        if (header.subtitle instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "subtitle = \"" + header.subtitle + "\"\n");
        }
        if (header.subsubtitle instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "subsubtitle = \"" + header.subsubtitle + "\"\n");
        }
        if (header.composer instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "composer = \"" + header.composer + "\"\n");
        }
        if (header.arranger instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "arranger = \"" + header.arranger + "\"\n");
        }
        if (header.poet instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "poet = \"" + header.poet + "\"\n");
        }
        if (header.dedication instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "dedication = \"" + header.dedication + "\"\n");
        }
        if (header.piece instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "piece = \"" + header.piece + "\"\n");
        }
        if (header.meter instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "meter = \"" + header.meter + "\"\n");
        }
        if (header.instrument instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "instrument = \"" + header.instrument + "\"\n");
        }
        if (header.copyright instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "copyright = \"" + header.copyright + "\"\n");
        }
        if (header.tagline instanceof String) {
            toReturn.append(indent(getIndentLevel() + 1) + "tagline = \"" + header.tagline + "\"\n");
        }
        if (header.breakbefore instanceof Boolean) {
            toReturn.append(indent(getIndentLevel() + 1) + "breakbefore = " + (header.breakbefore ? "##t\n" : "##f\n"));
        }
        toReturn.append(indent() + "}\n\n");

        return toReturn.toString();
    }
}
