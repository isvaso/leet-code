package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidPalindromeTest {

    String givenString;
    boolean expectationResult;

    public ValidPalindromeTest(String givenString, boolean expectationResult) {
        this.givenString = givenString;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection parametersTest() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{"0pe13te0p", true}
        );
        parametersList.add(
                new Object[]{"A man, a plan, a canal: Panama", true}
        );
        parametersList.add(
                new Object[]{" ", true}
        );
        
        return parametersList;
    }

    @Test
    public void isPalindromeSlow() {
        boolean result = new ValidPalindrome().isPalindromeSlow(givenString);

        assertEquals(expectationResult, result);
    }

    @Test
    public void isPalindrome() {
        boolean result = new ValidPalindrome().isPalindrome(givenString);

        assertEquals(expectationResult, result);
    }
}