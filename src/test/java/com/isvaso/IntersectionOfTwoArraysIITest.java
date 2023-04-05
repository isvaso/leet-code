package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IntersectionOfTwoArraysIITest {

    int[] nums1;
    int[] nums2;
    int[] expectationResult;

    public IntersectionOfTwoArraysIITest(
            int[] nums1, int[] nums2, int[] expectationResult) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection testNums() {
        List<Object> testList = new ArrayList<>();

        testList.add(
                new Object[]{
                        new int[]{4, 5},
                        new int[]{6, 4, 6, 4, 5},
                        new int[]{4, 5}
                });
        testList.add(
                new Object[]{
                        new int[]{1, 2},
                        new int[]{0, 3},
                        new int[]{}
                });
        testList.add(
                new Object[]{
                        new int[]{1, 6},
                        new int[]{6, 1, 6, 1, 5},
                        new int[]{1, 6}
                });

        return testList;
    }

    @Test
    public void intersect() {
        int[] result = new IntersectionOfTwoArraysII().intersect(nums1, nums2);

        assertArrayEquals(expectationResult, result);
    }
}
