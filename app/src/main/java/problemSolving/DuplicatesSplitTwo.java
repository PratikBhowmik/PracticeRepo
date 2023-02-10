package problemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesSplitTwo {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 11, 12, 12};
        ArrayList arrUniq = new ArrayList();
        ArrayList arrDup = new ArrayList();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            if (duplicates.add(i)) {
                arrUniq.add(input[i]);
            } else if (arrUniq.contains(input[i])) {
                arrUniq.remove(Integer.valueOf(input[i]));
            } else if (!arrDup.contains(input[i])) {
                arrDup.add(input[i]);
            }
        }

        System.out.println(arrUniq);
        System.out.println(arrDup);
    }
}

//if (arrUniq.contains(input[i])) {
//        arrUniq.remove(Integer.valueOf(input[i]));
//        }
//        if (!arrDup.contains(input[i])) {
//        arrDup.add(input[i]);
//        }