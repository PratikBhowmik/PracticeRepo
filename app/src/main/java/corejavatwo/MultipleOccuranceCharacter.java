package corejavatwo;

import java.util.HashMap;

public class MultipleOccuranceCharacter {
    public static void main(String[] args) {
        String str = "hello world";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c + " : " + charCount.get(c));
            }
        }
    }
}

