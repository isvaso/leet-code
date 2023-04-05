package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RansomNoteTest {

    String testStringA;
    String testStringB;
    boolean expectationResult;

    public RansomNoteTest(String testStringA,
                          String testStringB,
                          boolean expectationResult) {
        this.testStringA = testStringA;
        this.testStringB = testStringB;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection numbers() {
        List<Object> testList = new ArrayList<>();

        testList.add(
                new Object[]{"a", "b", false})
        ;
        testList.add(
                new Object[]{"aa", "ab", false}
        );
        testList.add(
                new Object[]{"aa", "aab", true}
        );
        testList.add(
                new Object[]{"aa", "bbaa", true}
        );

        return testList;
    }

    @Test
    public void canConstruct() {
        boolean result = new RansomNote().canConstruct(testStringA, testStringB);

        assertEquals(expectationResult, result);
    }
}