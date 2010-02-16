package com.mjs_svc.lywriter.plugins.lilypond.output;

/**
 * Constants - many corresponding to com.mjs_svc.lywriter.resources.constants -
 * which translate integer fields to the corresponding Lilypond output
 * 
 * @author Matthew Scott
 * @version $Id: Constants.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class Constants {

    public static final String[] staves = new String[]{
        "",
        "Drum",
        "Normal"
    };
    public static final String[] majorKeySignatures = new String[]{
        "c",
        "g",
        "d",
        "a",
        "e",
        "b",
        "fis",
        "cis",
        "f",
        "bes",
        "ees",
        "aes",
        "des",
        "ges",
        "ces"
    };
    public static final String[] minorKeySignatures = new String[]{
        "a",
        "e",
        "b",
        "fis",
        "cis",
        "dis",
        "ais",
        "eis",
        "d",
        "g",
        "c",
        "f",
        "bes",
        "ees",
        "aes"
    };
    public static final String[] barLines = {
        "|",
        "",
        "|:",
        "||",
        ":|",
        ".|",
        "|.",
        ":",
        ":||:",
        ".|."
    };
    public static final String[] prependTexts = new String[]{
        "", "", "", "", "",
        "\\override TextSpanner #'(bound-details left text) = \"accel.\"",
        "\\override TextSpanner #'(bound-details left text) = \"deccel.\"",
        "\\override TextSpanner #'(bound-details left text) = \"rit.\"",
        "\\override TextSpanner #'(bound-details left text) = \"rall.\"",
        "",
        "\\override Glissando #'style = #'zigzag",
        "\\arpeggioNormal",
        "\\arpeggioArrowUp",
        "\\arpeggioArrowDown",
        "\\arpeggioBracket",
        "\\arpeggioParenthesis",
        ""
    };
    public static final String[] lineBeginnings = new String[]{
        "\\<",
        "\\>",
        "(",
        "\\(",
        "\\sustainDown",
        "\\startTextSpan",
        "\\startTextSpan",
        "\\startTextSpan",
        "\\startTextSpan",
        "\\glissando",
        "\\glissando",
        "\\arpeggio",
        "\\arpeggio",
        "\\arpeggio",
        "\\arpeggio",
        "\\arpeggio",
        "\\startTrillSpan"
    };
    public static final String[] lineEndings = new String[]{
        "\\!",
        "\\!",
        ")",
        "\\)",
        "\\sustainUp",
        "\\stopTextSpan",
        "\\stopTextSpan",
        "\\stopTextSpan",
        "\\stopTextSpan",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\\stopTrillSpan"
    };
    public static final String[] accidentals = new String[]{
        "",
        "is",
        "es",
        "isis",
        "eses",
        "ih",
        "eh",
        "isih",
        "eseh"
    };
    public static final String[] dynamics = new String[]{
        "\\ppppp",
        "\\pppp",
        "\\ppp",
        "\\pp",
        "\\p",
        "\\mp",
        "\\mf",
        "\\f",
        "\\ff",
        "\\fff",
        "\\ffff"
    };
    public static final String[] articulations = new String[]{
        ">",
        "^",
        "|",
        "\\espressivo",
        ".",
        "-",
        "_",
        "\\upbow",
        "\\downbow",
        "\\flageolet",
        "\\thumb",
        "\\lheel",
        "\\rheel",
        "\\ltoe",
        "\\rtoe",
        "\\open",
        "+",
        "\\turn",
        "\\reverseturn",
        "\\trill",
        "\\prall",
        "\\mordent",
        "\\prallprall",
        "\\prallmordent",
        "\\upprall",
        "\\downprall",
        "\\upmordent",
        "\\downmordent",
        "\\prallup",
        "\\pralldown",
        "\\lineprall",
        "\\signumcongruentiae",
        "\\shortfermata",
        "\\fermata",
        "\\longfermata",
        "\\verylongfermata",
        "\\segno",
        "\\coda",
        "\\varcoda"
    };
    public static final String[] placements = new String[]{
        "",
        "-",
        "^",
        "_"
    };
    public static final String[] graceNoteTypes = new String[]{
        "\\grace",
        "\\appogiatura",
        "\\acciaccatura"
    };
}
