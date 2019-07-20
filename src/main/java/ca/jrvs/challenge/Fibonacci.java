package ca.jrvs.challenge;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 * <p>
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 * <p>
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 **/
public class Fibonacci {
    public int fib(int N) {
        if (N <= 1)
            return N;
        else
            return fib(N - 1) + fib(N - 2);
    }

    public int fib_DP(int N) {
        if (N <= 1)
            return N;

        int[] fib_cache = new int[N + 1];
        fib_cache[1] = 1;

        for (int i = 2; i <= N; i++) {
            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
        }
        return fib_cache[N];
    }
}