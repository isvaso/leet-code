package com.isvaso;

/**
 * Implement the myAtoi(string s) function, which converts
 * a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <br><br>
 * The algorithm for myAtoi(string s) is as follows:
 * <ul>
 *     <li>Read in and ignore any leading whitespace.</li>
 *     <li>Check if the next character (if not already at the end of the string)
 *     is '-' or '+'. Read this character in if it is either.</li>
 *     <li>This determines if the final result is negative or positive respectively.</li>
 *     <li>Assume the result is positive if neither is present.</li>
 *     <li>Read in next the characters until the next non-digit character or the end
 *     of the input is reached. The rest of the string is ignored.</li>
 *     <li>Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). </li>
 *     <li>If no digits were read, then the integer is 0 change the sign as necessary (from step 2).</li>
 *     <li>If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 *     then clamp the integer so that it remains in the range.</li>
 *     <li>Specifically, integers less than -231 should be clamped to -231,
 *     and integers greater than 231 - 1 should be clamped to 231 - 1.</li>
 *     <li>Return the integer as the final result.</li>
 *     <li></li>
 * </ul>
 * Note:
 * <ul>
 *     <li>Only the space character ' ' is considered a whitespace character.</li>
 *     <li>Do not ignore any characters other than the leading whitespace
 *     or the rest of the string after the digits.</li>
 * </ul>
 */
public class StringToInteger {

    public int myAtoi(String s) {
        long returnNumber = 0;
        int sign = 1;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        if (s.length() <= 0 || i == s.length()) return 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+')
            i++;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i)) && returnNumber < Integer.MAX_VALUE)
                returnNumber = returnNumber * 10
                        + Integer.parseInt(String.valueOf(s.charAt(i)));
            else break;
            i++;
        }

        returnNumber = returnNumber * sign;

        if (returnNumber > Integer.MAX_VALUE) returnNumber = Integer.MAX_VALUE;
        else if (returnNumber < Integer.MIN_VALUE) returnNumber = Integer.MIN_VALUE;

        return (int) returnNumber;
    }
}
