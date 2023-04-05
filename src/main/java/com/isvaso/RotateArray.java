package com.isvaso;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    public void rotateArray(int[] array, int startIndex, int endIndex) {
        int buffer;
        while (startIndex < endIndex) {
            buffer = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = buffer;
            startIndex++;
            endIndex--;
        }
    }
}
