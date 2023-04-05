package com.isvaso;

/**
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * <br><br>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int i;
        int j;

        i = 0;
        j = s.length - 1;

        while (i < j) {
            char temp;
            temp = s[i];
            s[i] = s [j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
