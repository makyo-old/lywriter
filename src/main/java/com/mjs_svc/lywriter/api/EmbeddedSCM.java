package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: EmbeddedSCM.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class EmbeddedSCM extends MusicObject {
    private String SCM;

    public EmbeddedSCM(String _SCM) {
        SCM = _SCM;
    }

    public void setSCM(String _SCM) {
        SCM = _SCM;
    }

    public String getSCM() {
        return SCM;
    }
}
