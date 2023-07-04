package com.dreaMTank.tankgame_1;

import javax.swing.*;
import java.awt.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }
    public void drawTank(int x, int y, Graphics g, int direct, int type){

        switch(type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct){
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x +30, y, 10, 60, false);
                g.fill3DRect(x+10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x+20, y + 30, x+20, y);
                break;
        }
//        g.setColor(Color.BLUE);
//        g.fillRect(20, 20, 15, 60);
//        g.fillRect(50, 20, 15,60);
//        g.setColor(Color.black);
//        g.fillRect(35, 25, 15, 50);
//        g.setColor(Color.BLUE);
//        g.fillOval(35, 40, 15, 15);
//        g.fillRect(42, 20, 2, 30);
    }
}
