package com.dreaMTank.tankgame_1;

import javax.swing.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class GhjTankGame01 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        new GhjTankGame01();
    }
    public GhjTankGame01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    }
}
