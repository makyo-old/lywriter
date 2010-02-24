package com.mjs_svc.lywriter.app;

import com.mjs_svc.lywriter.api.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author scott
 */
public class StaffPanel extends JPanel {
    private Staff s;
    Graphics g;

    public StaffPanel(Staff _s) {
        s = _s;
    }

    @Override
    public void paintComponent(Graphics _g) {
        g = _g;

    }

    public void drawArticulation(Articulation a) {

    }

    public void drawBar(Bar b) {

    }

    public void drawBarRest(BarRest b) {

    }

    public void drawChord(Chord c) {
        
    }

    public void drawClef(Clef c) {

    }

    public void drawTimeSignature(TimeSignature t) {

    }

    public void drawNote(Note n) {

    }

}
