/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework36;

/**
 *
 * @author Parham Alvani
 */
public class Encryption {

    private int number;
    private final int numberOfDigit;
    private final int middleIndex;
    private int Enumber;
    private final boolean EorD;

    public Encryption(int number) {
        this.number = number;
        this.numberOfDigit = numberOfDigit(number);
        this.middleIndex = (numberOfDigit % 2 == 0) ? (numberOfDigit / 2) : (numberOfDigit / 2 + 1);
        this.Enumber = 0;
        this.EorD = true;
    }

    public Encryption(int Enumber, int numberOfDigit) {
        this.Enumber = Enumber;
        this.numberOfDigit = numberOfDigit;
        this.middleIndex = (numberOfDigit % 2 == 0) ? (numberOfDigit / 2) : (numberOfDigit / 2 + 1);
        this.number = 0;
        this.EorD = false;
    }

    public int encrypt() {
        int number = this.number;
        int index = 1;
        while (number != 0) {
            Enumber += (encryptDigit(number % 10)) * Math.pow(10, (middleIndex + index - 1) % numberOfDigit);
            number /= 10;
            index++;
        }
        return Enumber;
    }

    public int decrypt() {
        int Enumber = this.Enumber;
        int index = 1;
        while (index <= numberOfDigit) {
            number += (decryptDigit(Enumber % 10)) * Math.pow(10, (middleIndex + index - 1) % numberOfDigit);
            Enumber /= 10;
            index++;
        }
        return number;
    }

    private static int decryptDigit(int digit) {
        return (digit + 3) % 10;
    }

    private static int encryptDigit(int digit) {
        return (digit + 7) % 10;
    }

    private static int numberOfDigit(int number) {
        int index = 0;
        while (number != 0) {
            number /= 10;
            index++;
        }
        return index;
    }

    @Override
    public String toString() {
        String format = String.format("%%0%dd", numberOfDigit);
        if (EorD) {
            return String.format(format, Enumber);
        } else {
            return String.format(format, number);
        }
    }

}
