package com.mjs_svc.lywriter.api;

import com.mjs_svc.lywriter.exception.BarCapacityException;
import com.mjs_svc.lywriter.resources.*;
import com.mjs_svc.lywriter.plugins.lilypond.output.plugin;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Scott
 * @version $Id$
 */
public class SongTests {

    @Test
    public void maryTest() throws BarCapacityException {
        Book mary = maryHadALittleLamb();
        printMusic(mary, 0);
        System.out.print("\n");
    }

    @Test
    public void maryLilypondTest() throws BarCapacityException {
        Book mary = maryHadALittleLamb();
        plugin lywriter = new plugin(mary);
        System.out.println(mary.getWriter().toString());
    }

    private void printMusic(MusicObject music, int indentLevel) {
        // Indent
        System.out.print("\n");
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("  ");
        }
        System.out.print(music.getClass().getCanonicalName().split("\\.")[4]);

        // Type specific output
        if (music instanceof ScoreObject) {
            System.out.print(" (" + ((ScoreObject) music).getVarName() + ")");
        }
        if (music instanceof Note) {
            System.out.print(" (pitch: " + String.valueOf(((Note) music).getPitch()) + ", duration: " + String.valueOf(music.getDuration()) + ")");
        }
        if (music instanceof TimeSignature) {
            System.out.print(" (" + String.valueOf(((TimeSignature) music).getNumerator()) + "/" + String.valueOf(((TimeSignature) music).getDisplayDenominator()) + ")");
        }
        if (music instanceof LyricsObject) {
            System.out.print(" (\"" + ((LyricsObject) music).getText() + "\")");
        }

        // Recurse
        for (MusicObject m : music) {
            if (m instanceof MusicObject) {
                printMusic(m, indentLevel + 1);
            } else {
                System.out.print("\n!! Found something I'm not sure about...");
            }
        }
    }

    public Book maryHadALittleLamb() throws BarCapacityException {
        Book mary = new Book();
        Score score = new Score();
        Staff staff = new Staff(new Instrument().getInstrumentList().get(0));
        Voice music = new Voice();
        music.setVarName("mary");
        Lyrics lyrics = new Lyrics(music.getVarName());
        Bar b;
        Note n;

        mary.header.title = "Mary Had a Little Lamb";
        music.add(new TimeSignature(4, APIConstants.Notes.Durations.QUARTER_NOTE));

        // Mary had a
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("Ma --", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("ry", n);
        b.add(n);

        n = new Note(60, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("had", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("a", n);
        b.add(n);
        music.add(b);

        // little lamb
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lit --", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("tle", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.HALF_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lamb,", n);
        b.add(n);
        music.add(b);

        // little lamb
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lit --", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("tle", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.HALF_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lamb,", n);
        b.add(n);
        music.add(b);

        // little lamb
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lit --", n);
        b.add(n);

        n = new Note(67, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("tle", n);
        b.add(n);

        n = new Note(67, APIConstants.Notes.Durations.HALF_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lamb!", n);
        b.add(n);
        music.add(b);

        // Mary had a
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("Ma --", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("ry", n);
        b.add(n);

        n = new Note(60, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("had", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("a", n);
        b.add(n);
        music.add(b);

        // little lamb whose
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lit --", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("tle", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("lamb", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("whose", n);
        b.add(n);
        music.add(b);

        // fleece was white as
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("fleece", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("was", n);
        b.add(n);

        n = new Note(64, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("white", n);
        b.add(n);

        n = new Note(62, APIConstants.Notes.Durations.QUARTER_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("as", n);
        b.add(n);
        music.add(b);

        // snow
        b = new Bar(music.getCurrentTimeSignature());
        n = new Note(60, APIConstants.Notes.Durations.WHOLE_NOTE, APIConstants.Notes.Dynamics.MF);
        lyrics.add("snow!", n);
        b.add(n);
        music.add(b);
        music.add(new BarLine(APIConstants.BarLines.FINAL));
        music.getLyrics().add(lyrics);

        staff.set(0, music);

        score.add(staff);

        mary.add(score);

        return mary;
    }
}
