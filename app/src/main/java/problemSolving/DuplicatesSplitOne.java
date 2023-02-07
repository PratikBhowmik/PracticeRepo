package problemSolving;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesSplitOne {
    public static Set<Integer> findDuplicates(int[] input) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] == input[j] && i != j) {
                    duplicates.add(input[i]);
                    break;
                }
            }
        }
        return duplicates;
    }

    public static Set<Integer> findNonDuplicates(int[] input) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> nonDuplicates = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            if (mp.containsKey(input[i])) {
                mp.put(input[i], mp.get(input[i] + 1));
            } else {
                mp.put(input[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1)
                nonDuplicates.add(entry.getKey());
        }
        return nonDuplicates;

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 3, 4, 5};
        Set<Integer> dupli = findDuplicates(a);
        Set<Integer> nonDupli = findNonDuplicates(a);
        System.out.println(dupli);
        System.out.println(nonDupli);
    }
}
