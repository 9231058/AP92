/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework23;

import java.util.Scanner;

/**
 *
 * @author Parham Alvani
 */
public class Main {

    public static Scanner cin = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Date myDate = new Date(cin.nextInt(), cin.nextInt(), cin.nextInt());
            System.out.println(myDate);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
