package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public String isPalindrome(String s) {
        String trimmed = s.replaceAll("[^A-Za-z0-9]", "");
        String reversed = "";
        int len = trimmed.length();
        char[] allChars = trimmed.toCharArray();
        for (int i = len - 1; i >= 0; i--) {
            reversed += allChars[i];
        }
        if (trimmed.equalsIgnoreCase(reversed)) {
            return "true";
        } else {
            return "false";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String result = new Palindrome().isPalindrome(line);
        System.out.print(result);
    }
}
