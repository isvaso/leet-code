package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MoveZeroesTest {

    int[] nums;
    int[] expectationResult;

    public MoveZeroesTest(int[] nums, int[] expectationResult) {
        this.nums = nums;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection setTestParameters() {
        List<Object> testList = new ArrayList<>();

        testList.add(
                new Object[]{
                        new int[]{1, 0, 3, 0, 0, 0, 8, 1, 1, 5},
                        new int[]{1, 3, 8, 1, 1, 5, 0, 0, 0, 0}
                });
        testList.add(
                new Object[]{
                        new int[]{0, 1, 4, 2},
                        new int[]{1, 4, 2, 0}});
        testList.add(
                new Object[]{
                        new int[]{0, 0, 0, 1},
                        new int[]{1, 0, 0, 0}});
        testList.add(
                new Object[]{
                        new int[]{0},
                        new int[]{0}});

        return testList;
    }

    @Test
    public void moveZeroes() {
        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(expectationResult, nums);
    }
}