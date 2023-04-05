package com.isvaso;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] charsS = new int[26];
        int[] charsT = new int[26];

        charsS = setCharsArray(charsS, s);
        charsT = setCharsArray(charsT, t);

        if (Arrays.equals(charsS, charsT))
            return true;

        return false;
    }

    public int[] setCharsArray(int[] array, String text) {
        for (int i = 0; i < text.length(); i++) {
            array[text.charAt(i) - 'a']++;
        }

        return array;
    }
}
