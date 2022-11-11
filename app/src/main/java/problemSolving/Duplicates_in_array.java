package problemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicates_in_array {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7};
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicatelist = new ArrayList<>();
        ArrayList<Integer> uniquelist = new ArrayList<>();
        for (Integer i : a) {
            if (set.add(i)) {
                System.out.println(duplicatelist.add(i));
            }
        }
    }
}
