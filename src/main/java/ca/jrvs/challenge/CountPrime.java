package ca.jrvs.challenge;

public class CountPrime {
    public int countPrimes(int n) {
        boolean isPrime = true;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            } else
                count++;
        }
        return count;
    }
}
