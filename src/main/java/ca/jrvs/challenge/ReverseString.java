package ca.jrvs.challenge;

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