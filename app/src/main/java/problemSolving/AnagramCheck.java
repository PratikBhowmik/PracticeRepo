package problemSolving;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean checkAnagram(String str1, String str2) {

        String trimmedString1 = str1.replaceAll(" ", "");
        String trimmedString2 = str2.replaceAll(" ", "");

        if (trimmedString1.length() != trimmedString2.length()) {
            return false;
        } else {
            char[] c1 = trimmedString1.toLowerCase().toCharArray();
            char[] c2 = trimmedString2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("RAT  ", "atr"));
    }
}
