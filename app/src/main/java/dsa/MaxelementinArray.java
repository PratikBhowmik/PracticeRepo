package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxelementinArray {
    static int functionMaxelementinArray(int n, int[] a) {
        Arrays.sort(a);
        int max_count = 1;
        int result = a[0];
        int curr_count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                curr_count++;
            } else {
                curr_count = 1;
            }
            if (curr_count > max_count) {
                max_count = curr_count;
                result = a[i - 1];
            }
        }
        return result;
    }
}
