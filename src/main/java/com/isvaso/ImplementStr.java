package com.isvaso;

/**
 * Implement strStr().
 * <br><br>
 * Given two strings needle and haystack, return the index
 * of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <br><br>
 * Clarification:
 * <ul>
 *     <li>What should we return when needle is an empty string?
 *     This is a great question to ask during an interview.</li>
 *     <li>For the purpose of this problem, we will return 0
 *     when needle is an empty string. This is consistent to C's strstr()
 *     and Java's indexOf().</li>
 * </ul>
 */
public class ImplementStr {

    public int strStr(String haystack, String needle) {
        int needleIndex = 0;

        if (haystack.length() == 0 || needle.length() == 0
                || haystack.length() < needle.length())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(needleIndex)) {

                if (needleIndex >= needle.length() - 1)
                    return i;

                for (int j = i + 1; j < haystack.length(); j++) {
                    if (haystack.charAt(j) != needle.charAt(needleIndex + 1)) {
                        needleIndex = 0;
                        break;
                    } else needleIndex++;

                    if (needleIndex >= needle.length() - 1)
                        return i;
                }
            }
        }

        return -1;
    }
}
