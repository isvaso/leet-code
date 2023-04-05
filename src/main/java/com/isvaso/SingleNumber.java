package com.isvaso;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice
 * except for one. Find that single one.
 * <br><br>
 * You must implement a solution with a linear runtime complexity
 * and use only constant extra space.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for (int num : nums) if (!numsSet.add(num)) numsSet.remove(num);
        for (int j : numsSet) return j;
        return 0;
    }
}
