package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RotateArrayTest {

    int[] givenArray;
    int givenSteps;
    int[] expectationArray;

    public RotateArrayTest(int[] givenArray, int givenSteps, int[] expectationArray) {
        this.givenArray = givenArray;
        this.givenSteps = givenSteps;
        this.expectationArray = expectationArray;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        new int[]{1, 2, 3, 4, 5, 6}, 3,
                        new int[]{4, 5, 6, 1, 2, 3}
                });
        parametersList.add(
                new Object[]{
                        new int[]{1, 2, 3, 4, 5, 6}, 0,
                        new int[]{1, 2, 3, 4, 5, 6}
                });
        parametersList.add(
                new Object[]{
                        new int[]{0, 0, 0, 1}, 3,
                        new int[]{0, 0 ,1, 0}
                });
        parametersList.add(
                new Object[]{
                        new int[]{0, 0, 0, 1}, 4,
                        new int[]{0, 0 ,0, 1}
                });
        parametersList.add(
                new Object[]{
                        new int[]{0, 0, 0, 1}, 2,
                        new int[]{0, 1, 0, 0}
                });

        return parametersList;
    }

    @Test
    public void rotate() {
        new RotateArray().rotate(givenArray, givenSteps);

        assertArrayEquals(expectationArray, givenArray);
    }
}