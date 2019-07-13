package ca.jrvs.challenge;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }

        int[] x = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer diffrence = (Integer) (target - nums[i]);
            if (hashMap.containsKey(diffrence)) {
                x[0] = hashMap.get(diffrence);
                x[1] = i;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return x;
    }
}
