package com.isvaso;


/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element
 * appears only once. The relative order of the elements should be kept the same.
 * <br><br>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not
 * matter what you leave beyond the first k elements.
 * <br><br>
 * Return k after placing the final result in the first k slots of nums.
 * <br><br>
 * Do not allocate extra space for another array. You must do this
 * by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int i = 0;

        while (i < k - 1 && i + 1 < nums.length) {
            if (nums[i] == nums[i + 1]) {
                k--;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = -1;
            } else {
                i++;
            }
        }

        return k;
    }
}
