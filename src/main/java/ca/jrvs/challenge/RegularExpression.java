package ca.jrvs.challenge;

/**
 * Check if a String Contains only Digit
 */
public class RegularExpression {

    public boolean isDigit(String id) {

        return id.matches("-?\\d+(\\.\\d+)?");
    }
}
