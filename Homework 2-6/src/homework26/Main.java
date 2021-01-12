/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework26;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.println("Enter first integer :");
        int x = cin.nextInt();
        System.out.println("Enter second integer :");
        int y = cin.nextInt();
        System.out.println("Enter third integer :");
        int z = cin.nextInt();
        int result = x * y * z;
        System.out.println("Result is : " + result);
    }

}
