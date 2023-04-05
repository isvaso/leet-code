package com.isvaso;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <br><br>
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String returnPrefix = strs[0];

        for (int i = 0; i < returnPrefix.length(); i++) {
            char temp = returnPrefix.charAt(i);
            for  (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == 0)
                    return "";
                if (i >= strs[j].length())
                    returnPrefix = returnPrefix.substring(0, strs[j].length());
                else if (strs[j].charAt(i) != temp)
                    returnPrefix = returnPrefix.substring(0, i);
            }
        }

        return returnPrefix;
    }

}
