package com.dbserver;

import javax.swing.*;

public class VoteFrame {
    private JPanel votingFrame;

    public static void votingForm() {
        JFrame frame = new JFrame("VoteFrame");
        frame.setContentPane(new VoteFrame().votingFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
