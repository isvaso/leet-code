package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ImplementStrTest {

    String givenHaystack;
    String givenNeedle;
    int expectationIndex;

    public ImplementStrTest(String givenHaystack,
                            String givenNeedle,
                            int expectationIndex) {
        this.givenHaystack = givenHaystack;
        this.givenNeedle = givenNeedle;
        this.expectationIndex = expectationIndex;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        "ababaab", "baab", 3
                });
        parametersList.add(
                new Object[]{
                        "ababaab", "yoyo", -1
                });
        parametersList.add(
                new Object[]{
                        "", "", -1
                });
        parametersList.add(
                new Object[]{
                        " ", "", -1
                });
        parametersList.add(
                new Object[]{
                        "  ", " ", 0
                });

        return parametersList;
    }

    @Test
    public void strStr() {
        int result = new ImplementStr().strStr(givenHaystack, givenNeedle);

        assertEquals(expectationIndex, result);
    }
}