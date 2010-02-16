package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: KeySignature.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class KeySignature extends VoiceObject {
    private int key;
    private boolean isMajor;

    /**
     *
     * @param _key
     * @param _isMajor
     */
    public KeySignature(int _key, boolean _isMajor) {
        key = _key;
        isMajor = _isMajor;
    }

    /**
     *
     * @return
     */
    public int getKeySignature() {
        return key;
    }

    /**
     *
     * @param _key
     */
    public void setKeySignature(int _key) {
        key = _key;
    }

    /**
     *
     * @return
     */
    public boolean getIsMajor() {
        return isMajor;
    }

    /**
     *
     * @param _isMajor
     */
    public void setIsMajor(boolean _isMajor) {
        isMajor = _isMajor;
    }
}
