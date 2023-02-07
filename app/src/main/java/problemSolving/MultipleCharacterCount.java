package problemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleCharacterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the input String:-");
        String input = sc.nextLine();
        input = input.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        //Traverse through the String and put each
        // distinct character into the HashMap with frequency 1.
        //if any character is already present in hashmap
        //add 1 to it's frequency
        for (char c : input.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int freq = map.get(c);
                map.put(c, freq + 1);
            }
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
