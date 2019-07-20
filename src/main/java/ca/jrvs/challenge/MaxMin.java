package ca.jrvs.challenge;

import java.util.Collections;
import java.util.HashSet;

/**
 * Find MAX and MIN number from an unsorted array
 */
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

    public static int[] largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int[] result = new int[2];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        result[0] = largest;
        result[1] = smallest;
        return result;
    }

}

