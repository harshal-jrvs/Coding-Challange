package ca.jrvs.challenge;

import java.util.HashMap;

public class DublicateCharacter {

    public static int findRepeatedCharacter(String s) {
        HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();

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

        for (char f : hashMap1.keySet()) {
            if (hashMap1.get(f) > 1) {
                System.out.println(f + ":" + hashMap1.get(f));
            }

        }
        return 0;

    }

}

