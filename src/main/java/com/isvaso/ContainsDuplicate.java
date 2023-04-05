package com.isvaso;

import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears
 * at least twice in the array, and return false if every element is distinct.
 * */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int i = 0;

        Arrays.sort(nums);

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) return true;
            else i++;
        }

        return false;
    }
}
