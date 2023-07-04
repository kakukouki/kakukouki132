package com.dreaMTank.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

//        g.drawOval(100,100,100,100);
//        g.drawLine(100,100, 400,400);
//        g.drawRect(10,10,200,200);
//        g.setColor(Color.BLUE);
//        g.fillRect(10, 10, 100, 100);
//        g.setColor(Color.red);
//        g.fillOval(10, 10, 100, 100);
//        g.setColor(Color.red);
//        g.setFont(new Font("lishu", Font.BOLD,50));
//        g.drawString("鸡你太美", 100, 200);
        g.setColor(Color.BLUE);
        g.fillRect(20, 20, 15, 60);
        g.fillRect(50, 20, 15,60);
        g.setColor(Color.black);
        g.fillRect(35, 25, 15, 50);
        g.setColor(Color.BLUE);
        g.fillOval(35, 40, 15, 15);
        g.fillRect(42, 20, 2, 30);


    }
}