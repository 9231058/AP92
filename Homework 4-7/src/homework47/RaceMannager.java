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
public class RaceMannager {

    private final Racer racer1;
    private final Racer racer2;
    private String result = "3 ... 2 ... 1 ... GO\n";

    public RaceMannager() {
        racer1 = new TortoiseRacer();
        racer2 = new HareRacer();
    }

    public String getResult() {
        return result;
    }

    public boolean move() {
        result = "";
        racer1.move();
        racer2.move();
        if (!haveWinner(racer1.getPoint(), racer2.getPoint())) {
            int i = 0;
            while (i < 50) {
                if (i == racer1.getPoint()) {
                    result += "#";
                } else {
                    result += ".";
                }
                i++;
            }
            i = 0;
            result += "\n";
            while (i < 50) {
                if (i == racer2.getPoint()) {
                    result += "*";
                } else {
                    result += ".";
                }
                i++;
            }
            result += "\n";
            return false;
        }
        return true;
    }

    public boolean haveWinner(int point1, int point2) {
        if (point1 >= 50 && point2 >= 50) {
            result = "It’s a tie\n";
            return true;
        } else if (point1 >= 50) {
            result = "Tortoise is win\n";
            return true;
        } else if (point2 >= 50) {
            result = "Hare is win\n";
            return true;
        } else {
            return false;
        }
    }

}
