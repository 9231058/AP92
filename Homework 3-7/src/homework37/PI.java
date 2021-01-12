/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework37;

/**
 *
 * @author Parham Alvani
 */
public class PI {

    private double PI;
    private final int number;

    public PI() {
        this.PI = 0d;
        this.number = 20 * 1000;
    }

    public PI(int number) {
        this.PI = 0d;
        this.number = number;
    }
    public void generatePi(){
        for(int i=0;i<number;i++){
            PI+=Math.pow(-1, i)*(4)/(2*i+1);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(PI);
    }
    
}
