package com.rediguleksi;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {
//        GamePanel panel = new GamePanel();
//        this.add(panel);
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // center of screen
    }
}
