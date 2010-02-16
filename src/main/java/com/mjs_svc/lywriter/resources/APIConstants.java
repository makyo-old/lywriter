package com.mjs_svc.lywriter.resources;

import com.mjs_svc.lywriter.api.KeySignature;
import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: APIConstants.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class APIConstants {
    public class Notes {
        public class Accidentals {
            public static final int NATURAL = 0;
            public static final int SHARP = 1;
            public static final int FLAT = 2;
            public static final int DOUBLE_SHARP = 3;
            public static final int DOUBLE_FLAT = 4;
            public static final int QUARTER_TONE_SHARP = 5;
            public static final int QUARTER_TONE_FLAT = 6;
            public static final int THREE_QUARTER_TONE_SHARP = 7;
            public static final int THREE_QUARTER_TONE_FLAT = 8;
        }

        public class Articulations {
            public static final int ACCENT = 0;
            public static final int MARCATO = 1;
            public static final int STACCATISSIMO = 2;
            public static final int ESPRESSIVO = 3;
            public static final int STACCATO = 4;
            public static final int TENUTO = 5;
            public static final int PORTATO = 6;
            public static final int UPBOW = 7;
            public static final int DOWNBOW = 8;
            public static final int FLAGEOLET = 9;
            public static final int THUMB = 10;
            public static final int LHEEL = 11;
            public static final int RHEEL = 12;
            public static final int LTOE = 13;
            public static final int RTOE = 14;
            public static final int OPEN = 15;
            public static final int STOPPED = 16;
            public static final int TURN = 17;
            public static final int REVERSETURN = 18;
            public static final int TRILL = 19;
            public static final int PRALL = 20;
            public static final int MORDENT = 21;
            public static final int PRALLPRALL = 22;
            public static final int PRALLMORDENT = 23;
            public static final int UPPRALL = 24;
            public static final int DOWNPRALL = 25;
            public static final int UPMORDENT = 26;
            public static final int DOWNMORDENT = 27;
            public static final int PRALLUP = 28;
            public static final int PRALLDOWN = 29;
            public static final int LINEPRALL = 30;
            public static final int SIGNUMCONGRUENTIAE = 31;
            public static final int SHORTFERMATA = 32;
            public static final int FERMATA = 33;
            public static final int LONGFERMATA = 34;
            public static final int VERYLONGFERMATA = 35;
            public static final int SEGNO = 36;
            public static final int CODA = 37;
            public static final int VARCODA = 38;
        }

        public class Durations {
            public static final int LONGA = 512;
            public static final int BREVE = 256;
            public static final int WHOLE_NOTE = 128;
            public static final int SEMIBREVE = WHOLE_NOTE;
            public static final int HALF_NOTE = 64;
            public static final int MINIM = HALF_NOTE;
            public static final int QUARTER_NOTE = 32;
            public static final int CROTCHET = QUARTER_NOTE;
            public static final int EIGHTH_NOTE = 16;
            public static final int QUAVER = EIGHTH_NOTE;
            public static final int SIXTEENTH_NOTE = 8;
            public static final int SEMIQUAVER = SIXTEENTH_NOTE;
            public static final int THIRTYSECOND_NOTE = 4;
            public static final int DEMISEMIQUAVER = THIRTYSECOND_NOTE;
            public static final int SIXTYFOURTH_NOTE = 2;
            public static final int HEMIDEMISEMIQUAVER = SIXTYFOURTH_NOTE;
            public static final int HUNDREDTWENTYEIGHTH_NOTE = 1;
            public static final int QUASIHEMIDEMISEMIQUAVER = HUNDREDTWENTYEIGHTH_NOTE;

            public static final int DOTTED_WHOLE_NOTE = WHOLE_NOTE + HALF_NOTE;
            public static final int DOTTED_HALF_NOTE = HALF_NOTE + QUARTER_NOTE;
            public static final int DOTTED_QUARTER_NOTE = QUARTER_NOTE + EIGHTH_NOTE;
            public static final int DOTTED_EIGHTH_NOTE = EIGHTH_NOTE + SIXTEENTH_NOTE;
            public static final int DOTTED_SIXTEENTH_NOTE = SIXTEENTH_NOTE + THIRTYSECOND_NOTE;
            public static final int DOTTED_THIRTYSECOND_NOTE = THIRTYSECOND_NOTE + SIXTYFOURTH_NOTE;
            public static final int DOTTED_SIXTYFOURTH_NOTE = SIXTYFOURTH_NOTE + HUNDREDTWENTYEIGHTH_NOTE;
            // public static final int DOTTED_HUNDREDTWENTYEIGHTH_NOTE = HUNDREDTWENTYEIGHTH_NOTE + TWOHUNDREDFIFTYSIXTH_NOTE;

            public static final int DOUBLE_DOTTED_WHOLE_NOTE = WHOLE_NOTE + HALF_NOTE + QUARTER_NOTE;
            public static final int DOUBLE_DOTTED_HALF_NOTE = HALF_NOTE + QUARTER_NOTE + EIGHTH_NOTE;
            public static final int DOUBLE_DOTTED_QUARTER_NOTE = QUARTER_NOTE + EIGHTH_NOTE + SIXTEENTH_NOTE;
            public static final int DOUBLE_DOTTED_EIGHTH_NOTE = EIGHTH_NOTE + SIXTEENTH_NOTE + THIRTYSECOND_NOTE;
            public static final int DOUBLE_DOTTED_SIXTEENTH_NOTE = SIXTEENTH_NOTE + THIRTYSECOND_NOTE + SIXTYFOURTH_NOTE;
            public static final int DOUBLE_DOTTED_THIRTYSECOND_NOTE = THIRTYSECOND_NOTE + SIXTYFOURTH_NOTE + HUNDREDTWENTYEIGHTH_NOTE;
            //public static final int DOUBLE_DOTTED_SIXTYFOURTH_NOTE = SIXTYFOURTH_NOTE + HUNDREDTWENTYEIGHTH_NOTE + TWOHUNDREDFIFTYSIXTH_NOTE;

        }

        public class NoteHeads {
            public static final int DEFAULT = 0;
            public static final int BAROQUE = 1;
            public static final int NEOMENSURAL = 2;
            public static final int MENSURAL = 3;
            public static final int PETRUCCI = 4;
            public static final int HARMONIC = 5;
            public static final int DIAMOND = 6;
            public static final int CROSS = 7;
            public static final int XCIRCLE = 8;
            public static final int TRIANGLE = 9;
            public static final int SLASH = 10;
        }

        public class Dynamics {
            public static final int PPPPP = 0;
            public static final int PPPP = 1;
            public static final int PPP = 2;
            public static final int PP = 3;
            public static final int P = 4;
            public static final int MP = 5;
            public static final int MF = 6;
            public static final int F = 7;
            public static final int FF = 8;
            public static final int FFF = 9;
            public static final int FFFF = 10;

            public static final int FP = -1;
            public static final int SF = -2;
            public static final int SFF = -3;
            public static final int SP = -4;
            public static final int SPP = -5;
            public static final int SFZ = -6;
            public static final int RFZ = -7;
        }

        public class GraceNotes {
            public static final int GRACE_NOTE = 0;
            public static final int APPOGIATURA = 1;
            public static final int ACCIACCATURA = 2;
        }
    }

    public class Lines {
        public static final int CRESCENDO = 0;
        public static final int DECRESCENDO = 1;
        public static final int SLUR = 2;
        public static final int PHRASING_SLUR = 3;
        public static final int SUSTAIN = 4;
        public static final int ACCELERANDO = 5;
        public static final int DECCELERANDO = 6;
        public static final int RITARDANDO = 7;
        public static final int RALLENTANDO = 8;
        public static final int GLISSANDO = 9;
        public static final int ZIGZAG_GLISSANDO = 10;
        public static final int ARPEGGIO = 11;
        public static final int ARPEGGIO_UP = 12;
        public static final int ARPEGGIO_DOWN = 13;
        public static final int ARPEGGIO_BRACKET = 14;
        public static final int ARPEGGIO_PARENS = 15;
        public static final int TRILL = 16;
    }

    public class Placement {
        public static final int NOTPRESENT = 0;
        public static final int DEFAULT = 1;
        public static final int ABOVE = 2;
        public static final int BELOW = 3;
    }

    public class BarLines {
        public static final int NORMAL = 0;
        public static final int INVISIBLE = 1;
        public static final int BEGIN_REPEAT = 2;
        public static final int DOUBLE = 3;
        public static final int END_REPEAT = 4;
        public static final int INITIAL = 5;
        public static final int FINAL = 6;
        public static final int DASHED = 7;
        public static final int END_BEGIN_REPEAT = 8;
        public static final int FINAL_INITIAL = 9;
    }

    public class Clefs {
        public static final int TREBLE = 0;
        public static final int BASS = 1;
    }

    public class Staves {
        public static final int NORMAL = 0;
        public static final int DRUM = 1;
        public static final int RHYTHM = 2;
    }

    public class KeySignatures {
        public static final int SEVENFLATS = 14;
        public static final int SIXFLATS = 13;
        public static final int FIVEFLATS = 12;
        public static final int FOURFLATS = 11;
        public static final int THREEFLATS = 10;
        public static final int TWOFLATS = 9;
        public static final int ONEFLAT = 8;
        public static final int NOSHARPSNOFLATS = 0;
        public static final int ONESHARP = 1;
        public static final int TWOSHARPS = 2;
        public static final int THREESHARPS = 3;
        public static final int FOURSHARPS = 4;
        public static final int FIVESHARPS = 5;
        public static final int SIXSHARPS = 6;
        public static final int SEVENSHARPS = 7;

        public final KeySignature C_MAJOR = new KeySignature(NOSHARPSNOFLATS, true);
        public final KeySignature A_MINOR = new KeySignature(NOSHARPSNOFLATS, false);
        //TODO: finish these
    }

    public class FiguredBassModifications {
        public static final int SHARP = 1;
        public static final int FLAT = 2;
        public static final int NATURAL = 4;
        public static final int SLASH = 8;
        public static final int PLUS = 16;
        public static final int OPEN_BRACKET = 32;
        public static final int CLOSE_BRACKET = 64;
    }

    public static Vector<Locale> SupportedLocales() {
        Vector<Locale> locales = new Vector<Locale>(1);

        // Add locales here only when localization is complete
        locales.add(Locale.US);

        return locales;
    }
}
