package com.mjs_svc.lywriter.plugins.lilypond.preview;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: LilypondPreviewFrame.java 10 2010-02-16 06:32:51Z mjs@mjs-svc.com $
 */
public class LilypondPreviewFrame extends JFrame {
    private plugin p;
    private JPanel lpPanel;

    public LilypondPreviewFrame(plugin _p) {
        super("Lilypond Preview");
        p = _p;
        lpPanel = new JPanel();

        lpPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    // do refresh
                }
            }
        });

        lpPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!requestFocusInWindow()) {
                    // something bad happened, maybe warn about it.
                }
            }
        });

        lpPanel.setFocusable(true);
    }
}
