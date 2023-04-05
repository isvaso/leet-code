package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SingleNumberTest {

    int[] givenArray;
    int expectationNumber;

    public SingleNumberTest(int[] givenArray, int expectationNumber) {
        this.givenArray = givenArray;
        this.expectationNumber = expectationNumber;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        new int[]{1, 4, 5, 1, 4, 2, 2},
                        5}
        );
        parametersList.add(
                new Object[]{new int[]{0, 0, 0, 0, 1},
                        1}
        );
        parametersList.add(
                new Object[]{
                        new int[]{1, 2, 2},
                        1}
        );

        return parametersList;
    }

    @Test
    public void singleNumber() {
        int result = new SingleNumber().singleNumber(givenArray);

        assertEquals(expectationNumber, result);
    }
}