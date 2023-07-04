package com.dreaMTank.tankgame_3;

import javax.swing.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class GhjTankGame03 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        new GhjTankGame03();
    }
    public GhjTankGame03(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    }
}
