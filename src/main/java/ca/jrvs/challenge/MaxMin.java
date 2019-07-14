package ca.jrvs.challenge;

import java.util.Collections;
import java.util.HashSet;

public class MaxMin {
    public static int[] findMaxMin(int nums[]) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        result[0] = Collections.max(hashSet);
        result[1] = Collections.min(hashSet);
        return result;
    }
}

