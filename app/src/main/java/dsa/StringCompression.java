package dsa;
import java.util.Scanner;
public class StringCompression {
    public static String compress(String s) {
        //String newStr = s.replaceAll("\\s","");
        String compressed = "";
        int i;
        int count = 1;
        char currChar = s.charAt(0);
        for (i = 1; i < s.length(); i++){
            if (currChar == s.charAt(i)){
                count++;
            } else if(currChar != s.charAt(i)){
                compressed += s.charAt(i - 1);
                compressed += count;
                count = 1;
                currChar = s.charAt(i);
            }
        }
        compressed += s.charAt(i - 1);
        compressed += count;
        if (compressed.length() >= s.length()){
            return s;
        }
        return compressed;
        // char currChar = s.charAt(i);

        //   for (int j = i + 1; j < newStr.length(); j++){

        //     char anyOtherChar = newStr.charAt(j);

        //     if (currChar == anyOtherChar){

        //       count += 1;

        //     }

        //   }

        //   compressed += newStr.charAt(i).toString() + count.toString();

        // }

        //return compressed;
    }
    public static void  main (String args []) {
        Scanner sc =  new  Scanner (System.in);
        String s = new String();
        s = sc.next();

        int n = s.length();
        String ans = compress(s);
        System.out.print(ans);
    }
}
