package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TwoSumTest {

    int[] nums;
    int target;
    int[] expectationResult;

    public TwoSumTest(int[] nums, int target, int[] expectationResult) {
        this.nums = nums;
        this.target = target;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection numbers() {
        List<Object[]> testList = new ArrayList<>();

        testList.add(
                new Object[]{
                        new int[]{1, 2, 3},
                        3,
                        new int[]{0, 1}
                });
        testList.add(
                new Object[]{
                        new int[]{0, 1, 0, 7, 4, 0, 41, 21, 16},
                        25,
                        new int[]{4, 7}
                });
        testList.add(
                new Object[]{
                        new int[]{0, 0, 0},
                        1,
                        new int[]{-1, -1}
                });
        testList.add(
                new Object[]{
                        new int[]{1, 0, 3, 0},
                        0,
                        new int[]{1, 3}
                });

        return testList;
    }

    @Test
    public void twoSum() {
        int[] result = new TwoSum().twoSum(nums, target);

        assertArrayEquals(expectationResult, result);
    }
}