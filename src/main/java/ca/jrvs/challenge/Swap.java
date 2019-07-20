package ca.jrvs.challenge;

/**
 * Swap Two Variable without using temporary Variable
 * Solution 1: Using Addition and Subtraction
 * Works But will result is Integer Overflow
 * a = a + b;
 * b = a - b;   // actually (a + b) - (b), so now b is equal to a
 * a = a - b;   // (a + b) -(a), now a is equal to b
 * <p>
 * Solution 2: Using XOR Trick
 * x = x ^ y;
 * y = x ^ y;   // now y = x
 * x = x ^ y;  // now x = y
 */
public class Swap {

    public static int[] swapVariable(int a, int b) {
        int[] result = new int[2];
        a = (a + b) - (b = a);
        result[0] = a;
        result[1] = b;
        return result;

    }

    public static int[] swapXOR(int a, int b) {
        int[] result = new int[2];
        a = a ^ b;
        b = a ^ b; // now b = a
        a = a ^ b; //now a=b
        result[0] = a;
        result[1] = b;
        return result;
    }

}
