package com.dreaMTank.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class BallMove extends JFrame{
    MyPanel1 mp = null;
    public static void main(String[] args) {

        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp = new MyPanel1();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel1 extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode() + "被按下。。。");

        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y += 4;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            y -= 4;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x += 4;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x -= 4;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}