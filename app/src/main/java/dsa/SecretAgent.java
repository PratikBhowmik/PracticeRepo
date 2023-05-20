package dsa;

import java.util.Scanner;

public class SecretAgent {
    static String secretAgentII(String s) {
        //StringBuffer sb = new StringBuffer();
        String[] newStr = s.split(" ");
        String result = "";
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].length() % 2 != 0) {
                StringBuffer sb = new StringBuffer();
                sb.append(newStr[i]);
                //sb.replace(0, newStr[i].length(), newStr[i]).reverse();
                //sb.append(newStr[i]).reverse();
                result += sb.reverse() + " ";
            } else {
                result += newStr[i] + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(secretAgentII(s));
    }
}
