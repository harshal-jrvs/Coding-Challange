package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private Fibonacci fb;

    @Before
    public void setUp() {
        fb = new Fibonacci();
    }

    @Test

    public void fb_num() {
        int test1 = fb.fib(4);
        assertEquals(3, test1);
        int test2 = fb.fib(10);
        assertEquals(55, test2);
        int test3 = fb.fib_DP(4);
        assertEquals(3, test3);
        int test4 = fb.fib_DP(10);
        assertEquals(55, test4);
    }
}