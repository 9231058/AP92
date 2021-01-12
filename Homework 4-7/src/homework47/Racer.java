/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework47;

import java.util.Random;

/**
 *
 * @author Parham Alvani
 */
public abstract class Racer {

    private final Random rand;
    private int point;

    public Racer() {
        this.rand = new Random();
    }

    public int getPoint() {
        return point;
    }

    protected void updatePoint(int update) {
        point += update;
    }

    protected int whichState() {
        return rand.nextInt(10) + 1;
    }

    public abstract void move();
}
