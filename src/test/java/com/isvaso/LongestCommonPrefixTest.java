package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LongestCommonPrefixTest {

    String[] givenStrings;
    String expectationPrefix;

    public LongestCommonPrefixTest(String[] givenStrings,
                                   String expectationPrefix) {
        this.givenStrings = givenStrings;
        this.expectationPrefix = expectationPrefix;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        new String[]{"got", "go", "goat"},
                        "go"
                });
        parametersList.add(
                new Object[]{
                        new String[]{"", "", ""},
                        ""
                });
        parametersList.add(
                new Object[]{
                        new String[]{"solid", "solidarity",
                                "solar", "soviet", "strange"},
                        "s"
                });

        return parametersList;
    }

    @Test
    public void longestCommonPrefix() {
        String result = new LongestCommonPrefix()
                .longestCommonPrefix(givenStrings);

        assertEquals(expectationPrefix, result);
    }
}