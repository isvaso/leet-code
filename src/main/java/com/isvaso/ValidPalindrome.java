package com.isvaso;

/**
 * A phrase is a palindrome if, after converting all uppercase letters
 * into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include
 * letters and numbers.
 * <br><br>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {

    public boolean isPalindromeSlow(String s) {
        s = s.replaceAll("[^A-Za-zА-Яа-я]", "");
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }

        return true;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetter(s.charAt(i))) i++;
            else if (!Character.isLetter(s.charAt(j))) j--;
            else if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j)))
                return false;
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}
