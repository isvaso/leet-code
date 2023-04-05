package com.isvaso;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * <br><br>
 * The digits are ordered from most significant to least significant
 * in left-to-right order. The large integer does not contain any leading 0's.
 * <br><br>
 * Increment the large integer by one and return the resulting array of digits.
 */

public class PlusOne {

    public int[] getPlusOne(int[] digits) {
        int i;

        for (i = digits.length - 1; i >= 0 && digits[i] == 9; i--) {
            digits[i] = 0;
        }

        if (i == -1) {
            int[] additionArray = new int[digits.length + 1];
            additionArray[0] = 1;
            return additionArray;
        }

        digits[i]++;

        return digits;
    }
}
