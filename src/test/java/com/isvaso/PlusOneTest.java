package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PlusOneTest {

    int[] givenArray;
    int[] expectationArray;

    public PlusOneTest(int[] givenArray, int[] expectationArray) {
        this.givenArray = givenArray;
        this.expectationArray = expectationArray;
    }

    @Parameterized.Parameters
    public static Collection setTestArrays() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        new int[]{4, 9, 6, 5, 9, 9},
                        new int[]{4, 9, 6, 6, 0, 0}
                });
        parametersList.add(
                new Object[]{
                        new int[]{1, 1, 1, 1, 1, 1},
                        new int[]{1, 1, 1, 1, 1, 2}
                });
        parametersList.add(
                new Object[]{
                        new int[]{2 ,9},
                        new int[]{3, 0}
                });
        parametersList.add(
                new Object[]{
                        new int[]{9},
                        new int[]{1, 0}
                });

        return parametersList;
    }

    @Test
    public void getPlusOne() {
        int[] result = new PlusOne().getPlusOne(givenArray);

        assertArrayEquals(expectationArray, result);
    }
}