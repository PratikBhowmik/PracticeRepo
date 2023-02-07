package problemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesSplitTwo {
    public static void main(String[] args) {
        int[] input = {1, 1, 33, 33, 4, 5};
        ArrayList arrUniq = new ArrayList();
        ArrayList arrDup = new ArrayList();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            if (duplicates.add(i)) {
                arrUniq.add(input[i]);
            } else {
                if (arrUniq.contains(input[i])) {
                    arrUniq.remove(Integer.valueOf(input[i]));
                }
                if (!arrDup.contains(input[i])) {
                    arrDup.add(input[i]);
                }
            }
        }

        System.out.println(arrUniq);
        System.out.println(arrDup);
    }
}
