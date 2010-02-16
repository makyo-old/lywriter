package com.mjs_svc.lywriter.api;

/**
 *
 * @author Matthew Scott
 * @version $Id: Comment.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Comment extends MusicObject {
    private String comment;
    private boolean isMultiline;

    public Comment(String _comment, boolean _isMultiline) {
        comment = _comment;
        isMultiline = _isMultiline;
    }

    public void setComment(String _comment) {
        comment = _comment;
    }

    public String getComment() {
        return comment;
    }

    public void setIsMultiline(boolean _isMultipline) {
        isMultiline = _isMultipline;
    }

    public boolean getIsMultiline() {
        return isMultiline;
    }
}
