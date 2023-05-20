package dsa;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxelementinArray {
    static int functionMaxe(int n, int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = -1;
        int finaltemp = -1;
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            if (map.containsKey(key)) {
                int oldvalue = map.get(key);
                map.put(key, oldvalue + 1);
            } else {
                map.put(key, 1);
            }

            if (map.get(key) == max) {
                if (finaltemp < key) {
                    finaltemp = key;
                }
            }

            if (map.get(key) >= max) {
                max = map.get(key);
                finaltemp = a[i];
            }
        }
        return finaltemp;
    }
}
