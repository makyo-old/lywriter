package com.mjs_svc.lywriter.plugins;

import com.mjs_svc.lywriter.api.*;

/**
 * Abstract class used for introspection, allowing plugins to separate code into
 * different classes with the main plugin class extending this class.
 *
 * @author Matthew Scott
 * @version $Id: Plugin.java 8 2010-02-13 01:40:54Z mjs@mjs-svc.com $
 */
public abstract class Plugin {
    public static void run(MusicObject b) {};
}
