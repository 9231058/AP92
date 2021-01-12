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
public class HareRacer extends Racer {
    
    private static final int Sleep = 0;
    private static final int BigHop = 8;
    private static final int BigSlip = -10;
    private static final int SmallHop = 2;
    private static final int SmallSlip = -2;
    
    public HareRacer() {
        super();
    }
    
    @Override
    public void move() {
        int state = whichState();
        if (1 <= state && state <= 2) {
            updatePoint(Sleep);
        }
        if (3 <= state && state <= 4) {
            updatePoint(BigHop);
        }
        if (5 == state) {
            updatePoint(BigSlip);
        }
        if (6 <= state && state <= 8) {
            updatePoint(SmallHop);
        }
        if(9<=state && state <=10){
            updatePoint(SmallSlip);
        }
    }
    
}
