package ca.jrvs.challenge;

import java.util.HashSet;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,4,2,2]
 * Output: 2
 * Example 2:
 * <p>
 * Input: [3,1,3,4,2]
 * Output: 3
 */
public class DublicateNumber {

    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int dublicate = 0;
        for (int i : nums) {
            if (!hashSet.add(i)) {
                dublicate = i;
            }
        }
        return dublicate;
    }
}