package ca.jrvs.challenge;

/**
 * Given an input string, reverse the string word by word.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * <p>
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 * <p>
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * <p>
 * <p>
 * Note:
 * <p>
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseString {
    public String reverseWords(String s) {
        String[] trimmed = s.trim().split("\\s+");
        String out = new String();

        for (int i = trimmed.length - 1; i > 0; i--) {
            if (i != 1) {
                out += trimmed[i] + " ";
            } else {
                out += trimmed[0];
            }
        }
        return out;
    }
}