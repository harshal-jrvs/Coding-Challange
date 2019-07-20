package ca.jrvs.challenge;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        return ((n & (n - 1)) == 0);
    }
}
