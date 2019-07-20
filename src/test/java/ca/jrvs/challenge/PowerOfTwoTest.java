package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {
    private PowerOfTwo check;

    @Before
    public void setUp() {
        check = new PowerOfTwo();
    }

    @Test

    public void isPowerOfTwo() {
        boolean test1 = check.isPowerOfTwo(31);
        assertFalse(test1);
        boolean test2 = check.isPowerOfTwo(64);
        assertTrue(test2);
    }
}