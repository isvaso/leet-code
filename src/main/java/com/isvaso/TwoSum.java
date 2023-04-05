package com.isvaso;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <br><br>
 * You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.
 * <br><br>
 * You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] answerArray = {-1, -1};
        Map<Integer, Integer> answerMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++ ) {
            if (answerMap.containsKey(target - nums[i])) {
                answerArray[1] = i;
                answerArray[0] = answerMap.get(target - nums[i]);
                return answerArray;
            }
            answerMap.put(nums[i], i);
        }
        System.out.println(answerArray[0] + " " + answerArray[1]);
        return answerArray;
    }
}
