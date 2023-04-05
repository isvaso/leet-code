package com.isvaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters
 * from magazine and false otherwise.
 * <br><br>
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        List<String> ransomNoteList =
                new ArrayList<>(Arrays.asList(ransomNote.split("")));
        List<String> magazineList =
                new ArrayList<>(Arrays.asList(magazine.split("")));

        boolean result = true;

        for (String s : ransomNoteList) {
            if (magazineList.indexOf(s) == -1) {
                result = false;
            } else {
                magazineList.remove(s);
            }
        }

        return result;
    }
}
