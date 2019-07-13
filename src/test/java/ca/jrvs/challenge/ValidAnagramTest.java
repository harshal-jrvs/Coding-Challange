package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {
    private static final String a = "anagram";
    private static final String b = "nagaram";
    private static final String c = "hello";
    private static final String z = "";
    private ValidAnagram check;

    @Before
    public void setUp() {
        check = new ValidAnagram();
    }

    @Test

    public void isAnagram() {
        boolean test1 = check.isAnagram(a, b);
        assertTrue(test1);
        boolean test2 = check.isAnagram(a, c);
        assertFalse(test2);
        boolean test3 = check.isAnagram(a, z);
        assertFalse(test3);

    }
}