package com.dreaMTank.tankgame_2;

import javax.swing.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class GhjTankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        new GhjTankGame02();
    }
    public GhjTankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    }
}
