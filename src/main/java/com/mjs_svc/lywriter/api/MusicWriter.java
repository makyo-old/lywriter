package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: MusicWriter.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public abstract class MusicWriter {
    protected MusicObject obj;
    protected int indentLevel;

    public MusicWriter(MusicObject m) {
        obj = m;
    }

    @Override
    public abstract String toString();

    public void setMusicObject(MusicObject m) {
        obj = m;
    }
    
    public MusicObject getMusicObject() {
        return obj;
    }

    public void setIndentLevel(int _indentLevel) {
        indentLevel = _indentLevel;
    }

    public int getIndentLevel() {
        return indentLevel;
    }

    public String indent() {
        StringBuffer toReturn = new StringBuffer();
        for (int i = 0; i < indentLevel; i++) {
            toReturn.append("  ");
        }
        return toReturn.toString();
    }

    public String indent(int level) {
        StringBuffer toReturn = new StringBuffer();
        for (int i = 0; i < level; i++) {
            toReturn.append("  ");
        }
        return toReturn.toString();
    }
}
