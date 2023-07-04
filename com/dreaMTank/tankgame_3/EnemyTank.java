package com.dreaMTank.tankgame_3;

import java.util.Vector;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class EnemyTank extends Tank {
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

}
