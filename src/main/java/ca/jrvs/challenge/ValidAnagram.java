package ca.jrvs.challenge;


import java.util.HashMap;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return false;
        }
        HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMap2 = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            //If we haven't added it to hashmap, then put it in with value=1
            if (hashMap1.get(c) == null) {
                hashMap1.put(c, 1);
            }
            // increment the current value for this key in hashmap by 1
            else {
                hashMap1.put(c, hashMap1.get(c) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            //If we haven't added it to hashmap, then put it in with value=1
            if (hashMap2.get(c) == null) {
                hashMap2.put(c, 1);
            } else {
                //increment the current value for this key in hashmap by 1
                hashMap2.put(c, hashMap2.get(c) + 1);
            }
        }
        if (hashMap1.equals(hashMap2)) {
            return true;
        } else {
            return false;
        }
    }
}
