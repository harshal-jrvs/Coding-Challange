package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularExpressionTest {
    private RegularExpression check;

    @Before
    public void setUp() {
        check = new RegularExpression();
    }

    @Test
    public void isDigit() {
        boolean test1 = check.isDigit("1234");
        assertTrue(test1);
        boolean test2 = check.isDigit("123fdf234");
        assertFalse(test2);
    }
}