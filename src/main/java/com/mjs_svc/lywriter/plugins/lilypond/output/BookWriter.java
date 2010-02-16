package com.mjs_svc.lywriter.plugins.lilypond.output;

import com.mjs_svc.lywriter.api.*;

/**
 * Write a Lilypond book
 * 
 * @author Matthew Scott
 * @version $Id: BookWriter.java 10 2010-02-16 06:32:51Z mjs@mjs-svc.com $
 */
public class BookWriter extends MusicWriter {

    /**
     *
     * @param _obj
     */
    public BookWriter(MusicObject _obj) {
        super(_obj);

        if (((Book) obj).header instanceof Header) {
            ((Book) obj).header.setWriter(new HeaderWriter(((Book) obj).header));
        }

        for (MusicObject m : obj) {
            m.setWriter(new ScoreWriter(m));
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // Cast our MusicObject to book for clarity's sake (less casting)
        Book book = (Book) obj;
        int tempIndent;

        // Start with our version
        StringBuffer toReturn = new StringBuffer("\\version \"2.12.3\"\n\n");

        // Check to see if there's more than one score in this book.
        // If so, we need a \book and \bookpart blocks
        if (book.size() > 1) {
            toReturn.append("\\book {\n");
            tempIndent = 1;
        } else {
            tempIndent = 0;
        }

        // Write the header
        if (book.header instanceof Header) {
            book.header.getWriter().setIndentLevel(tempIndent);
            toReturn.append(book.header.getWriter().toString());
        }

        // Write each score in the book - if there's more than one, wrap them in \bookparts.
        for (MusicObject s : book) {
            if (tempIndent == 1) {
                toReturn.append(indent(tempIndent) + "\\bookpart {\n");
                s.getWriter().setIndentLevel(tempIndent + 1);
                toReturn.append(s.getWriter().toString());
                toReturn.append(indent(tempIndent) + "}\n\n");
            } else {
                s.getWriter().setIndentLevel(tempIndent);
                toReturn.append(s.getWriter().toString());
            }
        }

        // Close \book block if needed
        if (tempIndent == 1) {
            toReturn.append("}\n");
        }

        return toReturn.toString();
    }
}
