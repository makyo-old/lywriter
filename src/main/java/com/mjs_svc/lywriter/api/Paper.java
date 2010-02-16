package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Paper.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Paper extends MusicObject {

    @Override
    public void setParent(MusicObject m) {
        if ((m instanceof Book) || (m instanceof Score)) {
            parent = m;
        }
    }
}
