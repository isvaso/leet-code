package com.isvaso;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character i
 * n it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqCharVer1(String s) {
        Map<Character, Integer> charactersMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (charactersMap.containsKey(s.charAt(i)))
                charactersMap.replace(s.charAt(i), charactersMap.get(s.charAt(i)) + 1);
            else charactersMap.put(s.charAt(i), 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charactersMap.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }

    public int firstUniqCharVer2(String s) {
        int[] charList = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charList[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charList[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
