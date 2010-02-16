package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.plugins.TickWriter;

/**
 *
 * @author Matthew Scott
 * @version $Id: Utils.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Utils {

    /**
     * Update the ticks in a book
     * @param b the book to update
     */
    public static void updateTicks(Book b) {
        new TickWriter(b);
    }
}
