package com.isvaso;

/**
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * <br><br>
 * Note that you must do this in-place without making a copy of the array.
 */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int i = 0;

        if (nums.length <= 1) return;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != 0 && nums[i] == 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            } else if (nums[i] != 0) i++;
        }
    }
}
