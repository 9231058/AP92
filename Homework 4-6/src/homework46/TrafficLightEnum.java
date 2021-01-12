/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework46;

/**
 *
 * @author Parham Alvani
 */
public enum TrafficLightEnum {

    RED(1),
    YELLOW(1),
    GREEN(1);

    private final int duration;

    private TrafficLightEnum(int duration) {
        this.duration = duration;
    }

    public int duration() {
        return this.duration;
    }

}
