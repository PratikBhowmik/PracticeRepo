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
    //aaaaaa + bbbb -> ababababaa
    static String passCode(String A, String B) {
        String passcode = "";
        int min = Math.min(A.length(), B.length());
        for (int i = 0; i < min; i++) {
            passcode = passcode+A.charAt(i) + B.charAt(i);
        }
        passcode += A.substring(min)+B.substring(min);
        return passcode;
    }
}
