package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RemoveDuplicatesFromSortedArrayTest {

    int[] givenArray;
    int expectationNumber;

    public RemoveDuplicatesFromSortedArrayTest(int[] givenArray,
                                               int expectationNumber) {
        this.givenArray = givenArray;
        this.expectationNumber = expectationNumber;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{
                        new int[]{1, 1, 2, 2, 3, 4, 4, 5},
                        5}
        );
        parametersList.add(
                new Object[]{
                        new int[]{0, 1, 2, 3},
                        4}
        );
        parametersList.add(
                new Object[]{
                        new int[]{0, 0, 0, 0},
                        1}
        );
        parametersList.add(
                new Object[]{
                        new int[]{},
                        0}
        );

        return parametersList;
    }

    @Test
    public void removeDuplicates() {
        int result = new RemoveDuplicatesFromSortedArray()
                .removeDuplicates(givenArray);

        assertEquals(expectationNumber, result);
    }
}