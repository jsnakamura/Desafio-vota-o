package com.dbserver;

import javax.swing.*;

public class Voter {
    private JPanel votingPanel;

    public static void votinPanel() {
        JFrame frame = new JFrame("Voter");
        frame.setContentPane(new Voter().votingPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
