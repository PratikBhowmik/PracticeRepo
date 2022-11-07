package dsa;

import java.util.Scanner;

public class PassCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letters");
        String A = scan.nextLine();
        String B = scan.nextLine();
        System.out.println(passCode(A, B));
    }

    static String passCode(String A, String B) {
        String passcode = "";
        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                passcode = "" + passcode + A.charAt(i) + B.charAt(i);
            }
        } else if (A.length() != B.length()) {
            for (int i = 0; i < A.length(); i++) {
                passcode = "" + passcode + A.charAt(i) + B.charAt(i);
            }
        }
        return passcode;
    }
}
