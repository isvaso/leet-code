package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FirstUniqueCharacterInAStringTest {

    String givenString;
    int expectationIndex;

    public FirstUniqueCharacterInAStringTest(String givenString,
                                             int expectationIndex) {
        this.givenString = givenString;
        this.expectationIndex = expectationIndex;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        "loveleetcodeandgotohotoneelevenshot",
                        8
                });
        parametersList.add(
                new Object[]{
                        "johneathisbutterbroadanddoinghisjobwhenrunoverbroad",
                        28
                });
        parametersList.add(
                new Object[]{
                        "whenwhengogodowndownateat",
                -1
                });
        parametersList.add(
                new Object[]{
                        "w",
                        0
                });

        return parametersList;
    }

    @Test
    public void firstUniqCharVer1() {
        int result = new FirstUniqueCharacterInAString()
                .firstUniqCharVer1(givenString);

        assertEquals(expectationIndex, result);
    }

    @Test
    public void firstUniqCharVer2() {
        int result = new FirstUniqueCharacterInAString()
                .firstUniqCharVer2(givenString);

        assertEquals(expectationIndex, result);
    }
}