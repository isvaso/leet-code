package com.isvaso;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * <br><br>
 * If reversing x causes the value to go outside the signed 32-bit integer
 * range [-231, 231 - 1], then return 0.
 * <br><br>
 * Assume the environment does not allow you to store 64-bit integers
 * (signed or unsigned)
 */
public class ReverseInteger {

    public int reverse(int x) {
       long inputNumber = x;
       long returnNumber = 0;

       while (inputNumber != 0) {
           returnNumber = returnNumber * 10 + inputNumber % 10;
           inputNumber = inputNumber / 10;
       }

       if (returnNumber < Integer.MIN_VALUE || returnNumber > Integer.MAX_VALUE)
           return 0;

       return (int) returnNumber;
    }
}
