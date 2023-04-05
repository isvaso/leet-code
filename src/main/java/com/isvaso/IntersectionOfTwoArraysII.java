package com.isvaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * <br><br>
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if (nums1.length < nums2.length){}

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersectionList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] returnArray = new int[intersectionList.size()];

        for (int y = 0; y < intersectionList.size(); y++) {
            returnArray[y] = intersectionList.get(y);
        }

        return returnArray;
    }
}
