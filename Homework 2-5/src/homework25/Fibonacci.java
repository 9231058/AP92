/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework25;

import java.math.BigInteger;

/**
 *
 * @author Parham Alvani
 */
public class Fibonacci {

    private final BigInteger fib[];
    private final int number;

    /**
     * this method generate n-th fib for sequence 1,1,2,3,5,..
     *
     * @param number
     */
    public Fibonacci(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        this.number = number;
        fib = new BigInteger[number + 1];
        fib[0] = new BigInteger("1");
        fib[1] = new BigInteger("1");
        DPGen(number);
    }

    public Fibonacci(int number, boolean method) throws IllegalArgumentException {
        this(number);
        if (method != false) {
            RCGen(number);
        } else {
            DPGen(number);
        }
    }

    public BigInteger getFib(int index) throws ArrayIndexOutOfBoundsException {
        return fib[index];
    }

    public int getNumber() {
        return number;
    }

    private void DPGen(int number) {
        for (int i = 2; i <= number; i++) {
            fib[i] = fib[i - 2].add(fib[i - 1]);
        }
    }

    private BigInteger RCGen(int number) {
        if (number == 1 || number == 0) {
            return fib[0];
        } else {
            fib[number] = RCGen(number - 1).add(RCGen(number - 2));
            return fib[number];
        }
    }

}
