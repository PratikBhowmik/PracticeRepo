package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {
    static int minLength(String[] strs) {
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        return min;
    }

    public String longestCommonPrefix(String[] strs) {
        int minlength = minLength(strs);
        String result = "";
        char current;
        for (int i = 0; i < minlength; i++) {
            current = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != current) {
                    return result;
                }
            }
            result += current;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = in.readLine().split(" ");
        String prefixString = new LongestCommonPrefix().longestCommonPrefix(strings);
        System.out.print(prefixString);
    }
}
