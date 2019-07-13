package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    private static final String s = "A man, a plan, a canal: Panama";
    private static final String x = "A ma, a plan, a cnal: Panama";
    private static final String z = "";
    private ValidPalindrome check;

    @Before
    public void setUp() {
        check = new ValidPalindrome();
    }

    @Test
    public void isPalindrome() {

        boolean test1 = check.isPalindrome(this.s);
        assertTrue(test1);

        boolean test2 = check.isPalindrome(this.x);
        assertFalse(test2);

        boolean test3 = check.isPalindrome(this.z);
        assertTrue(test3);
    }
}