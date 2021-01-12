/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework47;

/**
 *
 * @author Parham Alvani
 */
public class TortoiseRacer extends Racer {

    private static final int FastPlod = 3;
    private static final int Slip = -5;
    private static final int SlowPlod = 1;

    public TortoiseRacer() {
        super();
    }

    @Override
    public void move() {
        int state = whichState();
        if (6 <= state && state <= 8) {
            updatePoint(Slip);
        }
        if (1 <= state && state <= 5) {
            updatePoint(FastPlod);
        }
        if (9 <= state && state <= 10) {
            updatePoint(SlowPlod);
        }
    }

}
